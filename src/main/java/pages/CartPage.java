package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
private WebDriver driver;
private By cartIcon=By.className("shopping_cart_link");
private By checkOutButton=By.id("checkout");

public CartPage(WebDriver driver) {
	this.driver=driver;
}
public void navigateToCart() {
	driver.findElement(cartIcon).click();
}
public void proceedToCheckout() {
	driver.findElement(checkOutButton).click();
}
}
