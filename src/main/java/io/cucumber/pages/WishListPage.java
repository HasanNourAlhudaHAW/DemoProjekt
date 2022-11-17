package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qa.factory.DriverFactory;

public class WishListPage {
    private WebDriver driver;

    public WishListPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement getGiftCards()
    {

        return  driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[7]/a[1]"));
    }

    public WebElement selectGiftCard()
    {
        return  driver.findElement(By.xpath("//a[contains(text(), '$25 Virtual Gift Card')]"));

    }

    public WebElement enterRecipientName()
    {
        return   driver.findElement(By.id("giftcard_2_RecipientName"));
    }

    public WebElement enterRecipientEmail()
    {
        return driver.findElement(By.id("giftcard_2_RecipientEmail"));

    }

    public WebElement getButtonAddToList()
    {
        return driver.findElement(By.id("add-to-wishlist-button-2"));

    }

    public WebElement checkAddingSelectedCard()
    {
        return driver.findElement(By.id("bar-notification"));

    }

    public WebElement getWishListLink()
    {
        return DriverFactory.getDriver().findElement(By.linkText("Wishlist"));
    }


    public WebElement selectGiftCardToRemove()
    {
        return driver.findElement(By.xpath("//input[@name= 'removefromcart']"));
    }

    public WebElement getUpdateWishlistButton()
    {
        return driver.findElement(By.xpath("//input[@type=\"submit\"][@value=\"Update wishlist\"]"));
    }


    public WebElement checkProductRemoved()
    {
        return driver.findElement(By.xpath("//div[contains(text(),'The wishlist is empty!')]"));
    }
}
