package com.automation.steps;

import io.cucumber.java.en.*;

import java.util.List;

public class LoginSteps {

    @Given("user open website")
    public void user_open_website() {
        System.out.println("user open website");
    }

    @Then("verify user is on the login page")
    public void verify_user_is_on_the_login_page() {
        System.out.println("verify user is on the login page");
    }


    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("user enters valid credentials");

    }

    @And("user click on Log in Button")
    public void user_click_on_log_in_button() {
        System.out.println("user click on Log in Button");

    }

    @When("user enters Invalid credentials")
    public void userEntersInvalidCredentials() {
        System.out.println("user enters Invalid credentials");

    }

    @Then("verify user is getting failure message")
    public void verifyUserIsGettingFailureMessage() {

    }


}
