package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name ="your-name")
	WebElement nameField;
	
	@FindBy(name ="your-email")
	WebElement emailField;
	
	@FindBy(name ="mobile-number")
	WebElement mobileField;
	
	@FindBy(name ="your-subject")
	WebElement subjectField;
	
	@FindBy(name ="your-message")
	WebElement messageField;
	
	@FindBy(css ="input[type='submit']")
	WebElement sendButton;
	
	@FindBy(xpath  ="//span[contains(text(),'The e-mail address entered is invalid.')]")
	public WebElement errorMessage;
	
	@FindBy(id  ="fancybox-close")
	WebElement closeIcon;
	
	
	
	
	public void fillContactUs (String name,String email,String mobile, String subject,String message)
	{
		setTextelementtext(nameField, name);
		setTextelementtext(emailField, email);
		setTextelementtext(mobileField, mobile);
		setTextelementtext(subjectField, subject);
		setTextelementtext(messageField, message);
		
		
		
	}
	
	public void clickOnSendButton()
	{
		
		clickButton(sendButton);
	}
	
	public void clickOnCloseIcon()
	{
		
		clickButton(closeIcon);
	}
	
	public void clearContactUsFields() {
		
		nameField.clear();
		emailField.clear();
		mobileField.clear();
		subjectField.clear();
		messageField.clear();
	}
	
	

}
