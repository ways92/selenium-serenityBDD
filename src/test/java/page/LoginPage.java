package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By loginButton(){
        return By.id("login");
    }

    private By usernameField(){
        return By.id("userName");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By textUsername(){
        return By.id("userName-value");
    }

    private By errorMessage(){
        return By.id("name");
    }

    @Step
    public void openUrl(){
        openAt("/books");
    }
    @Step
    public void clickLogin(){
        $(loginButton()).click();
    }
    @Step
    public void enterValidUsername(){
        $(usernameField()).sendKeys("ways77");
    }
    @Step
    public void enterValidPassword(){
        $(passwordField()).sendKeys("Minumair77!");
    }

    @Step
    public boolean validatelogin(){
        return $(textUsername()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).sendKeys(username);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).sendKeys(password);
    }

    @Step
    public boolean validateFormAppears(){
        return $(usernameField()).isDisplayed();
    }
    @Step
    public boolean errorMessageAppear(){
        return $(errorMessage()).isDisplayed();
    }

}
