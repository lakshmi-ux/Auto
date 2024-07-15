package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsClass extends Base {
	/*public void actionsClass() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dottedLine= driver.findElement(By.xpath(	"//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);       //inbuild class aanu, athil driver aanu parameter ayi pass akendathe
		actions.moveToElement(drag1).build().perform();//hover akan
		actions.doubleClick(drag1).build().perform();//double click cheyan
		actions.contextClick(drag1).build().perform();   //particular element rightclick akan ulla method
		actions.dragAndDrop(drag1, dottedLine).build().perform();//drag akan ulla method
		
	}

	public static void main(String[] args) {
		ActionsClass actionsclass= new ActionsClass();
		actionsclass.initializeBrowser();
		actionsclass.actionsClass();
		actionsclass.driverQuit();

	}*/
	@BeforeMethod
	public void navigateToDrag() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	}
	
	@Test
	public void dragAndDrop() {
		WebElement drag1= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dottedLine= driver.findElement(By.xpath(	"//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);       //inbuild class aanu, athil driver aanu parameter ayi pass akendathe
		actions.moveToElement(drag1).build().perform();//hover akan
		actions.doubleClick(drag1).build().perform();//double click cheyan
		actions.contextClick(drag1).build().perform();   //particular element rightclick akan ulla method
		actions.dragAndDrop(drag1, dottedLine).build().perform();//drag akan ulla method
	}
	
	@AfterMethod
	public void quitClass() {
		
		//driver.quit();
	}
	

}
