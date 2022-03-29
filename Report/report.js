$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/Cucumber/src/test/resources/Login.feature");
formatter.feature({
  "name": "Validate Full End To End Functionality  for demo Blaze",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating full functionality with all correct details",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Select departure and destination city",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.selectDepartureAndDestinationCity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click find flights",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userShouldClickFindFlights()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click first choose this flight",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userShouldClickFirstChooseThisFlight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Name address city state zipcode",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userEntersNameAddressCityStateZipcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select card type",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userShouldSelectCardType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Creditcard no month year Name on Card",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userShouldSelectCreditcardNoMonthYearNameOnCard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click remember me check box and click purchase flight",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userClickRememberMeCheckBoxAndClickPurchaseFlight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Copy the order id and write into excel",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.copyTheOrderIdAndWriteIntoExcel()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdef.StepDefinition.copyTheOrderIdAndWriteIntoExcel(StepDefinition.java:117)\r\n\tat ✽.Copy the order id and write into excel(E:/Selenium/Cucumber/src/test/resources/Login.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});