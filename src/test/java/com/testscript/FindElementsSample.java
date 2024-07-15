package com.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsSample extends Base {
	public void findElementsSample(String menuText) {//inside bracket value koduthathe aanu parameter passing
	 List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//a"));
//LHS nammal padicha list inta formula aanu and RHS that unordered list inta path koduthathe.
//after path //a koduthathe, inside ul 7 links unde athane a tag kodutha, enni ethe inside a loop idumbol oronne veche itterate aakum
//and value get cheyan .getText use aakiyal oro value ayi get and display aakum
	 
	 for(WebElement menu:menuList) { //foreach loop
		String value= menu.getText(); //ethreyum cheyumbol value 1 by 1 get aakum
		
		//enni just inside list ulla eathenkilum value compare cheyan
		if(value.equals(menuText)) {
			menu.click(); 
				break; 
			}
		 }
	}

	public static void main(String[] args) {
		FindElementsSample findelementssample= new FindElementsSample();
		findelementssample.initializeBrowser();
		findelementssample.findElementsSample("Checkbox Demo");
		//findelementssample.driverQuit();

	}

}
