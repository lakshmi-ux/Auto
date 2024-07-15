package com.testscript;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSample extends Base {
	@Test
	public void verifyBackgroundButtonShowMessage() {
		String expectedBackgrdColour= "rgba(0, 123, 255, 1)";//expected testdata
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundColour=showMessageButton.getCssValue("background-color");
		assertEquals(expectedBackgrdColour,backgroundColour,"Background colour is not"+expectedBackgrdColour);
	}
	//HW
	@Test
	public void fontClrShowmsg() {
		boolean a=false; //just a sample
		String b= null; //null aanu expect cheyunna
		String c="abc"; //null akan padilatha case
		String expectedFontColour="rgba(255, 255, 255, 1)";
		WebElement showMessageButton1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) showMessageButton1));//HW
		boolean showButton= showMessageButton1.isDisplayed();
		String fontColour= showMessageButton1.getCssValue("color");
		assertEquals(expectedFontColour,fontColour,"Fontcolour is not"+expectedFontColour);
		assertTrue(showButton,"Show message button not available");
		assertFalse(a, "Button is displayed");
		assertNull(b, "Expected value is not null");
		assertNotNull(c,"Expected value is null");
	}
	
	@Test
	public void twoInputFields() {
		int a=2;
		int b=3;
		int c=a+b;
		String expectedTotalValue=String.valueOf(c);
		WebElement enterValue1= driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValue1.sendKeys(String.valueOf(a));
		WebElement enterValue2= driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValue2.sendKeys(String.valueOf(b));
		WebElement getTotalbutton= driver.findElement(By.xpath("//button[@id='button-two']"));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//obj creation for explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(getTotalbutton));//elementTo...thotte nammal kodukunatha
		wait.until(ExpectedConditions.presenceOfElementLocated((By) getTotalbutton));//HW
		getTotalbutton.click();
		wait.until(ExpectedConditions.elementToBeSelected(getTotalbutton));//HW
		WebElement getText2= driver.findElement(By.xpath("//div[@id='message-two']"));
		String text = getText2.getText();
	    String actualTotalValue1=text.substring(14);
		assertEquals(expectedTotalValue,actualTotalValue1,"Value is not"+expectedTotalValue );
	}
	
	/*@Test
	public void twoInputFields() {
		String val1= "laks";
		String val2="hmi";
		String totalVal=val1+val2;
		WebElement enterValue1= driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValue1.sendKeys(val1);
		WebElement enterValue2= driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValue2.sendKeys(val2);
		WebElement getTotalbutton= driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalbutton.click();
		WebElement getText2= driver.findElement(By.xpath("//div[@id='message-two']"));
		String text = getText2.getText();
	   // String expectedTotalValue="Total A + B : 5";
		//double expectedTotalValue=(String.valueOf("Total A + B : 5"));
	   // assertEquals(expectedTotalValue,getText2,"Value is not"+expectedTotalValue);
	}*/
	
	@Test
	public void verifyBackgroundClrGetTotal() {
		String expectedBackgrdColour= "rgba(0, 123, 255, 0)"; //real value is (0,123,125,1), failure case nokan avida 0 akiyatha
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundColour=showMessageButton.getCssValue("background-color");
		assertEquals(expectedBackgrdColour,backgroundColour,"Background colour is not"+expectedBackgrdColour);
	}
	@Test
	public void backgrdClrGetTotal() {
		String expectedFontColour="rgba(255, 255, 255, 1)";
		WebElement showMessageButton1=driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontColour= showMessageButton1.getCssValue("color");
		assertEquals(expectedFontColour,fontColour,"Fontcolour is not"+expectedFontColour);
	}
	public void softAssertSample() {
		
		String expectedFontColour="rgba(255, 255, 255, 1)";
		String expectedBackgrdColour= "rgba(0, 123, 255, 0)";
	    WebElement showMessageButton1=driver.findElement(By.xpath("//button[@id='button-one']"));
	    Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(30))
	            .pollingEvery(Duration.ofSeconds(5))
	            .ignoring(NoSuchElementException.class);
	    fluentWait.until(ExpectedConditions.visibilityOf(showMessageButton1));
	    fluentWait.until(ExpectedConditions.presenceOfElementLocated((By) showMessageButton1));//HW
		String fontColour= showMessageButton1.getCssValue("color");
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(expectedFontColour,fontColour,"Fontcolour is not"+expectedFontColour);
		String backgroundColour=showMessageButton1.getCssValue("background-color");
		softAssert.assertEquals(expectedBackgrdColour,backgroundColour,"Background colour is not"+expectedBackgrdColour);
		softAssert.assertAll();
	}
	//HW
	@Test
	public void radioButton1() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofSeconds(5))
		            .ignoring(NoSuchElementException.class);
		    fluentWait.until(ExpectedConditions.elementToBeClickable(maleRadioButton));//HW
		maleRadioButton.click();
		fluentWait.until(ExpectedConditions.elementToBeSelected(maleRadioButton));//HW
		boolean isButtonSelected= maleRadioButton.isSelected();
		assertTrue(isButtonSelected, "Button not selected");
	}
	@Test
	public void falseButtonCase() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton1= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		maleRadioButton1.click();
		WebElement femaleRadioButton= driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isButtonSelected= femaleRadioButton.isSelected();
		assertFalse(isButtonSelected, "Is selected");
	}

}
