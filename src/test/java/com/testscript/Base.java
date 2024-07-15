package com.testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver; //for global decleration, so enni driver enne vilichal mathi
	@BeforeMethod
	public void initializeBrowser() {
		driver = new ChromeDriver(); //ingana cheythaley url access cheyan pattu
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}

	

}
