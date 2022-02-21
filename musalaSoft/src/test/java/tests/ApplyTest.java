package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ApplyPage;
import pages.CreersPage;
import pages.HomePage;
import pages.ReactDevPage;

public class ApplyTest extends TestBase2{
	
	HomePageTest homeTestObject;
	ReactDevPage reactPageObject;
	ApplyPage applyPPageObject;
	CreersPage creersPageObject;
	HomePage homePageObject;
	
	
	//testcase3
	@Test(priority=1,alwaysRun=true)
	public void OpenApplyPopup() {
		
		reactPageObject =new ReactDevPage(driver);
		homeTestObject = new HomePageTest();
		
        homeTestObject.scrollDown();
		
		Assert.assertTrue(reactPageObject.applyButton.isDisplayed());
		
		
		//click on apply button
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(reactPageObject.applyButton)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
	}
	
	
	
	
	
	//testcase3
	@Test(priority=2,alwaysRun=true)
	public void fillApplyForm() throws InterruptedException {
		applyPPageObject =new ApplyPage(driver);
		
		applyPPageObject.fillApply("  ", "sh@m  ", " ");
		//applyPPageObject.clickCheckBox();
		
		
		
	//Upload file
		Thread.sleep(2000);
    String fileName="Testtt.docx";
	String filePath=System.getProperty("user.dir")+"/uploads/"+fileName;
    applyPPageObject.fileUploader.sendKeys(filePath);
      
		//checkbox
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement chickbox = wait.until(ExpectedConditions.elementToBeClickable(applyPPageObject.checkBox)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", chickbox);
		
		//click send button
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement sendButton = wait2.until(ExpectedConditions.elementToBeClickable(applyPPageObject.sendButton)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", sendButton);
		
		//click close button
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement closeButton = wait3.until(ExpectedConditions.elementToBeClickable(applyPPageObject.closeButton)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", closeButton);
		
		Thread.sleep(2000);
		
		//Verify shown error messages
		 Assert.assertTrue(applyPPageObject.nameErrorMessage.getText().contains("The field is required."));
	
		 Assert.assertTrue(applyPPageObject.emailErrorMessage.getText().contains("The e-mail address entered is invalid."));
		 System.out.println(applyPPageObject.emailErrorMessage.getText());
			
		 //click close icon
		 
		 WebDriverWait wait4 = new WebDriverWait(driver, 10);
			WebElement closeformIcon = wait4.until(ExpectedConditions.elementToBeClickable(applyPPageObject.closeIcon)); 
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", closeformIcon);
		
	
	}
	
	
	
	
	
	
	
	
	//Testcase4
	@Test(priority=3,alwaysRun=true)
	public void openCareerTab(){
		reactPageObject =new ReactDevPage(driver);
		homeTestObject = new HomePageTest();
		creersPageObject = new CreersPage(driver);
		homePageObject = new HomePage (driver);
		
		driver.navigate().to("https://www.musala.com/");
		
		homePageObject.clickOnCareersTab();
	
		creersPageObject.pressPositionsButton();
		
		
		
	}
	
	//Testcase4
		@Test(priority=4,alwaysRun=true)
		public void filterOpenPositionsBySofia() throws InterruptedException{
			
			
			creersPageObject.selectLocation("Sofia");
			Thread.sleep(2000);
			
			//get all open position by sofia
			for(WebElement element : creersPageObject.listOfElements) {
				System.out.println(element.getText());
				System.out.println("Position:"+element.getAttribute("data-alt"));
				System.out.println("More info:"+element.getAttribute("href"));
				
				
		}
	
		}
		
	    //Testcase4
				@Test(priority=5,alwaysRun=true)
				public void filterOpenPositionsBySkopje() throws InterruptedException{
					
					
					creersPageObject.selectLocation("Skopje");
					Thread.sleep(2000);
					
					//get all open position by Skopje
					
					for(WebElement element :creersPageObject.listOfElements2) {
						System.out.println(element.getText());
						System.out.println("Position:"+element.getAttribute("data-alt"));
						System.out.println("More info:"+element.getAttribute("href"));
						
				}
			
				}
}
