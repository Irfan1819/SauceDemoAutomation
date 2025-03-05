package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;

public class UserRolesTest extends BaseTest {

    @DataProvider(name = "users")
    public Object[][] userData() {
        return new Object[][] {
            { "standard_user", "secret_sauce", true },{"locked_out_user","secret_sauce",false},{"problem_user","secret_sauce",true},{"performance_glitch_user","secret_sauce",true}
        };
    }
@Test(dataProvider = "users")
public void testDifferentUserRoles(String username,String password,boolean shouldLogin) {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.login(username, password);
	if(shouldLogin) {
		String expectdURL="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(driver.getCurrentUrl(), expectdURL,"Login Failed for : " + username);
		
	}else {
		Assert.assertTrue(driver.getPageSource().contains("Epic sadface"),"Error Message is not displayed for " + username);
	}
}
}
