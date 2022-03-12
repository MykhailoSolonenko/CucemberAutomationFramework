package automation.steps;

import automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        homePage.verifyPage();

    }
    @Then("user click on Burger Menu")
    public void user_click_on_burger_menu() {
        homePage.clickOnBurgerMenu();

    }

    @Then("user click on Logout Link")
    public void user_click_on_logout_link() {
        homePage.clickOnLogoutLink();

    }

//    @When("user click on item {string}")
//    public void userClickOnAnyItem(String itemName) {
//        homePage.clickOnItem(itemName);
//    }


    @When("user click on second item")
    public void userClickOnSecondItem() {

        homePage.clickOnItem2();
    }

    @When("user click on third item")
    public void userClickOnThirdItem() {
        homePage.clickOnItem3();
    }
    @When("user click on item {string}")
    public void userClickOnItem(String itemName) throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickOnItem(itemName.trim());
    }

    @When("user click on add to cart button for item  {string}")
    public void userClickOnAddToCartButtonForItem(String itemName) {
        homePage.clickOnAddToCartForSpecificItem(itemName);
    }
}
