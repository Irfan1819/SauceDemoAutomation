package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;

public class LoginErrorTest extends BaseTest{
@Test
public void testLoginErrorWithEmptyFields() {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.login("", "");
	WebElement errorMsg=driver.findElement(By.cssSelector("h3[data-test='error']"));
	Assert.assertTrue(errorMsg.isDisplayed(),"error Msg is not Found !!!");
	Assert.assertEquals(errorMsg.getText(), "Epic sadface : username is required","Incorrect error message");
}
}
