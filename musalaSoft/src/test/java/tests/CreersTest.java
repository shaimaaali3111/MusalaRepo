package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CreersPage;
import pages.HomePage;
import pages.ReactDevPage;

public class CreersTest extends TestBase2 {
	
	HomePage homePageObject;
	CreersPage creersPageObject;
	HomePageTest homeTestObject;
	ReactDevPage reactPageObject;
	
	
	//testcase3
	@Test(priority=1,alwaysRun=true)
	public void naviagteToCareer() throws InterruptedException {
		
		homePageObject = new HomePage(driver);
		creersPageObject = new CreersPage(driver);
		
		homePageObject.clickOnCareersTab();
		creersPageObject.pressPositionsButton();
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.musala.com/careers/join-us/" );
		
		creersPageObject.selectLocation("Anywhere");
		Thread.sleep(2000);
		
	}
	
	
	
	//testcase3
	@Test (priority=2,alwaysRun=true)
	public void naviagteToPosition()
	{
		
	    homeTestObject = new HomePageTest();
		creersPageObject = new CreersPage(driver);
		
		
		homeTestObject.scrollDown();
		creersPageObject.clickReactPosition();
			
		
	}
	
	
	
	//testcase3
	@Test (priority=3,alwaysRun=true)
	public void checkItemesDisplay() throws InterruptedException {
			
		reactPageObject =new ReactDevPage(driver);
		homeTestObject = new HomePageTest();
		
		Assert.assertTrue(reactPageObject.generalDescriptionTitel.isDisplayed());
		Assert.assertTrue(reactPageObject.requirementsTitel.isDisplayed());
		Assert.assertTrue(reactPageObject.responsibilitiesTitel.isDisplayed());
		Assert.assertTrue(reactPageObject.whatWeOfferTitel.isDisplayed());
		
		
		
	}
	
	
	
	

}
