$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gost_Register.feature");
formatter.feature({
  "id": "register-action",
  "description": "",
  "name": "Register Action",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "register-action;register-into-gost",
  "description": "",
  "name": "Register into Gost",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "User enters Registration Details",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "Message displayed Register Successfully",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "CommonSD.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 13096623287,
  "status": "passed"
});
formatter.match({
  "location": "CommonSD.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 52159989,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSD.user_enters_Registration_Details()"
});
formatter.result({
  "duration": 8338105951,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSD.message_displayed_Register_Successfully()"
});
formatter.result({
  "duration": 1709801259,
  "status": "passed"
});
formatter.scenario({
  "id": "register-action;successful-logout",
  "description": "",
  "name": "Successful LogOut",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "User LogOut from the Application",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "CommonSD.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 821853036,
  "status": "passed"
});
formatter.match({
  "location": "CommonSD.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 45571714,
  "status": "passed"
});
formatter.uri("gost_login.feature");
formatter.feature({
  "id": "login-action",
  "description": "",
  "name": "Login Action",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "login-action;successful-login-with-valid-credentials",
  "description": "",
  "name": "Successful Login with Valid Credentials",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "User enters UserName and Password",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "CommonSD.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 11048194758,
  "status": "passed"
});
formatter.match({
  "location": "CommonSD.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 49654720,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 4155897759,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 1527441959,
  "status": "passed"
});
formatter.scenario({
  "id": "login-action;successful-logout",
  "description": "",
  "name": "Successful LogOut",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "User LogOut from the Application",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "CommonSD.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 2294695959,
  "status": "passed"
});
formatter.match({
  "location": "CommonSD.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 54287934,
  "status": "passed"
});
});