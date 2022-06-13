$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_WorkSpace/BDD/src/main/java/feature/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Contact",
  "description": "",
  "id": "free-crm-create-contact",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new contact scenarios",
  "description": "",
  "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is present on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is \"CRMPRO - CRM software for customer relationship management, sales, and support.\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "binalpatel",
        "9@9RJFprTypdbyN"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Home Page \"CRMPRO\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to a new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter deal detail",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "quite Browser",
  "keyword": "And "
});
formatter.match({
  "location": "DealStepDefination.User_on_login_page()"
});
formatter.result({
  "duration": 6866037700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRMPRO - CRM software for customer relationship management, sales, and support.",
      "offset": 24
    }
  ],
  "location": "DealStepDefination.title_of_login_page_is(String)"
});
formatter.result({
  "duration": 13249400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 183816300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 1874457400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRMPRO",
      "offset": 22
    }
  ],
  "location": "DealStepDefination.user_is_on_Home_Page(String)"
});
formatter.result({
  "duration": 9723100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_moves_to_a_new_deal_page()"
});
formatter.result({
  "duration": 761804500,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_enter_deal_detail(DataTable)"
});
formatter.result({
  "duration": 237045400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.quite_Browser()"
});
formatter.result({
  "duration": 717247100,
  "status": "passed"
});
});