$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Documentations.feature");
formatter.feature({
  "line": 1,
  "name": "Documentation Test Details",
  "description": "",
  "id": "documentation-test-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Documentation Test Scenarios",
  "description": "",
  "id": "documentation-test-details;documentation-test-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user validate the sublinks in current page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Documentation.user_launch_the_browser()"
});
formatter.result({
  "duration": 46690936015,
  "status": "passed"
});
formatter.match({
  "location": "Documentation.user_validate_the_sublinks_in_current_page()"
});
formatter.result({
  "duration": 166452797053,
  "status": "passed"
});
formatter.match({
  "location": "Documentation.user_close_the_browser()"
});
formatter.result({
  "duration": 1305902673,
  "status": "passed"
});
});