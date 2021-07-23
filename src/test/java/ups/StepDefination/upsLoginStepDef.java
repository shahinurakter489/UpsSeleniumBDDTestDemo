package ups.StepDefination;

import org.testng.Assert;

import UpsActionPackage.UpsLoginAction;
import UpsDriverPackage.DriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class upsLoginStepDef{
	
	UpsLoginAction upsLoginPageAction = new UpsLoginAction();
	
	@Given("Customer in UpsLogin page")
	public void customer_in_UpsLogin_page() {
		upsLoginPageAction.getLoginPage();	
	    
	}

	@When("Customer gives userId input {string}")
	public void customer_gives_userId_input(String userId) {
		upsLoginPageAction.inputUserID(userId);
	}

	@When("Customer givers password input {string}")
	public void customer_givers_password_input(String password) {
		upsLoginPageAction.inputPassword(password);  
	}

	@When("Customer click the submit button")
	public void customer_click_the_submit_button() {
		upsLoginPageAction.clickSubmitButton();
	}

	@Then("CustThen should be able to login")
	public void custthen_should_be_able_to_login() {
		String expectedURL = "https://www.ups.com/us/en/Home.page";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
  
	}

	@When("Customer gives userid input {string}")
	public void customer_gives_userid_input(String string) {
		String expectedURL = "https://www.ups.com/us/en/Home.page";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);

		
	}

}
