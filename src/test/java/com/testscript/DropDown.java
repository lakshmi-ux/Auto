package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	
	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectDrop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectDrop);//inbuild class
		select.selectByIndex(1);//adhikam use aakilla
		select.selectByVisibleText("Yellow");//right click the function "open decleration/F3"
		select.selectByValue("Green");
	}

	public static void main(String[] args) {
		DropDown dropdown=new DropDown();
		dropdown.initializeBrowser();
		dropdown.dropDown();
		//dropdown.driverQuit();

	}

}
