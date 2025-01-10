package com.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) @CucumberOptions( features = "C:\\Users\\rajes\\git\\repository2\\CucumberProj\\src\\test\\resources\\Features", 
glue = {"com.stepDefination"}, monochrome = true, 
plugin = { "pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json", "junit:target/cucumber-xml-report.xml" }, 
dryRun = true,
tags = "@SmokeTest"
)
//  
public class Runner {

}
