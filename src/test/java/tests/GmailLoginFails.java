package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.Base;
import common.PageActions;
import pageobjects.GmailPage;
import pageobjects.GmailSignInPage;

public class GmailLoginFails extends Base{

	@Test(groups="Smoke")
	public void loginFails()
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
		gmailsignin.Login("naveehans", pass );
		
		//Verify that user error message is displayed
		Assert.assertTrue(gmailsignin.isWrongPasswordMessage(ErrorMessage), "Wrong password error message should not be displayed");
	}
}
