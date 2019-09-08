package pageobjects;

import org.openqa.selenium.By;

import common.PageActions;

public class GmailSignInPage {

	PageActions pageactions =  new PageActions();
	By EmailLocator = By.cssSelector("input[id='identifierId']");
	By NextLocator = By.cssSelector("span[class*='RveJvd snByac']");
	By PasswordLocator = By.name("password");
	By WrongPasswordMessageLocator = By.xpath("//div[@class='Xk3mYe VxoKGd Jj6Lae']//div[@class='xgOPLd']//span");
	
	//Set Email
	public void setEmail(String email)
	{
		pageactions.setText(email, EmailLocator);
	}
	
	//Click on Next
	public void clickNext()
	{
		pageactions.clickButton(NextLocator);
	}
	
	//Set Password
	public void setPassword(String password)
	{
		pageactions.setText(password, PasswordLocator);
	}
	
	//Wrong password message
	public boolean isWrongPasswordMessage(String errormessage)
	{
		return pageactions.isElementTextDisplayed(errormessage, WrongPasswordMessageLocator);
	}
	
	//Login Gmail
	public void Login(String email, String password)
	{
		setEmail(email);
		clickNext();
		setPassword(password);
		clickNext();
	}
}
