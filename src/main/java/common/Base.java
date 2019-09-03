package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base {

	public static WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void setUp(char Browser)
	{
		switch('C'){
		case 'C':
		System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		break;
	
		case 'F':
		System.setProperty("webdriver.gecko.driver","geckodriver.exe" );
		driver = new FirefoxDriver();
		break;
		}
	}

	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
}
