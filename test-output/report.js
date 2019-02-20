$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/Automation/Automation/src/main/java/qa/feature/Trade.feature");
formatter.feature({
  "line": 1,
  "name": "Trade Feature",
  "description": "",
  "id": "trade-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Traded Instrument List",
  "description": "",
  "id": "trade-feature;traded-instrument-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Instrument details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Trades details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters from date \u003cFrom Date\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters to date \u003cTo Date\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Traded Instrument list with volume displayed.",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "trade-feature;traded-instrument-list;",
  "rows": [
    {
      "cells": [
        "From Date",
        "To Date"
      ],
      "line": 15,
      "id": "trade-feature;traded-instrument-list;;1"
    },
    {
      "cells": [
        "01/01/2017",
        "31/01/2018"
      ],
      "line": 16,
      "id": "trade-feature;traded-instrument-list;;2"
    },
    {
      "cells": [
        "01/01/2014",
        "31/01/2016"
      ],
      "line": 17,
      "id": "trade-feature;traded-instrument-list;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 846652,
  "status": "passed"
});
formatter.before({
  "duration": 111550,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Traded Instrument List",
  "description": "",
  "id": "trade-feature;traded-instrument-list;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Instrument details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Trades details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters from date 01/01/2017",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters to date 31/01/2018",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Traded Instrument list with volume displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "TradeSteps.instrument_details_list_available()"
});
formatter.result({
  "duration": 1144497792,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.trades_details_list_available()"
});
formatter.result({
  "duration": 307406,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/01/2017",
      "offset": 22
    }
  ],
  "location": "TradeSteps.user_enters_from_date(String)"
});
formatter.result({
  "duration": 13337206,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "31/01/2018",
      "offset": 20
    }
  ],
  "location": "TradeSteps.user_enters_to_date(String)"
});
formatter.result({
  "duration": 246747,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.traded_Instrument_list_with_volume_displayed()"
});
formatter.result({
  "duration": 197133619,
  "status": "passed"
});
formatter.after({
  "duration": 90474,
  "status": "passed"
});
formatter.before({
  "duration": 279647,
  "status": "passed"
});
formatter.before({
  "duration": 28273,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Traded Instrument List",
  "description": "",
  "id": "trade-feature;traded-instrument-list;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Instrument details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Trades details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters from date 01/01/2014",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters to date 31/01/2016",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Traded Instrument list with volume displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "TradeSteps.instrument_details_list_available()"
});
formatter.result({
  "duration": 209222,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.trades_details_list_available()"
});
formatter.result({
  "duration": 280675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/01/2014",
      "offset": 22
    }
  ],
  "location": "TradeSteps.user_enters_from_date(String)"
});
formatter.result({
  "duration": 360868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "31/01/2016",
      "offset": 20
    }
  ],
  "location": "TradeSteps.user_enters_to_date(String)"
});
formatter.result({
  "duration": 301752,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.traded_Instrument_list_with_volume_displayed()"
});
formatter.result({
  "duration": 1821818,
  "status": "passed"
});
formatter.after({
  "duration": 129543,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Non Instrument List",
  "description": "",
  "id": "trade-feature;non-instrument-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Instrument details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Trades details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enters from date \u003cFrom Date\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enters to date \u003cTo Date\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Traded Instrument list with volume",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Not Traded Instrument list displayed.",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "trade-feature;non-instrument-list;",
  "rows": [
    {
      "cells": [
        "From Date",
        "To Date"
      ],
      "line": 31,
      "id": "trade-feature;non-instrument-list;;1"
    },
    {
      "cells": [
        "01/01/2017",
        "31/01/2018"
      ],
      "line": 32,
      "id": "trade-feature;non-instrument-list;;2"
    },
    {
      "cells": [
        "01/01/2014",
        "31/01/2016"
      ],
      "line": 33,
      "id": "trade-feature;non-instrument-list;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 280161,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Non Instrument List",
  "description": "",
  "id": "trade-feature;non-instrument-list;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Instrument details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Trades details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enters from date 01/01/2017",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enters to date 31/01/2018",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Traded Instrument list with volume",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Not Traded Instrument list displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "TradeSteps.instrument_details_list_available()"
});
formatter.result({
  "duration": 187630,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.trades_details_list_available()"
});
formatter.result({
  "duration": 277591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/01/2017",
      "offset": 22
    }
  ],
  "location": "TradeSteps.user_enters_from_date(String)"
});
formatter.result({
  "duration": 353157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "31/01/2018",
      "offset": 20
    }
  ],
  "location": "TradeSteps.user_enters_to_date(String)"
});
formatter.result({
  "duration": 317687,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.traded_Instrument_list_with_volume()"
});
formatter.result({
  "duration": 2409385,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.not_Traded_Instrument_list_displayed()"
});
formatter.result({
  "duration": 789591,
  "status": "passed"
});
formatter.after({
  "duration": 111037,
  "status": "passed"
});
formatter.before({
  "duration": 312547,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Non Instrument List",
  "description": "",
  "id": "trade-feature;non-instrument-list;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Instrument details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Trades details list available",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enters from date 01/01/2014",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enters to date 31/01/2016",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Traded Instrument list with volume",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Not Traded Instrument list displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "TradeSteps.instrument_details_list_available()"
});
formatter.result({
  "duration": 186089,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.trades_details_list_available()"
});
formatter.result({
  "duration": 221558,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/01/2014",
      "offset": 22
    }
  ],
  "location": "TradeSteps.user_enters_from_date(String)"
});
formatter.result({
  "duration": 338249,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "31/01/2016",
      "offset": 20
    }
  ],
  "location": "TradeSteps.user_enters_to_date(String)"
});
formatter.result({
  "duration": 335165,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.traded_Instrument_list_with_volume()"
});
formatter.result({
  "duration": 1905095,
  "status": "passed"
});
formatter.match({
  "location": "TradeSteps.not_Traded_Instrument_list_displayed()"
});
formatter.result({
  "duration": 186088,
  "status": "passed"
});
formatter.after({
  "duration": 143422,
  "status": "passed"
});
});