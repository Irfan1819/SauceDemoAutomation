package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageRefresh {
private WebDriver driver;
//Locators
private By cartBadge=By.className("shopping_cart_badge");
public CartPageRefresh(WebDriver driver) {
	this.driver=driver;
}
public String getCartcount()
{
	try {
		return driver.findElement(cartBadge).getText();
	}catch (Exception e) {
		return "0";
	}
}
}
