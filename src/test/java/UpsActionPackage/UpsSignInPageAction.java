package UpsActionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import UpsDriverPackage.DriverSetup;
import UpsPageElement.UpsSignPageElements;

public class UpsSignInPageAction {
	
	UpsSignPageElements SignInElements;
	
	public UpsSignInPageAction () {
		
		this.SignInElements = new UpsSignPageElements();
		PageFactory.initElements(DriverSetup.chromeDriver, SignInElements);
	}
	
	public void getSignInPage() {
		DriverSetup.chromeDriver.get("https://wwwapps.ups.com/doapp/signup?");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void inputUserName(String userName) {
		SignInElements.userName.sendKeys(userName);	
		
	}

	public void inputemail(String email) {
		SignInElements.userName.sendKeys(email);	

	}

public void inputuserId(String userId) {
SignInElements.userId.sendKeys(userId);

}
public void inputPassword(String password) {
	SignInElements.password.sendKeys(password);
	}

public void inputPhoneNumber(String phoneNumber) {
	SignInElements.phonenumber.sendKeys(phoneNumber);

}
public void clickButton() {
	SignInElements.clickButn.click();
}





}	
	
	
	
	


