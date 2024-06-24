package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocators extends Base {
	public void xpathMethod() {
		WebElement xPathConatins=driver.findElement(By.xpath("//input[contains(@id,'unifiedLocation1ClickAddress')]"));
		WebElement xPathStarts=driver.findElement(By.xpath("//input[starts-with(@id,'unifiedLocation1ClickAddress')]"));
		WebElement xPathText=driver.findElement(By.xpath("//h2[text()='Appliances for your home | Up to 55% off']"));
		WebElement xPathOr=driver.findElement(By.xpath("//span[text()='Update location' or @id='glow-ingress-line2']"));
		WebElement xPathAnd=driver.findElement(By.xpath("//span[text()='Update location' and @id='glow-ingress-line2']"));
		}
	public void navigateObsqura() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//containers
		WebElement xPathConatins1=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement xPathConatins2=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
		WebElement xPathConatins3=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		//start-with
		WebElement xPathStarts1=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		WebElement xPathStarts2=driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
		WebElement xPathStarts3=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		//text
		WebElement xPathText1=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xPathText2=driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement xPathText3=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		//OR
		WebElement xPathOr1=driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement xPathOr2=driver.findElement(By.xpath("//button[text()='Get Total' or @id='button-two']"));
		WebElement xPathOr3=driver.findElement(By.xpath("//div[text()=' Your Message :' or @id='message-one']"));
		//And
		WebElement xPathAnd1=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		WebElement xPathAnd2=driver.findElement(By.xpath("//button[text()='Get Total' and @id='button-two']"));
		WebElement xPathAnd3=driver.findElement(By.xpath("//div[text()=' Your Message :' and @id='message-one']"));
	}

	public static void main(String[] args) {
		XpathLocators xpathlocators= new XpathLocators();
		xpathlocators.initializeBrowser();
		xpathlocators.navigateObsqura();
		xpathlocators.xpathMethod();
		
		xpathlocators.driverQuit();
		}
}
