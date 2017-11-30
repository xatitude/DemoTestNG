package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest2 {

	public WebDriver driver;

	@Test
	public void method() {

		// Find the element that's ID attribute is 'account'(My Account)

		driver.findElement(By.id("account")).click();

		// Find the element that's ID attribute is 'log' (Username)

		// Enter Username on the element found by above desc.

		driver.findElement(By.id("log")).sendKeys("xatitude");

		// Find the element that's ID attribute is 'pwd' (Password)

		// Enter Password on the element found by the above desc.

		driver.findElement(By.id("pwd")).sendKeys("xatitude@123");

		// Now submit the form. WebDriver will find the form for us from the element

		driver.findElement(By.id("login")).click();

		// Print a Log In message to the screen

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		// Find the element that's ID attribute is 'account_logout' (Log Out)

		driver.findElement(By.id("account_logout"));

	}

	@BeforeTest
	public void beforeMethod() {

		// Create a new instance of the gecko driver

		String exePath = "C:\\Users\\Akshat\\Downloads\\NewDrivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		driver = new FirefoxDriver();

		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();

		//Launch the Online Store Website

		driver.get("http://store.demoqa.com/");


	}

	@AfterTest
	public void afterMethod() {

		// Close the driver

		driver.quit();

	}

}