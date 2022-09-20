package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "first-name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last-name")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "postal-code")
    WebElement postCode;

    @CacheLookup
    @FindBy(css = ".cart_button")
    WebElement finishBtn;

   @CacheLookup
   @FindBy(css = "[type='submit']")
    WebElement continueBtn;

    public void enterContactDetails(String fName, String lName, String pCode) {
        sendTextToElement(firstName, fName);
        sendTextToElement(lastName, lName);
        sendTextToElement(postCode, pCode);

    }
    public  void clickContinueBtn() {
        clickOnElement(continueBtn);

    }
    public  void clickFinishBtn() {
        clickOnElement(finishBtn);

    }

}
