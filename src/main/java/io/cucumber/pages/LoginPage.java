package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qa.factory.DriverFactory;

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


    public WebElement checkUnsuccessfulLogin()
    {
       return driver.findElement(By.xpath("//li[contains(text(), 'No customer account found')]"));
    }


    public WebElement getLoginLink()
    {
        return DriverFactory.getDriver().findElement(By.linkText("Log in"));

    }

    public WebElement getShoppingCartLink()
    {
        return DriverFactory.getDriver().findElement(By.linkText("Shopping cart"));

    }




}
