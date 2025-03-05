package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;
import utils.BaseTest;
import utils.ConfigReader;

public class ProductTest extends BaseTest {
	@Test
	public void testAddToCart() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		
		//Add product to cart
		ProductPage productPage=new ProductPage(driver);
		productPage.addFirstProduct();
		productPage.navigateToCart();
		//validate productname and price in cart
		String expectedProductName=productPage.getProductName();
		String expectedProductPrice=productPage.getProductPrice();
		
		Assert.assertTrue(expectedProductName.contains("Sauce"),"Product name is not match");
		System.out.println("The Product name is matched Successfully : " + expectedProductName );
		
		Assert.assertTrue(expectedProductPrice.contains("$"),"Product price is not Matchable !!!");
		System.out.println("The Product price is matched successfully : " + expectedProductPrice);
	}

}
