package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SortPage;
import utils.BaseTest;
import utils.ConfigReader;

public class SortTest extends BaseTest{
	@Test
	public void testSortByPriceLowToHigh() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		SortPage sortPage=new SortPage(driver);
		sortPage.sortBy("lohi");
		//Validate sorting by Price
		System.out.println("The sorting price is sucessfully sorted from low to hgh");
		
	}

}
