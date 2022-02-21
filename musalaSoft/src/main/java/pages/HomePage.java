package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css="span[data-alt='Contact us']")
	WebElement ContactUs;
	
	@FindBy(linkText = "COMPANY")
	WebElement companyTab;
	
	@FindBy(linkText = "CAREERS")
	WebElement careersTab;
	
	public void clickOnContactUs ()
	{
		
		clickButton(ContactUs);
	}
	
	public void clickOnCompanyTab ()
	{
		
		clickButton(companyTab);
	}
	
	public void clickOnCareersTab ()
	{
		
		clickButton(careersTab);
	}
	
  

}
