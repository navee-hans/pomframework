package pageobjects;

import org.openqa.selenium.By;

import common.PageActions;

public class GmailPage extends PageActions {
	
	PageActions pageactions =  new PageActions();
	By CreatButtonLocator = By.cssSelector("a[class*='h-c-button h-c-header__cta-li-link']");
	
	public void clickOnCreateAnAccount()
	{
		pageactions.clickButton(CreatButtonLocator);
	}
	
	
	
	
}
