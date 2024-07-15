package com.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumDevSample extends Base{
	public void sampleList(String menuBuffer) {
		driver.navigate().to("https://www.selenium.dev/");
		WebElement dropDown=driver.findElement(By.xpath("//div[@class='dropdown']"));
		dropDown.click();
		List<WebElement> menuList2=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//a"));
		////ul[@class='dropdown-menu show'//a
		//div[@class='dropdown']//child::ul[@class='dropdown-menu show']//a
		//div[@class='dropdown']//a--correct vannu
		for(WebElement menu2:menuList2) {
			String value2=menu2.getText();
			if(value2.equals(menuBuffer)) {
				menu2.click();
				break;
			}
		}
	}
	public static void main(String[] args) {
		SeleniumDevSample seleniumdevsample= new SeleniumDevSample();
		seleniumdevsample.initializeBrowser();
		seleniumdevsample.sampleList("Português (Brasileiro)");
		//seleniumdevsample.driverQuit();

	}

}
