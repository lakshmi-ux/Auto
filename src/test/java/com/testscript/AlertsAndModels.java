package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertsAndModels extends Base {
	public void alertsAndModels() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click1= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));//simple alert pop-up
		click1.click();
		String alertValue=driver.switchTo().alert().getText();//pop-up value get akan
		driver.switchTo().alert().accept();//accept koduthal ok button click aakum
		WebElement click2= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));//taking confirmation pop-up
		click2.click();
		driver.switchTo().alert().dismiss();//cancel cheyan
		WebElement click3= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));//prompt pop-up means asking a value and we should enter it to proceed
		click3.click();
		driver.switchTo().alert().sendKeys("laks");//value enter aakan
		driver.switchTo().alert().accept();
		}

	public static void main(String[] args) {
		AlertsAndModels alertsandmodels= new AlertsAndModels();
		alertsandmodels.initializeBrowser();
		alertsandmodels.alertsAndModels();
		//alertsandmodels.driverQuit();

	}

}
