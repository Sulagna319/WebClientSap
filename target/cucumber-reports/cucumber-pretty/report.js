$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WebViewer.feature");
formatter.feature({
  "line": 1,
  "name": "Saperion Web Client Viewer annotations Page Tests",
  "description": "",
  "id": "saperion-web-client-viewer-annotations-page-tests",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 121,
  "name": "Validate the functionality of picture controls in Saperion webClient Viewer",
  "description": "",
  "id": "saperion-web-client-viewer-annotations-page-tests;validate-the-functionality-of-picture-controls-in-saperion-webclient-viewer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 120,
      "name": "@webViewerPictureControls"
    }
  ]
});
formatter.step({
  "line": 122,
  "name": "User is on Saperion Web Client Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 123,
  "name": "User should able to see the Application",
  "keyword": "Then "
});
formatter.step({
  "line": 124,
  "name": "User Click on Application",
  "keyword": "When "
});
formatter.step({
  "line": 125,
  "name": "User click on Result button",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "User right Click on the file in resultlist",
  "keyword": "When "
});
formatter.step({
  "line": 127,
  "name": "User click on View button",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "User able to see the view Document Window",
  "keyword": "Then "
});
formatter.step({
  "line": 129,
  "name": "select  \"\u003cPictureControl\u003e\" option",
  "keyword": "Then "
});
formatter.step({
  "line": 130,
  "name": "close file with change",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "check for alert",
  "keyword": "Then "
});
formatter.examples({
  "line": 132,
  "name": "",
  "description": "",
  "id": "saperion-web-client-viewer-annotations-page-tests;validate-the-functionality-of-picture-controls-in-saperion-webclient-viewer;",
  "rows": [
    {
      "cells": [
        "PictureControl"
      ],
      "line": 133,
      "id": "saperion-web-client-viewer-annotations-page-tests;validate-the-functionality-of-picture-controls-in-saperion-webclient-viewer;;1"
    },
    {
      "cells": [
        "Gamma"
      ],
      "line": 134,
      "id": "saperion-web-client-viewer-annotations-page-tests;validate-the-functionality-of-picture-controls-in-saperion-webclient-viewer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 24723474900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User should Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Web Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User give credentials \"administrator\" and \"qa\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user select appropriate tenant \"system\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Check for Duplicate Session",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User will sign on successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebLoginStepDef.user_is_on_Web_Login_Page()"
});
formatter.result({
  "duration": 389217401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "administrator",
      "offset": 23
    },
    {
      "val": "qa",
      "offset": 43
    }
  ],
  "location": "WebLoginStepDef.user_give_credentials_and(String,String)"
});
formatter.result({
  "duration": 2676161401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "system",
      "offset": 32
    }
  ],
  "location": "WebLoginStepDef.user_select_appropriate_tenant(String)"
});
formatter.result({
  "duration": 2255271799,
  "status": "passed"
});
formatter.match({
  "location": "WebLoginStepDef.user_click_on_Login_Button()"
});
formatter.result({
  "duration": 174739199,
  "status": "passed"
});
formatter.match({
  "location": "WebLoginStepDef.user_check_for_duplicate_session()"
});
formatter.result({
  "duration": 1017961400,
  "status": "passed"
});
formatter.match({
  "location": "WebLoginStepDef.user_will_sign_on_successfully()"
});
formatter.result({
  "duration": 10643800,
  "status": "passed"
});
formatter.scenario({
  "line": 134,
  "name": "Validate the functionality of picture controls in Saperion webClient Viewer",
  "description": "",
  "id": "saperion-web-client-viewer-annotations-page-tests;validate-the-functionality-of-picture-controls-in-saperion-webclient-viewer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 120,
      "name": "@webViewerPictureControls"
    }
  ]
});
formatter.step({
  "line": 122,
  "name": "User is on Saperion Web Client Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 123,
  "name": "User should able to see the Application",
  "keyword": "Then "
});
formatter.step({
  "line": 124,
  "name": "User Click on Application",
  "keyword": "When "
});
formatter.step({
  "line": 125,
  "name": "User click on Result button",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "User right Click on the file in resultlist",
  "keyword": "When "
});
formatter.step({
  "line": 127,
  "name": "User click on View button",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "User able to see the view Document Window",
  "keyword": "Then "
});
formatter.step({
  "line": 129,
  "name": "select  \"Gamma\" option",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 130,
  "name": "close file with change",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "check for alert",
  "keyword": "Then "
});
formatter.match({
  "location": "WebHomePageStepDef.user_is_on_Saperion_Web_Client_Home_Page()"
});
formatter.result({
  "duration": 85948499,
  "status": "passed"
});
formatter.match({
  "location": "WebHomePageStepDef.user_should_able_to_see_the_Application()"
});
formatter.result({
  "duration": 60761700,
  "status": "passed"
});
formatter.match({
  "location": "WebHomePageStepDef.user_Click_on_application()"
});
formatter.result({
  "duration": 113826899,
  "status": "passed"
});
formatter.match({
  "location": "WebHomePageStepDef.user_click_on_Result_button()"
});
formatter.result({
  "duration": 2191576100,
  "status": "passed"
});
formatter.match({
  "location": "WebHomePageStepDef.User_right_Click_on_the_file_in_resultlist()"
});
formatter.result({
  "duration": 1472336701,
  "status": "passed"
});
formatter.match({
  "location": "WebHomePageStepDef.user_click_on_view_button()"
});
formatter.result({
  "duration": 4056531301,
  "status": "passed"
});
formatter.match({
  "location": "WebAnnotationStepDef.User_able_to_see_the_view_Document_Window()"
});
formatter.result({
  "duration": 3091443600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gamma",
      "offset": 9
    }
  ],
  "location": "WebViewerStepDef.select_something_option(String)"
});
formatter.result({
  "duration": 12330834501,
  "status": "passed"
});
formatter.match({
  "location": "WebViewerStepDef.close_file_with_change()"
});
formatter.result({
  "duration": 3135743200,
  "status": "passed"
});
formatter.match({
  "location": "WebViewerStepDef.check_for_alert()"
});
formatter.result({
  "duration": 3074967099,
  "status": "passed"
});
formatter.after({
  "duration": 1061455400,
  "status": "passed"
});
});