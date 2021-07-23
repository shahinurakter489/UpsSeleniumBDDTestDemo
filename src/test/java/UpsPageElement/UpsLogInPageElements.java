package UpsPageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLogInPageElements {

	@FindBy(id="email")
	public WebElement userId;
	
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(xpath= "//lable[@class='ups-from_label ups-checkbox-custom-label']")
	public WebElement ermemberUserId;
	
	
	@FindBy (xpath="//*[@id='submitBtn']")
	public WebElement submitButton;
	
	@FindBy(id="errorMessages")
	public WebElement errorMessage;
	
	
	
}
