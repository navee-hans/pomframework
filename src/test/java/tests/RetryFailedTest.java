package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Base;
import common.PageActions;
import pageobjects.GmailPage;
import pageobjects.GmailSignInPage;

public class RetryFailedTest extends Base {

	@Test(groups="Smoke")
	public void retryFailedTest()
	{
		PageActions pageaction = new PageActions();
		//Store current page title
		String ParentWindowTitle = pageaction.getPageTitle();
		
		//Store password in locally
		String pass = "nh12345";
		String ErrorMessage = "Wrong password. Try again or click Forgot password to reset it.";
		GmailPage gmailpage = new GmailPage();
		
		//Click on Sign in
		gmailpage.clickSignIn();
		
		//Switch to new window
		pageaction.switchWindow(ParentWindowTitle);
		
		GmailSignInPage gmailsignin = new GmailSignInPage();
		
		//Login to gmail
		gmailsignin.Login("hansnavee1502", pass );
		
		//Verify that user error message is displayed
		Assert.assertFalse(gmailsignin.isWrongPasswordMessage(ErrorMessage), "Wrong Password error message is displayed");
	}
}
