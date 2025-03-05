package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
private WebDriver driver;
//By locators

private By productName=By.className("inventory_details_name");
private By productPrice=By.className("inventory_details_price");

public ProductDetailsPage(WebDriver driver) {
	this.driver=driver;
	
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
