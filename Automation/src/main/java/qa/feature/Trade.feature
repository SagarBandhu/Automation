Feature: Trade Feature

Scenario: Traded Instrument List with Volume

   Given Trades file has trade transaction details
   Given Instrument file has master instrument list
     
     When User enters From Date
     When User enters To Date
     
   Then Instrument List with traded volume should displayed

Scenario: Not Traded Instrument List

   Given Trades file has trade transaction details
   Given Instrument file has master instrument list
     
     When User enters From Date
     When User enters To Date
     
   Then Not Traded Instrument List should displayed
   
 
 
 
Scenario Outline: Only Non traded instrument list displayed when no trade executed between <From Date> and <To Date>  
Given Trades file has trade transaction details
   Given Instrument file has master instrument list
     
     When User enters <From Date> and <To Date> 
     
   Then Traded Instrument List should be empty  
   Then Non Traded instrument list should displayed
   
  Examples:
  |From Date | To Date  |
  |01/01/2001|01/12/2001| 
  |05/01/2019|02/02/2019|
  
