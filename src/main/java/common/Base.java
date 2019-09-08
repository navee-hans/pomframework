package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base {

	public static WebDriver driver;
	public  static String URL = "https://www.google.com/intl/en-GB/gmail/about/#"; 

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public static void setUp(char Browser)
	{
		switch(Browser){
		case 'C':
		System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		break;
	
		case 'F':
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		break;
		}
		
	}
	
	@AfterClass(alwaysRun=true)
	public static void tearDown()
	{
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
}
