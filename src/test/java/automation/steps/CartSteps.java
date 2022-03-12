package automation.steps;

import automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

    public class CartSteps {

        CartPage cartPage = new CartPage();

        @Then("verify user is on cart page")
        public void verifyUserIsOnCartPage() {
            cartPage.verifyPage();
        }

        @When("user click on checkout button")
        public void userClickOnCheckoutButton() {
            cartPage.clickOnCheckoutBtn();
        }

        @When("user click on continue shopping button")
        public void userClickOnContinueShoppingButton() {
            cartPage.clickOnContinueShopping();
        }

        @Then("verify two items is in cart page")
        public void verifyTwoItemsIsInCartPage() {
            cartPage.verifyTwoItems();
        }

        @Then("verify user is on cart page with second item")
        public void verifyUserIsOnCartPageWithSecondItem() {
            cartPage.verifyPage2();
        }
    }

