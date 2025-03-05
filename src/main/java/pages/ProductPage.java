package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
private WebDriver driver;
//Locators
private By firstProduct=By.xpath("(//button[text()='Add to cart'])[1]");
private By cartIcon=By.className("shopping_cart_link");
private By productName=By.className("inventory_item_name");
private By productPrice=By.className("inventory_item_price");

//constructor
public ProductPage(WebDriver driver) {
	this.driver=driver;
}
//Methods
public void addFirstProduct() {
	driver.findElement(firstProduct).click();
	}
public void navigateToCart() {
	driver.findElement(cartIcon).click();
}
public String getProductName() {
	return
		driver.findElement(productName).getText();
	
}
public String getProductPrice() {
	return
			driver.findElement(productPrice).getText();
	
}
}
