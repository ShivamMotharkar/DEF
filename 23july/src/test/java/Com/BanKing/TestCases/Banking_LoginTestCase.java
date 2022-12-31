package Com.BanKing.TestCases;



import org.testng.annotations.Test;

import Com.Banking.BaseClass.Banking_baseClass;
import Com.Banking.PageObject.Banking_LoginPage;

public class Banking_LoginTestCase extends Banking_baseClass {

	
	@Test
	public void LoginTest() {
		
		
		Banking_LoginPage bl = new Banking_LoginPage();
		bl.SetUsername("mngr464176");
	
		bl.SetPass("Ygabane");
		bl.Clickbtn();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
	}
}
