$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/MyFeauture.feature");
formatter.feature({
  "name": "Reset functionality on login page of Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SignUpFeature"
    }
  ]
});
formatter.scenario({
  "name": "Verification of Reset button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SignUpFeature"
    }
  ]
});
formatter.step({
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.enter_the_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Reset_the_credential()"
});
formatter.result({
  "status": "passed"
});
});