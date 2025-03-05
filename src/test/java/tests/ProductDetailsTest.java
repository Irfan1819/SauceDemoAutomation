package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductDetailsPage;
import utils.BaseTest;
import utils.ConfigReader;

public class ProductDetailsTest extends BaseTest {
	@Test
	public void testingProductDetails() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		
		//click on any product
		driver.findElement(By.cssSelector(".inventory_item_name")).click();
		
		ProductDetailsPage productDetailsPage=new ProductDetailsPage(driver);
		Assert.assertTrue(productDetailsPage.getProductName().contains("Sauce"),"Incorrect Product name");
		System.out.println("The product name is : " + productDetailsPage.getProductName());
		
		Assert.assertTrue(productDetailsPage.getProductPrice().contains("$"),"Product price is wrong");
		System.out.println("The product price is : " + productDetailsPage.getProductPrice());
	}

}
