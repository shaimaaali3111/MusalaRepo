package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreersPage extends PageBase {

	public CreersPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(css = "span[data-alt='Check our open positions']")
	 public WebElement openPositionsButton;
	
	@FindBy(id = "get_location")
	 public WebElement locationDropdownList;
	
	@FindBy(xpath  = "//h2[contains(text(),'React Developer')]")
	 public WebElement reactPosition;
	
	@FindBy(xpath  = "//p[contains(text(),'Sofia')]")
	public List<WebElement> listOfElements;
	
	@FindBy(xpath  = "//p[contains(text(),'Skopje')]")
	public List<WebElement> listOfElements2;
	
	
	
	
	
	
	public void pressPositionsButton()
	{
		
		clickButton(openPositionsButton);
	}
	
	public void selectLocation(String value) {
	
	Select valueDropdown=new Select(locationDropdownList);
	valueDropdown.selectByValue(value);
	}
	
	public void clickReactPosition() {
		
		clickButton(reactPosition);
	}
	
	
	


}
