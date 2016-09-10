import core.TestBase;
import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

/**
 * Created by Christina on 10.09.2016.
 */
public class SearchTest extends TestBase{

    public static final By SEARCH_RESULT = GetLocatorsFromFile.get("SearchResult");

    @Test
    public void searchBlouseSuccess(){

        SearchPage.populateSearchForm(driver);
        Assert.assertTrue(driver.findElement(SEARCH_RESULT).getText().contains("Blouse"));
    }
}
