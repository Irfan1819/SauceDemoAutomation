package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPageRefresh;
import pages.LoginPage;
import utils.BaseTest;
import utils.ConfigReader;

public class CartRetentionTest extends BaseTest {
	@Test
	public void testCartRetentionAfterRefresh() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.navigate().refresh();
		CartPageRefresh cartPageRefresh=new CartPageRefresh(driver);
		Assert.assertEquals(cartPageRefresh.getCartcount(), "1","Cart is Empty after Refresh");
		System.out.println("The cart Count is : " + cartPageRefresh.getCartcount());
		
	}

}