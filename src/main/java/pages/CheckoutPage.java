package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
private WebDriver driver;
//Locators
private By checkoutButton=By.xpath("//button[contains(text(),'Checkout')]");
private By firstName=By.id("first-name");
private By lastName=By.id("last-name");
private By zipcode=By.id("postal-code");
private By continueButton=By.id("continue");
private By finishButton=By.id("finish");
private By orderMessage=By.className("complete-header");

//constructor
public CheckoutPage(WebDriver driver) {
	this.driver=driver;
}
public void clickCheckout() {
	driver.findElement(checkoutButton).click();
}
public void enterFirstName(String fName) {
	driver.findElement(firstName).sendKeys(fName);
}
public void enterLastName(String lName) {
	driver.findElement(lastName).sendKeys(lName);
}
public void enterZipcode(String zip) {
	driver.findElement(zipcode).sendKeys(zip);
}
public void clickContinue() {
	driver.findElement(continueButton).click();
}
public void clickFinish() {
	driver.findElement(finishButton).click();
}
public boolean isOrderSuccessful() {
	return
	driver.findElement(orderMessage).isDisplayed();
}
//complete checkout process
public void completecheckout(String fname,String lname,String zip) {
	clickCheckout();
	enterFirstName(fname);
	enterLastName(lname);
	enterZipcode(zip);
	clickContinue();
	clickFinish();
}
}
