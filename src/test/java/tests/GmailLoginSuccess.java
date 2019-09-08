package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.Base;
import common.PageActions;
import pageobjects.GmailHomePage;
import pageobjects.GmailPage;
import pageobjects.GmailSignInPage;

public class GmailLoginSuccess extends Base{

	
	@Test(groups="Smoke")
	public void loginGmail()
	{
		
		PageActions pageaction = new PageActions();
		//Store current page title
		String ParentWindowTitle = pageaction.getPageTitle();
		
		//Store password in locally
		String pass = "nh18Jan_";
		GmailPage gmailpage = new GmailPage();
		
		//Click on Sign in
		gmailpage.clickSignIn();
		
		//Switch to new window
		pageaction.switchWindow(ParentWindowTitle);
		
		GmailSignInPage gmailsignin = new GmailSignInPage();
		
		//Login to gmail
		gmailsignin.Login("automationnavi@gmail.com", pass );
		
		//Verify that user login successfully
		GmailHomePage homepage = new GmailHomePage(); 
		Assert.assertTrue(homepage.isInboxTextDisplayed("Inbox"));
		
	}
}
