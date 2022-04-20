package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import base.Baseclass;
import utility.*;
import pom.KiteHomepage;
import pom.LoginKite;

public class Testcase001 {
	WebDriver driver;
	LoginKite log;
	KiteHomepage hm;
	int tcId;
	Utilclass util=new Utilclass();
	
	
	@BeforeClass
	public void openbrowser() throws InterruptedException {
		Baseclass b=new Baseclass();
		driver=Baseclass.driverinit();
		log=new LoginKite(driver);
		hm=new KiteHomepage(driver);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		log.enteruserid();
		Thread.sleep(2000);
	
	}
	@BeforeMethod
	public void logintoapp() throws InterruptedException {
	    log.enterpasswd();
		Thread.sleep(2000);
		log.clickonlogin();
		Thread.sleep(2000);
		log.enterpin();
		Thread.sleep(2000);
		log.clickoncontinue();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void verifydashboard() throws InterruptedException {
		tcId=1001;
		hm.clickOndashboard();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		SoftAssert s=new SoftAssert();
		s.assertEquals(url, "https://kite.zerodha.com/dashboard");
		s.assertAll();		
	}
	@Test(priority=1)
	public void verifyorders() throws InterruptedException {
		tcId=1002;
		
		hm.clickOnorders();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		SoftAssert s=new SoftAssert();
		s.assertEquals(url, "https://kite.zerodha.com/orders");
		s.assertAll();		
	}
	@Test(priority=2)
	public void verifyholdings() throws InterruptedException {
		tcId=1003;
		
		hm.clickOnholdings();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		SoftAssert s=new SoftAssert();
		s.assertEquals(url, "https://kite.zerodha.com/holdings");
		s.assertAll();		
	}
	@Test(priority=3)
	public void verifyfunds() throws InterruptedException {
		tcId=1004;
		
		hm.clickOnfunds();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		SoftAssert s=new SoftAssert();
		s.assertEquals(url, "https://kite.zerodha.com/funds");
		/*Thread.sleep(2000);
		hm.clickonaddfunds();
		Thread.sleep(2000);
		
		s.assertEquals(url, "https://cashier.zerodha.com/?type=login");*/
		
		s.assertAll();		
	}
	
	@AfterMethod
	public void captureScrenshot(ITestResult res) throws IOException, InterruptedException {
		if(ITestResult.FAILURE==res.getStatus()) {
		util.takeScreenshot(driver,tcId);
		Thread.sleep(2000);
		}
		hm.clickOnuser();
	      Thread.sleep(2000);
	      hm.clickOnLogout();
	      
		
	}
		@AfterClass
	public void closebroswer() {
		driver.quit();

	
		}
}
