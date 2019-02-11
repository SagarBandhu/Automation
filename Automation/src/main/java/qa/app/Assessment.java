package qa.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assessment {
  
  File instFile_path= new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\main\\java\\qa\\testdata\\inst.txt");
  File tradesFile_path=new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\main\\java\\qa\\testdata\\trades.txt");
  
  private BufferedReader instr_br;
  private BufferedReader trades_br;
  
  private String ins="";
  private String tdr="";
  
  private static Timestamp from_Date=null;
  private static Timestamp to_Date=null;
  
  private HashMap<Integer,HashMap<String,String>> trades_map=null;
  private HashMap<String,String> instr_map=null;
  private HashMap<String,String> instr_traded=null;
  static ArrayList<String> tradedIns = new ArrayList<String>();
  
  
 /*Method for Opening and reading files*/ 
  public void openAndReadFiles()  {
    
    
     try {
       instr_br = new BufferedReader(new FileReader(instFile_path));
       trades_br = new BufferedReader(new FileReader(tradesFile_path));
     
     
     
    
      /*Reading Inst.txt file*/
      instr_map = new HashMap<String,String>();

      instr_br.readLine();
        while((ins=instr_br.readLine())!=null) {
          String [] str= ins.split(",");
          instr_map.put(str[0], str[1]);
     }
    
   
     /*Reading Trades.txt file*/
   
     trades_map = new HashMap<Integer,HashMap<String,String>>();
     trades_br.readLine();
     int line=1;
     while((tdr=trades_br.readLine())!=null) {
       HashMap<String,String> lineData = new HashMap<String,String>();
       String [] str= tdr.split(",");
    
       lineData.put("TradeId", str[0]);
       lineData.put("TradeDtTime", str[1]);
       lineData.put("InID", str[2]);
       lineData.put("qty", str[3]);
       lineData.put("price", str[4]);
       lineData.put("amount", str[5]);
       lineData.put("trader", str[6]);
       trades_map.put(line, lineData);
       line++;
       }
     }  
     catch(Exception e) {
       System.out.println(e.getMessage());
     }
      
 
  }
  
    /*Method for getting Instrument List which are not Traded */
  
    public void getTradedInstrDetails(Timestamp from_Date,Timestamp to_Date) {
      int i =0;
      trades_map.forEach((K,Trade)->{
        String tradeDate=  Trade.get("TradeDtTime");
        Timestamp tradeDatetime=convertStringToTimestamp(tradeDate);
        if(tradeDatetime.after(from_Date)&&tradeDatetime.before(to_Date) ) {
          
          String instructionID=Trade.get("InID");
          String qty=Trade.get("qty");
          
          System.out.println("Instrument-->  "+instr_map.get(instructionID) +"  Volume-->  "+ qty);  
          tradedIns.add(instructionID);
          }
    });    
}
  
        /*Method for getting Instrument List which are not Traded */
  
         public void getNotTradedInstrDetails(ArrayList tradeIns) {
             int i =0;
              trades_map.forEach((K,Trade)->{
                 String t = Trade.get("InID");

                 if(!tradeIns.contains(t)) {
                 System.out.println("Instrument-->  "+instr_map.get(t) );
                 }
                 
               });
    
              
          }
  
         /*Method Converting String Date to Date Timestamp*/
         
         public static Timestamp convertStringToTimestamp(String str_date) {
           try {
             DateFormat formatter;
             formatter = new SimpleDateFormat("dd/MM/yyyy");
             Date date = (Date) formatter.parse(str_date);
             java.sql.Timestamp timeStampDate = new Timestamp(date.getTime());
             return timeStampDate;
             } catch (ParseException e) {
             System.out.println("Exception :" + e);
             return null;
             }
         }//End of convertStringToTimestamp

  
         /*Method for Closing Buffered Reader*/
         
         public void closeFiles()  {
           try {
             instr_br.close();
             trades_br.close();
           }
           
           catch(Exception e) {
             System.out.println(e.getMessage());
           }
            
     }
         
         /* Main Method */
         public static void main(String[] args)  {
    
           Assessment as = new Assessment();
           as.openAndReadFiles();
           
           
           /*Accepting From date and To Date from User*/
           try {
           
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter From Date(dd/MM/yyyy) in format:");
           from_Date=convertStringToTimestamp(sc.nextLine());
           
           System.out.println("Enter To Date(dd/MM/yyyy)in format:");
           to_Date=convertStringToTimestamp(sc.nextLine());
           
           }
           
           catch(Exception e) {
             
             System.out.println(e.getMessage());
             
           }
           
           System.out.println("******Traded Instrument List******");
           as.getTradedInstrDetails(from_Date, to_Date);
           
           System.out.println("******Non-Traded Instrument List******");
           as.getNotTradedInstrDetails(tradedIns);
           
           
           as.closeFiles();
         }// End of main method

   
}//End of Class
