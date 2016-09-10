package pages;

import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Christina on 04.09.2016.
 */
public class CatalogViewPage {

    public static final By T_SHIRTS_TAB = GetLocatorsFromFile.get("TShirtsTab");

    public static void clickTShirtsTab(WebDriver driver){

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(T_SHIRTS_TAB)).click().build().perform();

    }

}
