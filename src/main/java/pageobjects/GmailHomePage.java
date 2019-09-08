package pageobjects;

import org.openqa.selenium.By;

import common.PageActions;

public class GmailHomePage {
	PageActions pageactions =  new PageActions();
	By InboxLocator = By.cssSelector("a[title='Inbox']");
	By InboxEmails = By.xpath("//table[@class='F cf zt']//tr");
	By LeftFoldersLocator = By.xpath("//div[contains(@class, 'aim')]//span//a");
	By SearchBoxLocator = By.name("q");
	
	//
	public boolean isInboxTextDisplayed(String expectedtext)
	{
		return pageactions.isElementTextDisplayed(expectedtext, InboxLocator);
	}
	
	public void clickfolder(String foldertext)
	{
		pageactions.clickOnLeftFolderLinks(LeftFoldersLocator, foldertext);
	}
	
	public boolean isStarredTextDisplayed(String expectedtext)
	{
		return pageactions.isElementTextDisplayed(expectedtext, SearchBoxLocator);
	}
}
