import core.TestBase;
import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CatalogViewPage;

/**
 * Created by Christina on 10.09.2016.
 */
public class CatalogTest extends TestBase{

    public static final By CATALOG_ITEM = GetLocatorsFromFile.get("CatalogItem");

    @Test

    public void findTShirtAtCatalog() {

        CatalogViewPage.clickTShirtsTab(driver);
        Assert.assertTrue(driver.findElement(CATALOG_ITEM).getText().contains("T-shirts"));
    }
}
