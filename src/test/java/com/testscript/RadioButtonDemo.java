package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonDemo extends Base{
	public void navigateRadio() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	}
	public void radioButtonDemo() {
		
		WebElement radioButton= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isradioButtonDisplayed=radioButton.isDisplayed();//particular value displayed aano eene nokan aanu "isDisplayed"
		radioButton.click();
		boolean isradioButtonSelected=radioButton.isSelected();
		WebElement showSelectButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectButton.click();
		WebElement showAnswer=driver.findElement(By.xpath("//div[@id='message-one']"));
		String Answer=showAnswer.getText();
		
		WebElement radioButton2= driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radioButton2.click();
		WebElement showSelectButton1=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectButton1.click();
		WebElement showAnswer1=driver.findElement(By.xpath("//div[@id='message-one']"));
		String Answer1=showAnswer1.getText();
		
		
	}

	public static void main(String[] args) {
		RadioButtonDemo radiobuttondemo=new RadioButtonDemo();
		radiobuttondemo.initializeBrowser();
		radiobuttondemo.navigateRadio();
		radiobuttondemo.radioButtonDemo();
		//radiobuttondemo.driverQuit();

	}

}
