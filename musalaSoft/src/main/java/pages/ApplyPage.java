package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ApplyPage extends PageBase {

	public ApplyPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name ="your-name")
	WebElement nameField;
	
	@FindBy(name ="your-email")
	WebElement emailField;
	
	@FindBy(name ="mobile-number")
	WebElement mobileField;
	
	@FindBy(css ="input[type='submit']")
	public WebElement sendButton;
	
	@FindBy(id ="adConsentChx")
	public WebElement checkBox;
	
	@FindBy(name ="upload-cv")
	public WebElement fileUploader;
	
	@FindBy(name ="uploadtextfield")
	public WebElement uploadTextField;
	
	@FindBy(className ="close-form")
	public WebElement closeButton;
	
   @FindBy(xpath  = " //span[text()='The field is required.']")

	public WebElement nameErrorMessage;
	
	@FindBy(xpath ="//span[text()='The e-mail address entered is invalid.']")
	public WebElement emailErrorMessage;
	
	
	@FindBy(id="fancybox-close")
	public WebElement closeIcon;
	
	
	
	
	
	public void fillApply (String name,String email,String mobile) {
		
		setTextelementtext(nameField, name);
		setTextelementtext(emailField, email);
		setTextelementtext(mobileField, mobile);
		
	}
	

	public void clickOnSendButton()
	{
		
		clickButton(sendButton);
	}
	
	public void clickCheckBox()
	{
		
		clickButton(checkBox);
	}
	
	
	
	
	
	

}
