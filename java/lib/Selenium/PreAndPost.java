package lib.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PreAndPost extends WebDriverServiceImpl {
 
	 
  @BeforeMethod
  public void beforeMethod() {
	
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			webdriver = new ChromeDriver();
			
			driver = new EventFiringWebDriver(webdriver);
			driver.register(this);
			
			driver.manage().window().maximize();
			driver.get("http://www.leaftaps.com/opentaps");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  closeAllBrowsers();
	  System.out.println("Print after method test case executed successfully");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Print before class test case executed successfully");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Print after class test case executed successfully");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Print beforetest method test case executed successfully");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Print aftertest method test case executed successfully");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Print Beforesuite method test case executed successfully");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Print AfterSuite method test case executed successfully");
  }

}
