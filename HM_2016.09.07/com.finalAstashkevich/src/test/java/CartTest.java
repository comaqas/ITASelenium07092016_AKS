import core.TestBase;
import helpers.GetLocatorsFromFile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

/**
 * Created by Christina on 10.09.2016.
 */
public class CartTest extends TestBase {

    public static final By SUCCESS_PAYMENT_ALERT = GetLocatorsFromFile.get("SuccessPayment");
    public static final By SUCCESS_DELETE_ALERT = GetLocatorsFromFile.get("DeleteSuccess");

    @Test
    public void addToCartSuccess() throws InterruptedException {

        CartPage.addToCart(driver);
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(CartPage.PROCEED_TO_CHECK_OUT_BUTTON_AT_POP_UP).isDisplayed());
    }

    @Test
    public void payOrderSuccess() throws InterruptedException {

        CartPage.proceedtoCheckOut(driver);
        Thread.sleep(2500);
        Assert.assertTrue(driver.findElement(SUCCESS_PAYMENT_ALERT).getText().contains("Your order on My Store is complete."));
    }

    @Test
    public void deleteItemViaProceedForm() throws InterruptedException {

        CartPage.deleteFromShoppingCartViaProceedForm(driver);
        Thread.sleep(2500);
        Assert.assertTrue(driver.findElement(SUCCESS_DELETE_ALERT).getText().contains("Your shopping cart is empty."));
    }

    @Test
    public void deleteItemViaCart() throws InterruptedException {

        CartPage.deleteFromShoppingCartViaCart(driver);
        Thread.sleep(2500);
        Assert.assertTrue(driver.findElement(SUCCESS_DELETE_ALERT).getText().contains("Your shopping cart is empty."));
    }
}
