package automation.steps;

import automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();

    }

    @When("user do login")
    public void user_do_login() {
        loginPage.doLogin();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        loginPage.verifyPage();

    }
    @Given("user open digital bank website")
    public void user_open_digital_bank_website() {
        loginPage.openDigitalBankWebsite();
    }

    @When("user click on Sign Up button")
    public void user_click_on_Sign_Up_button() {
        loginPage.clickOnSignUpBtn();
    }

    @Then("verify registration success message")
    public void verify_registration_success_message() {
        loginPage.verifyRegistrationSuccessMsg();
    }





}
