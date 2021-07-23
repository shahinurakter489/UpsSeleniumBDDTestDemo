package UpsPageElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsSignPageElements {

	
	@FindBy(id="userName")
	public WebElement userName;
	
	@FindBy(id="email")
	public WebElement emailId;
	
	@FindBy(id="userID")
	public WebElement userId;
	
	@FindBy (id="password")
	public WebElement password;
	
	@FindBy(name="phoneNumber")
	public WebElement phonenumber;
	
	
	@FindBy(xpath="//*[@id=\"ups-checkbox_group\"]/div/label")
	public WebElement clickButn;
	
}
