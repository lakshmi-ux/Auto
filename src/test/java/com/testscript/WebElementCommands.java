package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base  {
	public void verifySingleInputField() {
		String inputToTextField="Lakshmi";
		WebElement enterMessageTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessageTextField.sendKeys(inputToTextField);//textfield il value enter cheyan aanu sendkeys
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String tagName= showMessageButton.getTagName();//to get tagname
		String id=showMessageButton.getAttribute("id");//to find id value
		String backgroundColour=showMessageButton.getCssValue("background-color");//to find an element colour
		//HW
		String fontColour= showMessageButton.getCssValue("color");//to find an element font colour
		
		showMessageButton.click();
		WebElement yourMessageGet=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText= yourMessageGet.getText();
		//compare
		String yourMessageField=yourMessageText.substring(15);//oru variable ilote "Lakshmi" mathram assign cheythathe aanu ethe.
		if(yourMessageField.equals(inputToTextField)) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}
		//GET TOTAL BUTTON
		double a=2;
		double b=3;
		double c=a+b;
		WebElement enterValue1= driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValue1.sendKeys(String.valueOf(a));
		WebElement enterValue2= driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValue2.sendKeys(String.valueOf(b));
		
		//HW Background colour of getTotal button
		WebElement getTotalbutton= driver.findElement(By.xpath("//button[@id='button-two']"));
		String backgroundColour2 = getTotalbutton.getCssValue("background-color");
		getTotalbutton.click();
		String tagName1=getTotalbutton.getTagName();
		WebElement getText2= driver.findElement(By.xpath("//div[@id='message-two']"));
		String text = getText2.getText();
		if(text.contains(String.valueOf(c))){
			System.out.println("Same variable");
		}
		else {
			System.out.println("Not same");
		}
		/*String textField=text.substring(14);
		if(textField.equals(String.valueOf(c))){
			System.out.println("Same variable");
		}
		else {
			System.out.println("Not same");
		}*/
		}
        public static void main(String[] args) {
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.verifySingleInputField();
		//webelementcommands.driverQuit();
		

	}

}
