package Com.Banking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Banking.BaseClass.Banking_baseClass;

public class Banking_LoginPage extends Banking_baseClass {

	
//1 declare the construction with driver and this keyword parameter with pagefactory method
//to initialize the web element on POm Page
	
	public Banking_LoginPage() {
		PageFactory.initElements(driver, this);
	}
//2. use findBy annotation to locate the WebElements in pom
	
	@FindBy(name="uid")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(name = "btnLogin")
	public WebElement LoginBtn;
	

//3. declare methods for path operation
	
	public void SetUsername(String name) {
		username.sendKeys();
	}
	
	public void SetPass(String pwd) {
		pass.sendKeys();
	}
	
	public void Clickbtn() {
		LoginBtn.click();
	}
}
//mngr464176
//Ygabane