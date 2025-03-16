package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

   features = "src/test/resources/FeatureFile",   //path to feature file
   glue = "com.automation.steps",                 //path to Step definition package
   tags = "@Shyam or @Smoke",                     //Tags to include and exclude
   dryRun = false,                               //Identify unimplemented steps in feature, if any
   plugin = {"html:target/report.html", "json:target/cucumber.json" }  //Plug in is used to generate report


)



public class Runner {
}
