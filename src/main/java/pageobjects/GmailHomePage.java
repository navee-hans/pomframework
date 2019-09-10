package pageobjects;

import org.openqa.selenium.By;

import common.PageActions;

public class GmailHomePage {
	PageActions pageactions =  new PageActions();
	By InboxLocator = By.cssSelector("a[title='Inbox']");
	By InboxEmails = By.xpath("//table[@class='F cf zt']//tr");
	By LeftFoldersLocator = By.xpath("//div[contains(@class, 'aim')]//span//a");
	By SearchBoxLocator = By.name("q");
	By ComposeLocator = By.cssSelector("div[class*='T-I J-J5-Ji T-I-KE L3']");
	By RecepientAddressLocator = By.cssSelector("textarea[name='to']");
	By SubjectLocator = By.cssSelector("input[name='subjectbox']");
	By ContentLocator = By.cssSelector("div[id=':9y']");
	By SendLocator = By.cssSelector("div[id=':8j']");
	By AttachmentLocator = By.cssSelector("div[id=':ab']");
	By EmailsLocator = By.xpath("//table[@class='F cf zt']//tr");
	
	
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
	
	public void clickComposeButton()
	{
		pageactions.clickButton(ComposeLocator);
	}
	
	public void setRecepientAddress(String recepientaddress)
	{
		pageactions.setText(recepientaddress,RecepientAddressLocator );
	}
	
	public void setSubject(String subject)
	{
		pageactions.setText(subject, SubjectLocator );
	}
	
	public void setMailContent(String content)
	{
		pageactions.setText(content, ContentLocator );
	}
	
	public void clickSendButton()
	{
		pageactions.clickButton(SendLocator);
	}	
	
	public void clickAttachmentButton()
	{
		pageactions.clickButton(AttachmentLocator);
	}
}
