package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qa.factory.DriverFactory;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getRegisterLink()
    {
        return DriverFactory.getDriver().findElement(By.linkText("Register"));
    }
    public WebElement getFirstNameField(){
      return driver.findElement(By.id("FirstName"));
    }
    public WebElement getLastNameField(){
        return driver.findElement(By.id("LastName"));
    }
    public WebElement getEmailField(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement getPasswordField(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement getConfirmPasswordField() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement getRegisterButton(){
        return driver.findElement(By.id("register-button"));
    }

    public WebElement checkRegistrationCompletedMessage(){
        return driver.findElement(By.xpath("//div[@class='result']"));
    }

    public WebElement getContinueButton(){
        return driver.findElement(By.xpath("//input[@type='button'][@class=\"button-1 register-continue-button\"]"));
    }

    public WebElement checkRegistrationDone()
    {
        return driver.findElement(By.linkText("Log out"));
    }

    public WebElement getErrorMessageWrongEmail()
    {
        return driver.findElement(By.xpath("//span[contains(text(), 'Wrong email')]"));
    }

    public WebElement checkErrorMessageEmailAlreadyExist(){
        return driver.findElement(By.xpath("//li[contains(text(), 'The specified email already exists')]"));
    }
}
