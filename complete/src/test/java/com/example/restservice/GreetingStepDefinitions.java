package com.example.restservice;
// src/test/java/com/example/restservice/GreetingStepDefinitions.java

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class GreetingStepDefinitions {

    @Given("the application is running")
    public void the_application_is_running() {
        // Code to set up or verify the application state
    }

    @When("a user requests the greeting without a name")
    public void user_requests_greeting_without_name() {
        // Code to simulate the request without a name
    }

    @When("a user requests the greeting with the name {string}")
    public void user_requests_greeting_with_name(String name) {
        // Code to simulate the request with a custom name
    }

    @Then("the response should contain the default greeting message")
    public void response_contains_default_greeting_message() {
        // Code to verify the response contains the default greeting message
    }

    @Then("the response should contain the tailored greeting message")
    public void response_contains_tailored_greeting_message() {
        // Code to verify the response contains the tailored greeting message
    }
}
