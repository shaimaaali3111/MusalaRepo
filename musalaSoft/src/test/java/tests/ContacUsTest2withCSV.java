package tests;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.ContactUsPage;
import pages.HomePage;

public class ContacUsTest2withCSV extends TestBase2 {
	
	ContactUsPage contactUsObject;
	
	HomePage homeobject;
	CSVReader reader;
	
	//testcase1
	@Test (priority=1,alwaysRun=true)
	public void fillContactUsForm() throws CsvValidationException, IOException
	{
       //get path of csv file
		String csv_file=System.getProperty("user.dir")+"/src/test/java/data/WrongEmailFile.csv";
		
		reader = new CSVReader(new FileReader(csv_file));
		
		String [] csvCell;
		
		  while ((csvCell =reader.readNext()) != null) {
			String email= csvCell[0];
			
			
			homeobject = new HomePage(driver);
			contactUsObject = new ContactUsPage(driver);
			homeobject.clickOnContactUs();
			
		    contactUsObject.clearContactUsFields();
			contactUsObject.fillContactUs("shaimaa", email,"01100987665","test","please call me");
			contactUsObject.clickOnSendButton();
	        Assert.assertTrue(contactUsObject.errorMessage.getText().contains("The e-mail address entered is invalid."));
	        
	        contactUsObject.clickOnCloseIcon();
	        
		}
		
		


	}


}
