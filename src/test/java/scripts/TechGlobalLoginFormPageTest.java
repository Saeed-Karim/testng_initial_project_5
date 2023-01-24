package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalLoginFormPage;

public class TechGlobalLoginFormPageTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("Login Form");

    }

    /**
     * Given user is on https://techglobal-training.netlify.app/
     * When user clicks on "Practices" dropdown in the header
     * And user select the "Frontend Testing" option
     * And user clicks on the "Login Form" card
     * Then user should heading1 as “Login Form”
     * And user should see “Please enter your username” label and username input box
     * And user should see “Please enter your password” label and password input box
     * And user should see “LOGIN” button
     * And user should see “Forgot Password?” link
     */

    @Test(priority = 1, description = "Validate TechGlobal Login Form")
            public void loginForm(){
        Assert.assertTrue(techGlobalLoginFormPage.heading.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.heading.getText(), "Login Form");

        Assert.assertTrue(techGlobalLoginFormPage.usernameBox.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.usernameText.getText(), "Please enter your username");

        Assert.assertTrue(techGlobalLoginFormPage.passwordBox.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.passwordText.getText(), "Please enter your password");

        Assert.assertTrue(techGlobalLoginFormPage.loginButton.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.loginButton.getText(), "LOGIN");

        Assert.assertTrue(techGlobalLoginFormPage.forgotPasswordLink.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.forgotPasswordLink.getText(), "Forgot Password");




            }

    /**
     * Given user is on https://techglobal-training.netlify.app/
     * When user clicks on "Practices" dropdown in the header
     * And user select the "Frontend Testing" option
     * And user clicks on the "Login Form" card
     * And user enters username as “TechGlobal” and password as “Test1234”
     * And user clicks on “LOGIN” button
     * Then user should see “You are logged in” message
     * And user should see “LOGOUT” button
     */

    @Test(priority = 2, description = "Validate TechGlobal Login Form card valid login")
    public void validLogin(){
        techGlobalLoginFormPage.usernameBox.click();
        techGlobalLoginFormPage.usernameBox.sendKeys("TechGlobal");
        techGlobalLoginFormPage.passwordBox.click();
        techGlobalLoginFormPage.passwordBox.sendKeys("Test1234");
        techGlobalLoginFormPage.loginButton.click();
        Assert.assertEquals(techGlobalLoginFormPage.loginSuccess.getText(), "You are logged in");
        Assert.assertTrue(techGlobalLoginFormPage.logoutButton.isDisplayed());

    }

    /**
     Given user is on https://techglobal-training.netlify.app/
     When user clicks on "Practices" dropdown in the header
     And user select the "Frontend Testing" option
     And user clicks on the "Login Form" card
     And user enters username as “TechGlobal” and password as “Test1234”
     And user clicks on “LOGIN” button
     And user clicks on “LOGOUT” button
     Then user should be navigated back to Login Form

     */

    @Test(priority = 3, description = "Validate TechGlobal Login Form card valid login and then logout")
    public void clickLogout(){
        techGlobalLoginFormPage.usernameBox.click();
        techGlobalLoginFormPage.usernameBox.sendKeys("TechGlobal");
        techGlobalLoginFormPage.passwordBox.click();
        techGlobalLoginFormPage.passwordBox.sendKeys("Test1234");
        techGlobalLoginFormPage.loginButton.click();
        Assert.assertEquals(techGlobalLoginFormPage.loginSuccess.getText(), "You are logged in");
        techGlobalLoginFormPage.logoutButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.loginButton.isDisplayed());

    }

    /**
     Given user is on https://techglobal-training.netlify.app/
     When user clicks on "Practices" dropdown in the header
     And user select the "Frontend Testing" option
     And user clicks on the "Login Form" card
     And user clicks on “Forgot Password?” link
     Then user should see “Reset Password” heading1
     And user should see “Enter your email address, and we'll send you a link to reset your password.” message
     And user should see email input box
     And user should see “SUBMIT” button

     */

    @Test(priority = 4, description = ": Validate TechGlobal Login Form card Forgot Password")
    public void forgotPassword(){

    }

}

