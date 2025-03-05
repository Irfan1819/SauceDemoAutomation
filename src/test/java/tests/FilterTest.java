package tests;

import org.testng.annotations.Test;

import pages.FilterPage;
import pages.LoginPage;
import utils.BaseTest;
import utils.ConfigReader;

public class FilterTest extends BaseTest{
	@Test
	public void testingFilterBypriceLowToHigh() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		FilterPage filterPage=new FilterPage(driver);
		filterPage.applyFilter("lohi");
		System.out.println("Products filtered successfully as Price (Low to High)");
	}

}
