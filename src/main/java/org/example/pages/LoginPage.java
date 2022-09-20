package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css = "#user-name")
    WebElement username;

    @CacheLookup
    @FindBy(id = "password")
    WebElement password;

   @CacheLookup
   @FindBy(id = "login-button")
    WebElement loginButton;

    public void enterUsernamePassword(String user, String pass) {
        sendTextToElement(username, user);
        sendTextToElement(password, pass);
    }

    public void clickLoginButton() {
        clickOnElement(loginButton);
    }
}
