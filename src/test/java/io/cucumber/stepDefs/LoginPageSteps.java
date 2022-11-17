package io.cucumber.stepDefs;

import io.cucumber.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.pages.RegisterPage;
import io.cucumber.pages.WishListPage;
import org.junit.Assert;
import qa.factory.DriverFactory;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private RegisterPage registerPage = new RegisterPage(DriverFactory.getDriver());

    private WishListPage wishListPage = new WishListPage(DriverFactory.getDriver());

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


    @And("register link is visible")
    public void register_link_is_visible() {
        registerPage.getRegisterLink().isDisplayed();
    }
    @And("log in link is visible")
    public void log_in_link_is_visible() {
        loginPage.getLoginLink().isDisplayed();
    }
    @And("Shopping cart link is visible")
    public void shopping_cart_link_is_visible() {
        loginPage.getShoppingCartLink().isDisplayed();
    }
    @And("wishlist link is visible")
    public void wishlist_link_is_visible() {
        wishListPage.getWishListLink().isDisplayed();
    }


}
