package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechGlobalLoginFormPage extends TechGlobalBasePage {

    public TechGlobalLoginFormPage(){
        super();
    }

    @FindBy(id = "main_heading")
    public WebElement heading;

    @FindBy(css = "label[for=\"username\"]")
    public WebElement usernameText;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(css = "label[for=\"password\"]")
    public WebElement passwordText;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "login_btn")
    public WebElement loginButton;

    @FindBy(id = "forgot-password")
    public WebElement forgotPasswordLink;

    @FindBy(id = "success_lgn")
    public WebElement loginSuccess;

    @FindBy(id = "logout")
    public WebElement logoutButton;





}
