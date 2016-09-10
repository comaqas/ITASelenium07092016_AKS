package pages;

import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Christina on 04.09.2016.
 */
public class CartPage {

    public static final By CATALOG_ITEM = GetLocatorsFromFile.get("CatalogItemTShirt");
    public static final By ADD_TO_CART_BUTTON = GetLocatorsFromFile.get("AddToCartButton");
    public static final By PROCEED_TO_CHECK_OUT_BUTTON_AT_POP_UP = GetLocatorsFromFile.get("ProceedToCheckOutButtonAtPopUp");
    public static final By PROCEED_TO_CHECK_OUT_BUTTON_SUMMARY = GetLocatorsFromFile.get("ProceedToCheckOutButtonSummary");
    public static final By PROCEED_TO_CHECK_OUT_BUTTON_ADDRESS = GetLocatorsFromFile.get("ProceedToCheckOutButtonAddress");
    public static final By PROCEED_TO_CHECK_OUT_BUTTON_SHIPPING = GetLocatorsFromFile.get("ProceedToCheckOutButtonShipping");
    public static final By I_CONFIRM_MY_ORDER = GetLocatorsFromFile.get("IConfirmMyOrder");
    public static final By TERMS_OF_SERVICE_AGREEMENT = GetLocatorsFromFile.get("TermsOfServiceAgreement");
    public static final By PAY_BY_BANK_WIRE = GetLocatorsFromFile.get("PayByBankWire");
    public static final By DELETE_BUTTON = GetLocatorsFromFile.get("DeleteItem");
    public static final By CLOSE_POP_UP_BUTTON = GetLocatorsFromFile.get("ClosePopUpButton");
    public static final By CART = GetLocatorsFromFile.get("CartIco");

    public static void addToCart(WebDriver driver) {

        LoginPage.populateLoginForm(driver);

        CatalogViewPage.clickTShirtsTab(driver);

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(CATALOG_ITEM)).build().perform();
        driver.findElement(ADD_TO_CART_BUTTON).click();
    }

    public static void proceedtoCheckOut(WebDriver driver) throws InterruptedException {

        addToCart(driver);

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(CATALOG_ITEM)).build().perform();
        driver.findElement(ADD_TO_CART_BUTTON).click();
        Thread.sleep(5000);
        driver.findElement(PROCEED_TO_CHECK_OUT_BUTTON_AT_POP_UP).click();
        driver.findElement(PROCEED_TO_CHECK_OUT_BUTTON_SUMMARY).click();
        Thread.sleep(2500);
        driver.findElement(PROCEED_TO_CHECK_OUT_BUTTON_ADDRESS).click();
        driver.findElement(TERMS_OF_SERVICE_AGREEMENT).click();
        driver.findElement(PROCEED_TO_CHECK_OUT_BUTTON_SHIPPING).click();
        driver.findElement(PAY_BY_BANK_WIRE).click();
        Thread.sleep(2500);
        driver.findElement(I_CONFIRM_MY_ORDER).click();
    }

    public static void deleteFromShoppingCartViaProceedForm(WebDriver driver) throws InterruptedException {

        addToCart(driver);
        Thread.sleep(5000);
        driver.findElement(PROCEED_TO_CHECK_OUT_BUTTON_AT_POP_UP).click();
        driver.findElement(DELETE_BUTTON).click();
    }

    public static void deleteFromShoppingCartViaCart(WebDriver driver) throws InterruptedException {

        addToCart(driver);

        Thread.sleep(2500);
        driver.findElement(CLOSE_POP_UP_BUTTON).click();
        driver.findElement(CART).click();
        driver.findElement(DELETE_BUTTON).click();
    }


}