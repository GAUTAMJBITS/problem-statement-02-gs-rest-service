package com.example.restservice;

// src/test/java/com/example/restservice/CucumberTestRunner.java

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "com.example.restservice",
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class tempCodeRunnerFile {
}
