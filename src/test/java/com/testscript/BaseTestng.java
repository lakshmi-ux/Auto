package com.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestng {
	public WebDriver driver; //for global decleration, so enni driver enne vilichal mathi
	public void initializeBrowser() {
		driver = new ChromeDriver(); //ingana cheythaley url access cheyan pattu
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
	}
	public void driverQuit() {
		driver.quit();
	}

	public static void main(String[] args) {
		BaseTestng base= new BaseTestng();
		base.initializeBrowser();
		base.driverQuit();

	}

}
