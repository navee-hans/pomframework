package tests;

import org.testng.annotations.Test;
import common.Base;
import pageobjects.GmailPage;

public class TC_01 extends Base{
	
	@Test
	public void test()
	{
		GmailPage gmail = new GmailPage();
		gmail.clickCreateAnAccount();
	}
	
}
