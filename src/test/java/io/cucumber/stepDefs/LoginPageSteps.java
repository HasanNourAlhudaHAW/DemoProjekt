package io.cucumber.stepDefs;

import io.cucumber.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import qa.factory.DriverFactory;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user navigates to demo shop site")
    public void user_navigates_to_demo_shop_site() {

        DriverFactory.getDriver()
                .get("https://demowebshop.tricentis.com");
    }

    @And("user hits Log in link")
    public void user_hits_log_in_link() {
        loginPage.hitLoginLink().click();
    }


    @When("user enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        loginPage.enterEmail().sendKeys(email);
        loginPage.enterPassword().sendKeys(password);
        loginPage.clickOnLogin().click();
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        boolean bool=loginPage.hasAlreadyLoggedIn().isDisplayed();
        Assert.assertTrue(bool);
    }


    @Then("login should be unsuccessful")
    public void login_should_be_unsuccessful() {
       boolean bool= loginPage.checkUnsuccessfulLogin().isDisplayed();
        Assert.assertTrue(bool);
    }



}
