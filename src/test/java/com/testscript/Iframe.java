package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe extends Base{
	public void iFrame() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frame= driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frame);
		WebElement adFrame= driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		adFrame.click();
	}

	public static void main(String[] args) {
		Iframe iframe= new Iframe();
		iframe.initializeBrowser();
		iframe.iFrame();
		//iframe.driverQuit();
   }
}
