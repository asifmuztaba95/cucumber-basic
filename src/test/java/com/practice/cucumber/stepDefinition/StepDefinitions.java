package com.practice.cucumber.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

class HaveReadCucumber{
    static String haveReadCucumber(String read_gherkin){
        return "yes".equals(read_gherkin) ? "YES" : "NO";
    }
}
class HaveCompletedCucumber{
    static String haveCompletedCucumber(String status){
        return "did".equals(status) ? "YES" : "NO";
    }
}

public class StepDefinitions {
    private String read_gherkin;
    private String actualAnswer, actualAnswer1;
    private String status;
    
    @Given("did not read gherkin")
    public void did_not_read_gherkin() {
        read_gherkin = "no";
    }
    
    @Given("did read gherkin")
    public void did_read_gherkin() {
        read_gherkin = "yes";
    }
    
    @When("i ask have i read cucumber")
    public void i_ask_have_i_read_cucumber() {
        actualAnswer = HaveReadCucumber.haveReadCucumber(read_gherkin);
    }
    
    @Then("tell me {string}")
    public void tell_me(String expectedAnswer) {
        assertEquals(expectedAnswer,actualAnswer);
    }
    
    
    @Given("{string} completed gherkin")
    public void completed_gherkin(String status) {
        this.status = status;
    }

    @When("i ask have i completed cucumber")
    public void i_ask_have_i_completed_cucumber() {
        actualAnswer1 = HaveCompletedCucumber.haveCompletedCucumber(status);
    }
    
    @Then("give me {string}")
    public void give_me(String expectedAnswer1) {
        assertEquals(expectedAnswer1,actualAnswer1);
    }
    
}
