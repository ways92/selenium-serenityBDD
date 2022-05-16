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
    public void userClickLoginToEnterForm() {
        loginPage.clickLogin();
    }

    @When("user enter username and password")
    public void userEnterUsernameAndPassword()  {
        loginPage.enterValidUsername();
        loginPage.enterValidPassword();
    }

    @When("user click on login button to submit")
    public void userClickOnLoginButtonToSubmit() {
        loginPage.clickLogin();
    }

    @Then("user see username on dashboard")
    public void userSeeUsernameOnDashboard() {
        loginPage.validatelogin();
    }

    @When("user enter username and password {string} {string}")
    public void userEnterUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @Then("user see result {string}")
    public void userSeeResult(String result) {
        if(result.equals("text username")){
            loginPage.validatelogin();
        }else if (result.equals("warning")){
            loginPage.validateFormAppears();
        }else {
            loginPage.errorMessageAppear();
        }
    }
}
