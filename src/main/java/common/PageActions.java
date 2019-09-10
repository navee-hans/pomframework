package common;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions{
	WebDriver driver = Base.driver;
	WebDriverWait wait = new WebDriverWait(driver, 20);
	private WebElement element;
	public boolean isTextDisplayed = false;
	
	public void clickButton(By by)
	{
		element = findWebElement(by);
		element.click();
		waitAfterClickElement();
	}
	
	public void setText(String text, By by)
	{
		element = findWebElement(by);
		element.sendKeys(text);
	}
	
	private WebElement findWebElement(By by)
	{
		element = driver.findElement(by);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public void clickOnLeftFolderLinks(By by, String foldertext)
	{
		List <WebElement> element = driver.findElements(by);
		for (WebElement webElement : element) {
			wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
			if(webElement.getText().equalsIgnoreCase(foldertext))
			{
				webElement.click();
				break;
			}
		}
	}

	
	public void switchWindow(String parentwindowtitle)
	{
		Set<String> windows = driver.getWindowHandles();
		if(!windows.isEmpty()){
		for (String newwindow : windows) {
			String NewWindowTitle = driver.switchTo().window(newwindow).getTitle();
			if(!parentwindowtitle.equals(NewWindowTitle))
			{
				driver.switchTo().window(newwindow);
				break;
			}
			}
		}
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	private void waitAfterClickElement()
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	public boolean isElementTextDisplayed(String text, By by)
	{	
		element = findWebElement(by);
		if(element.getText().equals(text))
		{
			isTextDisplayed = true;
		}
		return isTextDisplayed;
	}
}
