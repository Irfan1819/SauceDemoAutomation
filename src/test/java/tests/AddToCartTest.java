package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;
import utils.ConfigReader;

public class AddToCartTest extends BaseTest{
	@Test
	public void testAddToCart() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		
		//Add to Cart
		WebElement addToCartButton=driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addToCartButton.click();
		
		//Verify cart count
		
		WebElement cartCount=driver.findElement(By.className("shopping_cart_badge"));
		Assert.assertTrue(cartCount.isDisplayed(),"Cart Count is  not Updated");
		System.out.println("Cart count is Updated with : " + cartCount.getText());
	}
}
