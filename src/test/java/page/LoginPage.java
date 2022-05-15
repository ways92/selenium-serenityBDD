package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    @Step
    public void openUrl(){
        openAt("/books");
    }
    @Step
    public void clickForLogin(){
        find(By.id("login")).click();
    }
    @Step
    public void enterUsername(){
        find(By.id("userName")).sendKeys("ways77");
    }
    @Step
    public void enterPassword(){
        find(By.id("password")).sendKeys("Minumair77!");
    }
    @Step
    public void submitLogin() {
        find(By.id("login")).click();
    }
    @Step
    public boolean validateTextUsername(){
        return find(By.id("userName-value")).isDisplayed();
    }
}
