package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driverinit() {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		
		return driver;
		
	}


}
