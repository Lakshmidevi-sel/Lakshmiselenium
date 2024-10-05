package HRMS.com.Hrms.HR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverTest {

    WebDriver driver;
	 //@BeforeClass - Run before Executing all test cases in the current class/program 
	 @BeforeClass
	 public void openbrowser() { 
           driver = new FirefoxDriver();

	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/?");
	 }

	//@AfterClass- Run After Executing all test cases in the current class/program
	 @AfterClass
	 public void closebrowser() {
	  System.out.print("\nBrowser close");
	  driver.quit();
	 }
	
	 @Test
	 public void verifyTitle() {
	   String title = driver.getTitle();
	   System.out.print("Current page title is : "+title);
	  Assert.assertEquals(title,"Google");
	 }
	}

