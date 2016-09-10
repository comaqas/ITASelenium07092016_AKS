package pages;

import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Christina on 07.09.2016.
 */

public class Header {
    public static final By SIGNIN_LINK = GetLocatorsFromFile.get("HomePage.SignInLink");
    public static final By CONTACT_US = GetLocatorsFromFile.get("HomePage.ContactUs");

    public static void goToLoginPage(WebDriver driver) {
        driver.findElement(SIGNIN_LINK).click();
    }

    public static void goToContactUsPage(WebDriver driver){
        driver.findElement(CONTACT_US).click();
    }

}
