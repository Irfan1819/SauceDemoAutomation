package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import utils.BaseTest;
import utils.ConfigReader;

public class CheckoutTest extends BaseTest {
	@Test
	public void checkoutProcess() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		
		//Add to product to cart
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		
		//Navigate to cart & checkout
		CartPage cartPage=new CartPage(driver);
		cartPage.navigateToCart();
		
		//complete checkout process
		CheckoutPage checkoutPage=new CheckoutPage(driver);
		checkoutPage.completecheckout("John", "Doe", "123456");
		
		//Validate order completion
		Assert.assertTrue(checkoutPage.isOrderSuccessful(),"Order placement failed!!!");
		System.out.println("Checkout process is successful");
	}
	

}
