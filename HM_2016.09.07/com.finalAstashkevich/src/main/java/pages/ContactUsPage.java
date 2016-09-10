package pages;

import helpers.GetLocatorsFromFile;
import helpers.HelperRandomClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Christina on 04.09.2016.
 */
public class ContactUsPage {

    public static final By SUBJECT_HEADING = GetLocatorsFromFile.get("SubjectHeading");
    public static final By EMAIL = GetLocatorsFromFile.get("Email");
    public static final By ORDER_REFERENCE = GetLocatorsFromFile.get("OrderReference");
    public static final By ATTACH_FILE = GetLocatorsFromFile.get("AttachFile");
    public static final By MESSAGE = GetLocatorsFromFile.get("Message");
    public static final By SUBMIT_BUTTON = GetLocatorsFromFile.get("SubmitButton");


    public static void populateContactUsWithoutMessageForm(WebDriver driver){

        Header.goToContactUsPage(driver);

        driver.findElement(SUBJECT_HEADING).sendKeys("c");
        driver.findElement(EMAIL).sendKeys(HelperRandomClass.getRandomEmail());
        driver.findElement(ORDER_REFERENCE).sendKeys(HelperRandomClass.getRandomString());
        driver.findElement(ATTACH_FILE).sendKeys("D:\\!GitHub\\!com.finalAstashkevich\\com.finalAstashkevich\\car.txt");
    }

    public static void populateContactUsForm(WebDriver driver) {

        ContactUsPage.populateContactUsWithoutMessageForm(driver);
        driver.findElement(MESSAGE).sendKeys(HelperRandomClass.getRandomString());
    }

    public static void clickSubmitButton(WebDriver driver) {
        driver.findElement(SUBMIT_BUTTON).click();
    }
}
