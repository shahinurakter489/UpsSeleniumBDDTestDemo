package UpsDriverPackage;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static ChromeDriver chromeDriver;
	
	public static void setupChromeDriver() {

		// System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriverManager.chromedriver().setup();
		chromeDriver  = new ChromeDriver();

	}
	
	public static void quitChromeDriver(){
	  chromeDriver.quit();	
	}
}
