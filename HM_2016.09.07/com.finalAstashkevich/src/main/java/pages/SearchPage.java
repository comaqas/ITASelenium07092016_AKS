package pages;

import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Christina on 04.09.2016.
 */
public class SearchPage {

    public static final By SEARCH_FIELD = GetLocatorsFromFile.get("SearchField");
    public static final By SEARCH_BUTTON = GetLocatorsFromFile.get("SearchButton");

    public static void populateSearchForm(WebDriver driver){

        driver.findElement(SEARCH_FIELD).sendKeys("blouse");
        driver.findElement(SEARCH_BUTTON).click();
    }
}
