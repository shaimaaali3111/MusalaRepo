package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends PageBase{

	public CompanyPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(className ="cm-content")
	public WebElement leadershipText;
	
	@FindBy(xpath ="//span[@class='musala musala-icon-facebook']")
	 public WebElement facebookIcon;
	
	@FindBy(id ="wt-cli-accept-all-btn")
	 WebElement acceptButton;
	
	
	
	public void ValidateLeaderisDisplayed()
	{
		leadershipText.isDisplayed();
	}
	
	public void ClickOnAcceptButton()
	{
		
		clickButton(acceptButton);
	}
	
	public void ClickOnFacebookIcon()
	{
		
		clickButton(facebookIcon);
	}
	
	
	

}
