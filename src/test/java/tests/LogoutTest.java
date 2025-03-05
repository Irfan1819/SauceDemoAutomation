package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;
import utils.ConfigReader;

public class LogoutTest extends BaseTest {
	@Test
	public void testLogoutFunctionality() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		HomePage homePage=new HomePage(driver);
		homePage.logout();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"),"Login failed !!!");
		System.out.println("Logout Function is successfully Done !!!");
	}

}
