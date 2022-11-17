package io.cucumber.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.pages.AccountPage;
import io.cucumber.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import qa.factory.DriverFactory;

import java.util.List;
import java.util.Map;


public class AccountPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    private AccountPage accountPage = new AccountPage(DriverFactory.getDriver());

    @Given("User has already logged in to Application")
    public void user_has_already_logged_in_to_application(DataTable dataTable) {
        List<Map<String,String>> credList= dataTable.asMaps();
        String email =credList.get(0).get("email");
        String password =credList.get(0).get("password");
        DriverFactory.getDriver().get("https://demowebshop.tricentis.com/login");
        loginPage.enterEmail().sendKeys(email);
        loginPage.enterPassword().sendKeys(password);
        loginPage.clickOnLogin().click();
    }


    // User Log Out.
    @Given("user is on account page")
    public void user_is_on_account_page() {
        boolean bool= accountPage.checkUserOnAccountPage().isDisplayed();
        Assert.assertTrue(bool);
    }
    @When("user hits the Log out button")
    public void user_hits_the_log_out_button() {
        accountPage.doLogOut().click();
    }
    @Then("user should be logged out")
    public void user_should_be_logged_out() {
       Assert.assertTrue(loginPage.getLoginLink().isDisplayed());
    }


    // Subscribe For Newsletter.
    @When("user enters an email address in the Subscribe field")
    public void user_enters_an_email_address_in_the_subscribe_field() {
        accountPage.enterEmailInSubscribeField();
    }
    @When("user hits the Subscribe button for newsletters")
    public void user_hits_the_subscribe_button_for_newsletters() {
       accountPage.hitSubscribeButton().click();
    }
    @Then("user should be subscribed and get message Thank you for signing up!")
    public void user_should_be_subscribed_and_get_message_thank_you_for_signing_up() {
        boolean bool =accountPage.checkSubscribeMessage().isDisplayed();
        Assert.assertTrue(bool);
    }



    // Check If Menu Bar Is Available.
    @And("{string} is visible")
    public void is_visible(String string) {
        List<WebElement> myMenuBarList = accountPage.getMenuBar();
        for (WebElement s : myMenuBarList)
        {
            String text =s.getText();
            if(text.equals(string)){
                System.out.println(text + " is available");
                break;
            }
        }
    }

}
