package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FilterPage {
private WebDriver driver;

//Locators
private By filterDropDown=By.className("product_sort_container");

public FilterPage(WebDriver driver) {
	this.driver=driver;
	
}
public void applyFilter(String filterType) {
	Select filterSelect=new Select(driver.findElement(filterDropDown));
	filterSelect.selectByValue(filterType);
	
}
}
