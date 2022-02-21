package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReactDevPage extends PageBase {

	public ReactDevPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath  = "//h2[contains(text(),'General description')]")
	 public WebElement generalDescriptionTitel;
	
	@FindBy(xpath  = "//h2[contains(text(),'Requirements')]")
	 public WebElement requirementsTitel;
	
	@FindBy(xpath  = "//h2[contains(text(),'Responsibilities')]")
	 public WebElement responsibilitiesTitel;
	
	@FindBy(xpath  = "//h2[contains(text(),'What we offer')]")
	 public WebElement whatWeOfferTitel;
	
	@FindBy(xpath = "//*[@value='Apply']")
	 public WebElement applyButton;
	

	
	

}
