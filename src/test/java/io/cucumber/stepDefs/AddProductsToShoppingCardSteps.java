package io.cucumber.stepDefs;

import io.cucumber.java.en.*;
import io.cucumber.pages.AddProductsToShoppingCardPage;
import org.openqa.selenium.WebElement;
import qa.factory.DriverFactory;

import java.util.List;

public class AddProductsToShoppingCardSteps {

    AddProductsToShoppingCardPage addProductsToShoppingCardPage= new AddProductsToShoppingCardPage(DriverFactory.getDriver());
    @When("user clicks on Books")
    public void user_clicks_on_books() {
        addProductsToShoppingCardPage.getBooksLink().click();
    }
    @When("user adds book to cart")
    public void user_adds_book_to_cart() {
        addProductsToShoppingCardPage.getBookFirstItem().click();
    }
    @When("user adds another book to cart")
    public void user_adds_another_book_to_cart() {
       addProductsToShoppingCardPage.getBookSecondItem().click();
    }
    @Then("the selected books will be added to shopping cart")
    public void the_selected_books_will_be_added_to_shopping_cart() {
       addProductsToShoppingCardPage.getShoppingCard().click();
       List<WebElement> allProducts = addProductsToShoppingCardPage.getAddedBooksList();
        for (int i = 0; i < allProducts.size(); i++) {
            String productName = allProducts.get(i).getText();
            if (productName.equals("Computing and Internet") || productName.equals("Fiction")) {
                System.out.println(productName + " Added");
            }

        }
    }
}
