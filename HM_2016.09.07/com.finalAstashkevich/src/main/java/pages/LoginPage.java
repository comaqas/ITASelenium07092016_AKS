package pages;

import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Christina on 04.09.2016.
 */
public class LoginPage {

    public static final By EMAIL = GetLocatorsFromFile.get("EmailLogin");
    public static final By PASSWORD = GetLocatorsFromFile.get("Password");
    public static final By SIGN_IN_BUTTON = GetLocatorsFromFile.get("SignInButton");

    public static void populateLoginForm(WebDriver driver){

        Header.goToLoginPage(driver);

        driver.findElement(EMAIL).sendKeys("6moon6witch6@gmail.com");
        driver.findElement(PASSWORD).sendKeys("1q2w3e4r");
        driver.findElement(SIGN_IN_BUTTON).click();
    }
}
