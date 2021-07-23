package ups.StepDefination;

import UpsDriverPackage.DriverSetup;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import UpsDriverPackage.DriverSetup;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAction {
	
	@Before
	public void beforeScenarioAction(Scenario scenario) {
		
			System.out.println(">>>Initialising Chrome Driver  <<<");
	DriverSetup.setupChromeDriver();
	System.out.println(">>Scenario Executed:" +scenario.getName() );
	
	
	}
		
	
	

}
