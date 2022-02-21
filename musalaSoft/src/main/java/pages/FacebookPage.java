package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage extends PageBase {

	public FacebookPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//circle[@class='mlqo0dh0 georvekb s6kb5r3f']")
	 public WebElement musalaProfilPic;
	
	public void verifyMusalaProfilPicDisplayed()
	{
		
		musalaProfilPic.isDisplayed();
	}

}
