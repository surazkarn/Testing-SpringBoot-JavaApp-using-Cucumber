package stepdefinitions;

import com.example.restservice.Greeting;
import com.example.restservice.GreetingController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingStepDefinitions {

    @Autowired
    private GreetingController greetingController;

    private String name;
    private Greeting response;

    @Given("the application is running")
    public void theApplicationIsRunning() {
        // You may set up any additional configurations or assertions here
    }

    @When("a user requests a greeting with the name {string}")
    public void aUserRequestsAGreetingWithName(String name) {
        this.name = name;
        this.response = greetingController.greeting(name);
    }

    @Then("the response should contain the greeting message {string}")
    public void theResponseShouldContainTheGreetingMessage(String expectedMessage) {
        assertEquals(expectedMessage, response.content());
    }

    @Then("the response id should not be null")
    public void theResponseIdShouldNotBeNull() {
        assertNotEquals(0,response.id());
    }
}