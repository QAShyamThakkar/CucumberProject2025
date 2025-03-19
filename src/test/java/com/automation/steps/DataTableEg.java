package com.automation.steps;

import io.cucumber.java.en.*;

import java.util.List;

public class DataTableEg {

    @Given("verify user is on the registration page")
    public void verify_user_is_on_the_registration_page() {
        System.out.println("user is on the registration page");

    }


    @When("user enters valid data on registration page")
    public void userEntersValidDataOnRegistrationPage(List<String> data) {
        for (String eachData : data) {
            System.out.println(eachData);
        }
    }


    @Then("verify user is able to checkout")
    public void verify_used_is_able_to_checkout() {
        System.out.println("user is able to checkout");
    }


}
