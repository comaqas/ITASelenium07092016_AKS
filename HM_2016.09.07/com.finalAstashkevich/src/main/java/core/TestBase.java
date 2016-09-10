package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Christina on 04.09.2016.
 * Class stores base tests' actions (Before, After)
 */
public class TestBase {
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
    }

//    @AfterTest
//    public void teardown(){
//        driver.quit();
//    }
}
