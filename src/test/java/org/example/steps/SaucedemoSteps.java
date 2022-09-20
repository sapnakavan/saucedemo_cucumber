package org.example.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.CheckOutPage;
import org.example.pages.CompeleteCheckoutPage;
import org.example.pages.LoginPage;
import org.example.pages.ProductPage;
import org.testng.Assert;

public class SaucedemoSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password)  {
        new LoginPage().enterUsernamePassword(username,password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String price)  {
        new ProductPage().sortProductsHighToLow(price);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new ProductPage().addCheapestProduct();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().clickCartButton();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ProductPage().clickCheckout();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String fname, String lname, String postcode)  {
        new CheckOutPage().enterContactDetails(fname, lname, postcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickContinueBtn();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickFinishBtn();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String expectedMessage)  {
        Assert.assertEquals(expectedMessage, new CompeleteCheckoutPage().verifyMessage());
    }
}
