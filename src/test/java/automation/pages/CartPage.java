package automation.pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(xpath = "//*[contains(@id, 'remove')]")
    WebElement removeBtn;

    @FindBy(id="remove-sauce-labs-bike-light")
    WebElement removeBtn2;

    @FindBy(id="remove-sauce-labs-bolt-t-shirt")
    WebElement removeBtn3;

    @FindBy(xpath="//div[@class='inventory_item_name']")
    WebElement itemName;

    @FindBy(xpath="//div[contains(text(),'Sauce Labs Bike Light')]")
    WebElement itemName2;

    @FindBy(xpath="//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")
    WebElement itemName3;

    @FindBy(id="checkout")
    WebElement checkoutBtn;

    @FindBy(id="continue-shopping")
    WebElement continueBtn;


    public void verifyPage() {
        Assert.assertTrue("Remove button is missing from cart page", removeBtn.isDisplayed());
        Assert.assertTrue("Item name is missing from cart page page", itemName.isDisplayed());
        Assert.assertEquals("Checkout button is missing from cart page page", checkoutBtn.isDisplayed(), true);
    }

    public void clickOnCheckoutBtn() {
        checkoutBtn.click();
    }

    public void clickOnContinueShopping() {
        continueBtn.click();
    }

    public void verifyPage2() {
        Assert.assertTrue("Remove button is missing from cart page", removeBtn2.isDisplayed());
        Assert.assertTrue("Item name is missing from cart page page", itemName.isDisplayed());
        Assert.assertEquals("Checkout button is missing from cart page page", checkoutBtn.isDisplayed(), true);
    }

    public void verifyTwoItems() {
        Assert.assertTrue("Remove button is missing from cart page", removeBtn2.isDisplayed());
        Assert.assertTrue("Remove button is missing from cart page", removeBtn3.isDisplayed());
        Assert.assertTrue("Item name is missing from cart page page", itemName2.isDisplayed());
        Assert.assertTrue("Item name is missing from cart page page", itemName3.isDisplayed());
        Assert.assertEquals("Checkout button is missing from cart page page", checkoutBtn.isDisplayed(), true);

    }
}

