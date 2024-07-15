package com.testscript;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecuterSample extends Base{
	@Test
	public void scrollSamples() {
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll down cheyan
		js.executeScript("window.scrollBy(0,350)", "");
		//scroll up
		js.executeScript("window.scrollBy(0,-350)", "");
		
	}

}
