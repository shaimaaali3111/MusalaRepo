package tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CompanyPage;
import pages.FacebookPage;
import pages.HomePage;

public class CompanyTest extends TestBase2 {
	
	HomePage homeobject;
	CompanyPage comapnyObject;
	HomePageTest homeTestObject;
	FacebookPage facebookPageObject;
	
	
	
	
	//testcase2
	@Test (priority=1,alwaysRun=true)
	public void verifyCompanyUrl() {
		homeobject = new HomePage(driver);
		comapnyObject = new CompanyPage(driver);
		homeTestObject = new HomePageTest();
		
		
		//open company tab
		homeobject.clickOnCompanyTab();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.musala.com/company/" );
		
	}
	
	
	
	
	
	
	//testcase2
	@Test (priority=2,alwaysRun=true)
	public void verifyLeadershipDisplayed() {
		comapnyObject = new CompanyPage(driver);
		homeTestObject = new HomePageTest();
		
		homeTestObject.scrollDown();
		comapnyObject.ValidateLeaderisDisplayed();
	}
	
	
	
	
	
	//testcase2
	@Test(priority=3,alwaysRun=true)
	public void verifyFacebookPage() throws InterruptedException {
		
		comapnyObject = new CompanyPage(driver);
		facebookPageObject = new FacebookPage(driver);
		
		
		comapnyObject.ClickOnAcceptButton();
		//comapnyObject.ClickOnFacebookIcon();
		
		Thread.sleep(2000);
		
		String currentWindowID =driver.getWindowHandle();
		comapnyObject.ClickOnFacebookIcon();
		for (String windowID : driver.getWindowHandles()) {
			String title = driver.switchTo().window(windowID).getTitle();
			if(title.equals("Musala Soft - Home")) {
				
				assertEquals("Musala Soft - Home", driver.getTitle());
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				
				String URL = driver.getCurrentUrl();
				
				Assert.assertEquals(URL,"https://www.facebook.com/MusalaSoft?fref=ts" );
				Thread.sleep(1000);
				
				//facebookPageObject.verifyMusalaProfilPicDisplayed();
				

				Boolean pic = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" "
				+ "&& arguments[0].naturalWidth > 0", facebookPageObject.musalaProfilPic);
				
				if (pic) {
			         System.out.println("profile pic present");
			      } else {
			         System.out.println("profile pic not present");
			      }
				
			}
			
			driver.switchTo().window(currentWindowID);
			
			
		}


	}
	
	
	
	
	
	
	
	
	

}
