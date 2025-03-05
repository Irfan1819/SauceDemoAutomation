package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SortPage {
private WebDriver driver;
private By sortDropdown=By.className("product_sort_container");
public SortPage(WebDriver driver) {
	this.driver=driver;
}
public void sortBy(String sortType) {
	Select dropdown=new Select(driver.findElement(sortDropdown));
	dropdown.selectByValue(sortType);
	
}
}
