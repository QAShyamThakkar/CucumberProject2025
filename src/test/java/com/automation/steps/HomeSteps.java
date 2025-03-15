package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    @Then("verify user is on the home page")
    public void verifyUserIsOnTheHomePage() {
        System.out.println("verify user is on the home page");
    }

    @When("user click on burger icon")
    public void userClickOnBurgerIcon() {
        System.out.println("user click on burger icon");

    }

    @And("click on logout link")
    public void clickOnLogoutLink() {
        System.out.println("\"click on logout link\"");
    }

    @When("user click on Add to cart button")
    public void userClickOnAddToCartButton() {
    }

    @When("click on cart button")
    public void click_on_cart_button() {

    }
}
