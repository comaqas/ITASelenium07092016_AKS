import core.TestBase;
import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by Christina on 10.09.2016.
 */
public class LoginTest extends TestBase {

    public static final By BREAD_CRUMB = GetLocatorsFromFile.get("BreadCrumbs");

    @Test

    public void performSuccessLogin(){

        LoginPage.populateLoginForm(driver);
        Assert.assertTrue(driver.findElement(BREAD_CRUMB).getText().contains("My account"));
    }
}
