package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;
import utils.ConfigReader;

public class LoginTest extends BaseTest {
@Test(priority = 1)
public void loginValidCredentials() {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
	
	//Validate Successful login
	String expectedUrl="https://www.saucedemo.com/inventory.html";
	Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"Login failed!!!");
}
@Test(priority = 2)
public void loginInvalidCredentials() {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.login("Irfan", "password34");
	
	//validate error message
	WebElement errorMsg=driver.findElement(By.cssSelector("h3[data-test='error']"));
	Assert.assertTrue(errorMsg.isDisplayed(),"Error message not Found");
	System.out.println("Error Message is Successfully displayed with : " + errorMsg.getText());
}
}
