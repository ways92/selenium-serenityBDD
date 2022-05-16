package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class LoginPage extends PageObject {


    @FindBy(id = "txtUsername")
    WebElement usernameField;

    @FindBy(id = "txtPassword")
    WebElement passwordField;

    @FindBy(id = "btnLogin")
    WebElement loginButton;

    @FindBy(id = "panel_resizable_0_0")
    WebElement panelQuickLaunch;

    @FindBy(id = "spanMessage")
    WebElement errorMessage;

    @Step
    public void openUrl(){
        getDriver().manage().deleteAllCookies();
        openAt("/index.php/auth/login");
    }

    @Step
    public void enterValidUsername(){
        usernameField.sendKeys("Admin");
    }

    @Step
    public void enterValidPassword(){
        passwordField.sendKeys("admin123");
    }

    @Step
    public void clickLogin(){
        loginButton.click();
    }

    @Step
    public boolean validatelogin(){
        return panelQuickLaunch.isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        usernameField.sendKeys(username);
    }
    @Step
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }

    @Step
    public boolean errorMessageAppear(){
        return errorMessage.isDisplayed();
    }

}
