package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions{
	
	Base base;
	WebDriver driver;
	public PageActions()
	{
		base = new Base();
		driver = base.getDriver();
	}
	
	public void clickButton(By by)
	{
		WebElement ele = driver.findElement(by);
		ele.click();
	}

}
