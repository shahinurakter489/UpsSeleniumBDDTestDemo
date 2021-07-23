package UpsActionPackage;






import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import UpsDriverPackage.DriverSetup;
import UpsPageElement.UpsLogInPageElements;

public class  UpsLoginAction {
	
	UpsLogInPageElements LogInElements;
	
	
	public UpsLoginAction() {
		
		this.LogInElements =new UpsLogInPageElements();
		PageFactory.initElements(DriverSetup.chromeDriver, LogInElements);
	}
	
	public void getLoginPage() {
		DriverSetup.chromeDriver.get("https://www.ups.com/lasso/ligin?");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
public void  inputUserID(String userId)	{
	LogInElements.userId.sendKeys(userId);
}
public void inputPassword(String password)	{
	LogInElements.password.sendKeys(password);
	
}
	

public void selectRememberUserId() {
	LogInElements.ermemberUserId.click();
}

public void clickSubmitButton() {
	LogInElements.submitButton.click();
}

public String errorMessage() {
	String error = LogInElements.errorMessage.getText();
	return error;
}

}
