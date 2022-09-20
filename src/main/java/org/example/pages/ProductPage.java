package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(className = "product_sort_container")
    WebElement sortProducts;

    @CacheLookup
    @FindBy(css = ".inventory_list .inventory_item:nth-of-type(6) .btn_inventory")
    WebElement cheapestProduct;

    @CacheLookup
    @FindBy(css = "#shopping_cart_container")
    WebElement cartButton;

    @CacheLookup
    @FindBy(css = ".btn_action.checkout_button")
    WebElement checkout;

    public void clickCartButton() {
        clickOnElement(cartButton);
    }
    public void clickCheckout() {
        clickOnElement(checkout);

    }
    public void sortProductsHighToLow(String price) {
        selectByVisibleTextFromDropDown(sortProducts, price);

    }
    public void addCheapestProduct() {
        clickOnElement(cheapestProduct);

    }
}
