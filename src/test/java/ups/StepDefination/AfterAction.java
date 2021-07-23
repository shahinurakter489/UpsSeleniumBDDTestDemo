package ups.StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import UpsDriverPackage.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterAction {
	@After
	public void afterScenarioActions(Scenario scenario) {

		System.out.println(">> Scenario Execution Completed: " + scenario.getName());

		try {

			if (scenario.isFailed()) {

				String screenShotName = scenario.getName().replaceAll(" ", "_");
				TakesScreenshot ts = (TakesScreenshot) DriverSetup.chromeDriver;
				byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenShot, "image/png", screenShotName);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(">> Closing Chrome Brwoser");
		DriverSetup.quitChromeDriver();

	}
	


}
