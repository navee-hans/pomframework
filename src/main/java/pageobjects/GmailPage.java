package pageobjects;

import org.openqa.selenium.By;

import common.PageActions;

public class GmailPage extends PageActions {
	
	PageActions pageactions =  new PageActions();
	By CreatButtonLocator = By.cssSelector("a[class*='h-c-button h-c-header__cta-li-link']");
	By SignInLocator = By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(text(), 'Sign in')]");
	
	//Click create  an account
	public void clickCreateAnAccount()
	{
		pageactions.clickButton(CreatButtonLocator);
	}
	
	//Click on Sign in
	public void clickSignIn()
	{
		pageactions.clickButton(SignInLocator);
	}
}
