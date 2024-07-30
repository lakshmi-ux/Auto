package com.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TwoInputFielsdAssert extends Base {
	
	@Test	
	public void verifyTwoInputFields() {
		
		WebElement actualValue1= driver.findElement(By.xpath("//input[@id='value-a']"));
		actualValue1.sendKeys("2");
		WebElement actualValue2= driver.findElement(By.xpath("//input[@id='value-b']"));
		actualValue2.sendKeys("4");
		WebElement getTotalbutton= driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalbutton.click();
		WebElement getText2= driver.findElement(By.xpath("//div[@id='message-two']"));
		String result=getText2.getText();
		String expectedVal="Total A + B : 6";
		//String expectedVal=" 6";
		assertEquals(expectedVal, result,"Value is not"+expectedVal);
	}
	

}
