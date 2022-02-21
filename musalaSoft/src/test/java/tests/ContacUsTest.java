package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContacUsTest extends TestBase2 {
	
	ContactUsPage contactUsObject;
	
	 
	
	//testcase1
	@Test (priority=1,alwaysRun=true)
	public void fillContactUsForm() throws InterruptedException
	{

		contactUsObject = new ContactUsPage(driver);
		contactUsObject.fillContactUs("shaimaa", "sh@","01100987665","test","please call me");
		contactUsObject.clickOnSendButton();
        Assert.assertTrue(contactUsObject.errorMessage.getText().contains("The e-mail address entered is invalid."));
        
        contactUsObject.clickOnCloseIcon();


	}


}
