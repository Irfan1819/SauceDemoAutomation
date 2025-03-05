package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage2 {
private WebDriver driver;
//Locators
private By cartIcon=By.className("shopping_cart_link");
private By removeButton=By.id("remove-sauce-labs-bike-light");
private By cartBadge=By.className("shopping_cart_badge");

//constructor
public CartPage2(WebDriver driver) {
	this.driver=driver;
}

//Methods
public void navigateToCart() {
	driver.findElement(cartIcon).click();
}
public void removeProduct() {
	driver.findElement(removeButton).click();
}
public String getCartCount() {
	try {
		return
				driver.findElement(cartBadge).getText();
	}catch (Exception e) {
		return "0";
	}
}
}
