package com.nesistec.sammy.stepDefinitions;

import com.nesistec.sammy.classes.Checkout;
import cucumber.api.java.en.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by samif on 30/07/2016.
 */
public class CheckoutSteps {
    private int bananaPrice;
    private Checkout checkout;

    @Given("^the price of a \"([^\"]*)\" is (\\d+)p$")
    public void thePriceOfAIsP(String name, int price) throws Throwable {
        bananaPrice = price;
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("^the total price should be (\\d+)p$")
    public void theTotalPriceShouldBeP(int total) throws Throwable {
        assertThat(checkout.total()).isEqualTo(total);
    }
}