package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.CartPage2;
import pages.LoginPage;
import pages.ProductPage;
import utils.BaseTest;

public class RemoveFromCartTest extends BaseTest {
@Test
public void testRemoveProduct() {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.login("username", "password");
	ProductPage productPage=new ProductPage(driver);
	productPage.addFirstProduct();
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	
	//Navigate to cart
	CartPage2 cartPage=new CartPage2(driver);
	cartPage.navigateToCart();
	
	//Remove one Product
	cartPage.removeProduct();
	
	WebElement cartCount=driver.findElement(By.className("remove-sauce-labs-backpack"));
	
	//Validate cart count
	Assert.assertEquals(cartPage.getCartCount(),"1","Cart Count did not update Successfully");
	System.out.println("Product removed successfully and Cart Count updated : " + cartCount.getText());
}
}
