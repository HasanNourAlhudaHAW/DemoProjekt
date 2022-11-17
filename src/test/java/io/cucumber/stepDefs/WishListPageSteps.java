package io.cucumber.stepDefs;

import io.cucumber.java.en.*;
import io.cucumber.pages.WishListPage;
import org.junit.Assert;
import qa.factory.DriverFactory;

public class WishListPageSteps {

    WishListPage wishListPage = new WishListPage(DriverFactory.getDriver());


    @When("user moves to gift card on the bar")
    public void user_moves_to_gift_card_on_the_bar() {
        wishListPage.getGiftCards().click();
    }
    @Given("user selects a gift card")
    public void user_selects_a_gift_card() {
        wishListPage.selectGiftCard().click();
    }
    @When("user enters the recipient's name")
    public void user_enters_the_recipient_s_name() {
        wishListPage.enterRecipientName().sendKeys("AnyName");
    }
    @When("user enters the recipient's email")
    public void user_enters_the_recipient_s_email() {
        wishListPage.enterRecipientEmail().sendKeys("anyName@anyThing.any");
    }
    @When("user hits the button Add to wishlist")
    public void user_hits_the_button_add_to_wishlist() {
        wishListPage.getButtonAddToList().click();
    }
    @Then("user should receive the message The product has been added to your wishlist")
    public void user_should_receive_the_message_the_product_has_been_added_to_your_wishlist() {
        Assert.assertTrue(wishListPage.checkAddingSelectedCard().isEnabled());
    }
    @When("user moves to wishList")
    public void user_moves_to_wish_list() {
        wishListPage.getWishListLink().click();
    }
    @When("user selects a gift card to remove")
    public void user_selects_a_gift_card_to_remove() {
        wishListPage.selectGiftCardToRemove().click();
    }
    @When("user hits update button")
    public void user_hits_update_button() {
        wishListPage.getUpdateWishlistButton().click();

    }
    @Then("the selected gift card must be deleted")
    public void the_selected_gift_card_must_be_deleted() {
       Assert.assertTrue(wishListPage.checkProductRemoved().isEnabled());
    }


}
