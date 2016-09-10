package helpers;

import org.openqa.selenium.By;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Christina on 04.09.2016.
 * Class stores methods that read info (objects and its properties) from file(s)
 */

public class GetLocatorsFromFile {

    private static final Properties locators;

    static {
        locators = new Properties();

        InputStream inputStreamFile = GetLocatorsFromFile.class.getResourceAsStream("/locators.properties");

        try{
            locators.load (inputStreamFile);
        } catch (Exception e){
            System.out.println("File not found:"+e);
        }
    }

    private enum LocatorType {
        id,name, css, xpath, tag, text, partText
    }

    public static By getLocator(String locator){
        String[] locatorItems = locator.split("=",2);
        LocatorType locatorType = LocatorType.valueOf(locatorItems[0]);

        switch (locatorType){
            case id: {
                return By.id(locatorItems[1]);
            }

            case name: {
                return By.name(locatorItems[1]);
            }

            case css: {
                return By.cssSelector(locatorItems[1]);
            }

            case xpath: {
                return By.xpath(locatorItems[1]);
            }

            case tag: {
                return By.tagName(locatorItems[1]);
            }

            case text: {
                return By.linkText(locatorItems[1]);
            }

            case partText: {
                return By.partialLinkText(locatorItems[1]);
            }

            default: {
                throw new IllegalArgumentException("No such locator type:"+locatorItems[0]);
            }
        }
    }

    public static By get(String locatorName){
        String propertyValue = locators.getProperty(locatorName);

        By result = getLocator(propertyValue);
        //return result;

        return getLocator(propertyValue);
    }
}
