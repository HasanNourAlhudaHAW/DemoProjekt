package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;



    // Constructor of the page class:
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement hitLoginLink() {
        return  driver.findElement(By.linkText("Log in"));
    }


    public WebElement enterEmail() {
       return driver.findElement(By.id("Email"));
    }

    public WebElement enterPassword() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement clickOnLogin() {
        return driver.findElement(By.xpath("//input[@type=\"submit\"][@value=\"Log in\"]"));
    }

    public WebElement hasAlreadyLoggedIn() {
        return driver.findElement(By.linkText("Log out"));
    }

    public AccountPage doLogin(String email, String password)
    {
        this.enterEmail().sendKeys(email);
        this.enterPassword().sendKeys(password);
        this.clickOnLogin().click();
        return new AccountPage(driver);
    }

    public WebElement checkUnsuccessfulLogin()
    {
       return driver.findElement(By.xpath("//li[contains(text(), 'No customer account found')]"));
    }

    public AccountPage userIsAlreadyOnAccountPage() {

        this.hasAlreadyLoggedIn();
        return new AccountPage(driver);

    }

    public AccountPage isLogInLinkVisible()
    {
        driver.findElement(By.linkText("Log in")).isDisplayed();
        return new AccountPage(driver);
    }


}
