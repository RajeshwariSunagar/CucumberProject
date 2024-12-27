package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {
		"com.stepDefination" }, monochrome = true, plugin = { "pretty", "html:target/cucumber-html-report.html",
				"json: JsonReports/cucumber-json-report.json",
				"junit: XMlReports/cucumber-xml-report.xml" }, dryRun = false)

public class Runner {

}
