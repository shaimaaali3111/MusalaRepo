package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage extends PageBase {

	public FacebookPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//g[@mask='url(#jsc_c_2)']")
	 public WebElement musalaProfilPic;
	
	public void verifyMusalaProfilPicDisplayed()
	{
		
		musalaProfilPic.isDisplayed();
	}

}
