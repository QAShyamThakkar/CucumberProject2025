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


    @When("user enters username {string} and password {string} valid credentials")
    public void userEntersUsernameAndPasswordValidCredentials(String userName, String password) {
        System.out.println("Valid Username entered on Website " + userName );
        System.out.println("Valid Password entered on Website " + password );
    }

    @When("user enters Invalid username {string} and password {string} credentials")
    public void userEntersInvalidUsernameAndPasswordCredentials(String userName, String password) {
        System.out.println("Invalid Username entered on Website " + userName );
        System.out.println("Invalid Password entered on Website " + password );

    }
}
