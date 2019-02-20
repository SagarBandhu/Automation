package qa.stepDefinations;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



import java.util.Date;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TradeSteps {

  File instFile_path = new File("C:\\Users\\HP\\git\\Automation\\Automation\\src\\main\\java\\qa\\testdata\\inst.txt");
  File tradesFile_path = new File("C:\\Users\\HP\\git\\Automation\\Automation\\src\\main\\java\\qa\\testdata\\trades.txt");

  public BufferedReader instr_br;
  public BufferedReader trades_br;

  public String ins = "";
  public String tdr = "";

  public Timestamp from_Date = null;
  public Timestamp to_Date = null;

  public HashMap<Integer, HashMap<String, String>> trades_map = null;
  public HashMap<String, String> instr_map = null;
  public HashMap<String, Integer> instr_traded = null;
  public static ArrayList<String> tradedIns = null;
  public static HashSet<String> notTradedIns = null;
  
  public HashMap<String,Integer> expected_list = new HashMap<>();
  

  
  @Before("@Test1")
  public void expected_list() {
    expected_list.put("IN1", 650);
    expected_list.put("IN2", 560);
    expected_list.put("IN3", 60);
  }
  
  @Before
  public void setup() {
    

    try {
      instr_br = new BufferedReader(new FileReader(instFile_path));
      trades_br = new BufferedReader(new FileReader(tradesFile_path));

    }

    catch (Exception e) {

    }

    tradedIns   = new ArrayList<String>();
    notTradedIns   = new HashSet<String>();
    
  }

  @Given("^Instrument details list available$")
  public void instrument_details_list_available() {
    instr_map = new HashMap<String, String>();

    try {
      instr_br.readLine();
      while ((ins = instr_br.readLine()) != null) {
        String[] str = ins.split(",");
        instr_map.put(str[0], str[1]);
      }
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    

  }

  @Given("^Trades details list available$")
  public void trades_details_list_available() {

    try {
      trades_map = new HashMap<Integer, HashMap<String, String>>();
      trades_br.readLine();
      int line = 1;
      while ((tdr = trades_br.readLine()) != null) {
        HashMap<String, String> lineData = new HashMap<String, String>();
        String[] str = tdr.split(",");

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

    } catch (Exception e) {

    }
    
  }

  @When("^User enters from date (.*)$")
  public void user_enters_from_date(String fromDate) {

    try {
      Date fDate = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
      from_Date = new Timestamp(fDate.getTime());
    } catch (Exception e) {

    }
    

  }

  @When("^User enters to date (.*)$")
  public void user_enters_to_date(String toDate) {
    try {
      Date fDate = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
      to_Date = new Timestamp(fDate.getTime());
    } catch (Exception e) {

    }
    
  }

  @Then("^Traded Instrument list with volume displayed\\.$")
  public void traded_Instrument_list_with_volume_displayed() {
    instr_traded = new HashMap<>();
    trades_map.forEach((K, Trade) -> {
      Date tdate = null;
      String tradeDate = Trade.get("TradeDtTime");
      try {
        tdate = new SimpleDateFormat("dd/MM/yyyy").parse(tradeDate);

      } catch (Exception e) {

      }
      Timestamp tradeDatetime = new Timestamp(tdate.getTime());
      if (tradeDatetime.after(from_Date) && tradeDatetime.before(to_Date)) {

        String instructionID = Trade.get("InID");
        Integer qty = Integer.parseInt(Trade.get("qty"));
        
        if (instr_traded != null && instr_traded.containsKey(instructionID)) {
          instr_traded.put(instructionID, instr_traded.get(instructionID) + qty);
          
        } else {
          instr_traded.put(instructionID, qty);
          
        }

        
        tradedIns.add(instructionID);
      }
    });
    
    System.out.println("******Traded Instrument List******");
    
  instr_traded.forEach((K,V)->{
      System.out.println("Instrument-->  "+instr_map.get(K) +"  Volume-->  "+ instr_traded.get(K));
      
    });

   //Assert.assertEquals(instr_traded, expected_list,"Test Passed");
    
  }
  
  
  @When("^Traded Instrument list with volume$")
  public void traded_Instrument_list_with_volume()  {
    instr_traded = new HashMap<>();
    trades_map.forEach((K, Trade) -> {
      Date tdate = null;
      String tradeDate = Trade.get("TradeDtTime");
      try {
        tdate = new SimpleDateFormat("dd/MM/yyyy").parse(tradeDate);

      } catch (Exception e) {

      }
      Timestamp tradeDatetime = new Timestamp(tdate.getTime());
      if (tradeDatetime.after(from_Date) && tradeDatetime.before(to_Date)) {

        String instructionID = Trade.get("InID");
        Integer qty = Integer.parseInt(Trade.get("qty"));
        
        if (instr_traded != null && instr_traded.containsKey(instructionID)) {
          instr_traded.put(instructionID, instr_traded.get(instructionID) + qty);
          
        } else {
          instr_traded.put(instructionID, qty);
          
        }

        
        tradedIns.add(instructionID);
      }
    });
      
  }

  
  @Then("^Not Traded Instrument list displayed\\.$")
  public void not_Traded_Instrument_list_displayed() {
     
    trades_map.forEach((K,Trade)->{
       String t = Trade.get("InID");
       
      
      if(!tradedIns.contains(t) && !notTradedIns.contains(t)) {
      //System.out.println("Instrument-->  "+instr_map.get(t) );
      notTradedIns.add(instr_map.get(t));
      }
    }); 
    System.out.println("******Not Traded Instrument List******");
    System.out.println(notTradedIns);
    //Assert.assertEquals(notTradedIns.contains("Apple"),true);
  }

  @After
  public void tearDown() {
    try {
      
      instr_br.close(); 
      trades_br.close();

    } catch (Exception e) {

    }
  }

}
