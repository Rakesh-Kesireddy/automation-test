package com.mavenit.training;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", tags = {"@MVN-89876"}, strict = true,plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
