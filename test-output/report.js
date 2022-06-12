$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_WorkSpace/BDD/src/main/java/feature/contacts.feature");
formatter.feature({
  "line": 3,
  "name": "Free CRM Create Contact",
  "description": "",
  "id": "free-crm-create-contact",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Free CRM Create a new contact scenarios",
  "description": "",
  "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenarios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is present on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is \"CRMPRO - CRM software for customer relationship management, sales, and support.\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on Home Page \"CRMPRO\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to a new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter \"\u003cfirstname\u003e\",\"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "quite Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenarios;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 16,
      "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenarios;;1"
    },
    {
      "cells": [
        "binalpatel",
        "9@9RJFprTypdbyN",
        "kk",
        "kk",
        "kk"
      ],
      "line": 17,
      "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenarios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Free CRM Create a new contact scenarios",
  "description": "",
  "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenarios;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is present on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is \"CRMPRO - CRM software for customer relationship management, sales, and support.\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter \"binalpatel\" and \"9@9RJFprTypdbyN\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on Home Page \"CRMPRO\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to a new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter \"kk\",\"kk\" and \"kk\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "quite Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.User_on_login_page()"
});
formatter.result({
  "duration": 6831106600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRMPRO - CRM software for customer relationship management, sales, and support.",
      "offset": 24
    }
  ],
  "location": "LoginStepDefination.title_of_login_page_is(String)"
});
formatter.result({
  "duration": 7775100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "binalpatel",
      "offset": 12
    },
    {
      "val": "9@9RJFprTypdbyN",
      "offset": 29
    }
  ],
  "location": "LoginStepDefination.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 121467000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 2158733500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRMPRO",
      "offset": 22
    }
  ],
  "location": "LoginStepDefination.user_is_on_Home_Page(String)"
});
formatter.result({
  "duration": 9570200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_moves_to_a_new_contact_page()"
});
formatter.result({
  "duration": 1060312800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kk",
      "offset": 12
    },
    {
      "val": "kk",
      "offset": 17
    },
    {
      "val": "kk",
      "offset": 26
    }
  ],
  "location": "LoginStepDefination.user_enter_and(String,String,String)"
});
formatter.result({
  "duration": 964274400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.quite_Browser()"
});
formatter.result({
  "duration": 722842500,
  "status": "passed"
});
});