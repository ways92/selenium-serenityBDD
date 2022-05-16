package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.AddEmployeePage;
import page.LoginPage;


public class LoginStep {

    @Steps
    LoginPage loginPage;


    @Given("User on page")
    public void adminOnPage() {
        loginPage.openUrl();
    }

    @When("User enter username and password")
    public void userEnterUsernameAndPassword()  {
        loginPage.enterValidUsername();
        loginPage.enterValidPassword();
    }

    @When("User click on login button to submit")
    public void userClickOnLoginButtonToSubmit() {
        loginPage.clickLogin();
    }

    @Then("User see quick launch panel on dashboard")
    public void userSeeQuickLaunchPanelOnDashboard() {
        loginPage.validatelogin();
    }

    @When("User enter username and password {string} {string}")
    public void userEnterUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @Then("User see result {string}")
    public void userSeeResult(String result) {
        if(result.equals("quick launch panel")){
            loginPage.validatelogin();
        }else {
            loginPage.errorMessageAppear();
        }
    }

//    @Steps
//    AddEmployeePage addEmployeePagePage;
//
//    @When("Click PIM on menu")
//    public void clickPIMOnMenu() {
//        addEmployeePagePage.clickPimButton();
//    }
//
//    @When("Click Add Employee on submenu")
//    public void clickAddEmployeeOnSubmenu() {
//        addEmployeePagePage.clickAddPimButton();
//    }
//
//    @When("Enter first name, middle name, last name, employee id")
//    public void enterFirstNameMiddleNameLastNameEmployeeId() {
//        addEmployeePagePage.enterFirtname();
//        addEmployeePagePage.enterMiddlename();
//        addEmployeePagePage.enterLastname();
//        addEmployeePagePage.enterEmployeeId();
//    }
//
//    @When("Click save")
//    public void clickSave() {
//    }
//
//    @Then("User get new employee")
//    public void userGetNewEmployee() {
//    }


}
