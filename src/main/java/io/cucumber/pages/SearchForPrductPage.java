package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForPrductPage {

    private WebDriver driver;

    public SearchForPrductPage(WebDriver driver){
        this.driver = driver;
    }


    public WebElement getSearchField(){
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement getSearchButton(){
        return driver.findElement(By.xpath("//input[@value='Search']"));
    }


    public WebElement selectProduct(){
        return driver.findElement(By.linkText("Blue and green Sneaker"));
    }

    public WebElement getAddToCardButton(){
        return driver.findElement(By.id("add-to-cart-button-28"));
    }

    public WebElement checkProductAdded(){
        return driver.findElement(By.id("bar-notification"));
    }


}
