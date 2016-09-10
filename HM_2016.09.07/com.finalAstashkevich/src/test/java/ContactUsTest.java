
import core.TestBase;
import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;

/**
 * Created by Christina on 07.09.2016.
 */
public class ContactUsTest extends TestBase {

    public static final By SUCCESS_ALERT = GetLocatorsFromFile.get("SuccessAlert");
    public static final By ERROR_ALERT = GetLocatorsFromFile.get("ErrorAlert");

    @Test

    public void successAlertIsDisplayed() {

        ContactUsPage.populateContactUsForm(driver);
        ContactUsPage.clickSubmitButton(driver);

        Assert.assertTrue((driver.findElement(SUCCESS_ALERT)).isDisplayed());

    }

    @Test

    public void errorAlertIsDisplayed() {

        ContactUsPage.populateContactUsWithoutMessageForm(driver);
        ContactUsPage.clickSubmitButton(driver);

        Assert.assertTrue((driver.findElement(ERROR_ALERT)).getText().contains("The message cannot be blank."));

    }



}
