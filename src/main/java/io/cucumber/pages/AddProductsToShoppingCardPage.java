package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddProductsToShoppingCardPage {
    WebDriver driver;

    public AddProductsToShoppingCardPage(WebDriver driver)
    {
        this.driver =driver;
    }

    public WebElement getBooksLink()
    {
        return driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
    }

    public WebElement getBookFirstItem()
    {
        return driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"));
    }
    public WebElement getBookSecondItem()
    {
        return driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]"));
    }

    public WebElement getShoppingCard()
    {
        return driver.findElement(By.linkText("Shopping cart"));
    }
    public List<WebElement> getAddedBooksList() {

         List<WebElement> allProducts = driver.findElements(By.xpath("//td/a"));
         return allProducts;
    }

}
