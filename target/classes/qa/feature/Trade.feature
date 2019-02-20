Feature: Trade Feature

@Test1
Scenario Outline: Traded Instrument List

   Given Instrument details list available
   Given Trades details list available
     When User enters from date <From Date>
     When User enters to date <To Date>
     
     Then Traded Instrument list with volume displayed.
      
     
Examples:
|From Date | To Date |
|01/01/2017|31/01/2018|
|01/01/2014|31/01/2016|

@Test2
Scenario Outline:Non Instrument List

   Given Instrument details list available
   Given Trades details list available
     When User enters from date <From Date>
     When User enters to date <To Date>
     When Traded Instrument list with volume
     
      Then Not Traded Instrument list displayed.
     
Examples:
|From Date | To Date |
|01/01/2017|31/01/2018|
|01/01/2014|31/01/2016|
