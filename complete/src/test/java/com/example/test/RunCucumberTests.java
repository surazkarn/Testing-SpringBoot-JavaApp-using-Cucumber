package com.example.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/features",
    glue = "stepdefinitions",
    plugin = {"json:target/report/cucumber.json"}
)
public class RunCucumberTests  {
}

