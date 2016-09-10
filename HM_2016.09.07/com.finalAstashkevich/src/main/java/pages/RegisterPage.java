package pages;

import helpers.GetLocatorsFromFile;
import helpers.HelperRandomClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Christina on 04.09.2016.
 */
public class RegisterPage {
    public static final By EMAIL_ADDRESS = GetLocatorsFromFile.get("EmailAddress");
    public static final By CREATE_AN_ACCOUNT_BUTTON = GetLocatorsFromFile.get("CreateAnAccountButton");

    public static final By GENDER_MRS = GetLocatorsFromFile.get("GenderMrs");
    public static final By FIRST_NAME = GetLocatorsFromFile.get("FirstName");
    public static final By LAST_NAME = GetLocatorsFromFile.get("LastName");
    public static final By PASSWORD = GetLocatorsFromFile.get("PasswordRegist");
    public static final By DAY_DOB = GetLocatorsFromFile.get("DOBDay");
    public static final By MONTH_DOB = GetLocatorsFromFile.get("DOBMonth");
    public static final By YEAR_DOB = GetLocatorsFromFile.get("DOBYear");
    public static final By COMPANY = GetLocatorsFromFile.get("Company");

    public static final By STREET = GetLocatorsFromFile.get("AddressStreet");
    public static final By APARTMENT = GetLocatorsFromFile.get("AddressApartment");
    public static final By CITY = GetLocatorsFromFile.get("AddressCity");
    public static final By STATE = GetLocatorsFromFile.get("State");
    public static final By ZIP_CODE = GetLocatorsFromFile.get("ZIPCode");
    public static final By HOME_PHONE = GetLocatorsFromFile.get("HomePhone");
    public static final By MOBILE_PHONE = GetLocatorsFromFile.get("MobilePhone");
    public static final By ALIAS = GetLocatorsFromFile.get("Alias");

    public static final By REGISTER_BUTTON = GetLocatorsFromFile.get("RegisterButton");


    public static void populateInitialRegistryForm(WebDriver driver){

        Header.goToLoginPage(driver);

        driver.findElement(EMAIL_ADDRESS).sendKeys(HelperRandomClass.getRandomEmail());
        driver.findElement(CREATE_AN_ACCOUNT_BUTTON).click();
    }

    public static void completePopulateRegistryForm(WebDriver driver){

        populateInitialRegistryForm(driver);

        driver.findElement(GENDER_MRS).click();
        driver.findElement(FIRST_NAME).sendKeys(HelperRandomClass.getFirstName());
        driver.findElement(LAST_NAME).sendKeys(HelperRandomClass.getLastName());
        driver.findElement(PASSWORD).sendKeys(HelperRandomClass.getPassword());
        driver.findElement(DAY_DOB).sendKeys(HelperRandomClass.getRandFebDay());
        driver.findElement(MONTH_DOB).sendKeys(HelperRandomClass.getRandMonth());
        driver.findElement(YEAR_DOB).sendKeys("1970");
        driver.findElement(COMPANY).sendKeys(HelperRandomClass.getRandomString());

        driver.findElement(STREET).sendKeys(HelperRandomClass.getAddress());
        driver.findElement(APARTMENT).sendKeys(HelperRandomClass.getAddress());
        driver.findElement(CITY).sendKeys(HelperRandomClass.getAddress());
        driver.findElement(STATE).sendKeys("M");
        driver.findElement(ZIP_CODE).sendKeys("12345");
        driver.findElement(HOME_PHONE).sendKeys("1234567891");
        driver.findElement(MOBILE_PHONE).sendKeys("1234567891");
        driver.findElement(ALIAS).sendKeys(HelperRandomClass.getAddress());

        driver.findElement(REGISTER_BUTTON).click();
    }
}
