import core.TestBase;
import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;

/**
 * Created by Christina on 09.09.2016.
 */
public class RegisterTest extends TestBase{

    public static final By BREAD_CRUMB = GetLocatorsFromFile.get("BreadCrumbs");

    @Test

    public void populateRegisterForm(){

        RegisterPage.completePopulateRegistryForm(driver);
        Assert.assertTrue(driver.findElement(BREAD_CRUMB).getText().contains("My account"));
    }
}
