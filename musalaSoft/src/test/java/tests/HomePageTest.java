package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends TestBase2 {
	
	HomePage homeobject;
	
	 @Test
	 public void scrollDown() {
		 
		 JavascriptExecutor jsx = (JavascriptExecutor)driver;
		 jsx.executeScript("window.scrollBy(0,1000)", "");
		 
		 
		 
	 }
	 
//	//testcase1
//	@Test (priority=1,alwaysRun=true)
//	public void pressOnContactUs()
//	{
//
//		homeobject = new HomePage(driver);
//		
//		homeobject.clickOnContactUs();
//
//	}
	
	
	
	

}
