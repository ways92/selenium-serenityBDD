package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginPage;


    @Given("user on page")
    public void adminOnPage() {
        loginPage.openUrl();
    }

    @When("user click login to navigate form page")
    public void adminClickLoginToEnterForm() {
        loginPage.clickForLogin();
    }

    @When("user enter username and password")
    public void adminEnterUsernameAndPassword()  {
        loginPage.enterUsername();
        loginPage.enterPassword();
    }

    @When("user click on login button to submit")
    public void adminClickOnLoginButtonToSubmit() {
        loginPage.submitLogin();
    }

    @Then("user see username on dashboard")
    public void adminSeeUsernameOnDashboard() {
        loginPage.validateTextUsername();
    }
}
