package Com.Banking.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Banking.Utilites.Banking_TestUtils;
//base class all the pre-requsite are in this class and to refer the action in POM

public class Banking_baseClass {
	public static WebDriver driver;
	
	@BeforeMethod
	public void Initialization() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver_win32(v108)\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Banking_TestUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
   driver.manage().timeouts().pageLoadTimeout(Banking_TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	 
		driver.get("https://demo.guru99.com/V4/index.php");
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
