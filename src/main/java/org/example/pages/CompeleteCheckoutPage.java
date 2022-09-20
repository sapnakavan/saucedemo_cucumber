package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompeleteCheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CompeleteCheckoutPage.class.getName());
    public CompeleteCheckoutPage() {PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = ".complete-header")
    WebElement thanksMessage;

    public String verifyMessage(){
        return thanksMessage.getText();
    }
}
