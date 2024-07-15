package com.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo extends Base{
	public void navigateCheckbox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	}
	public void checkBox() {
		WebElement clickBox= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean clickBoxDisplayed=clickBox.isDisplayed();
		clickBox.click();
		boolean clickBoxSelected= clickBox.isSelected();
		WebElement getValue=driver.findElement(By.xpath("//div[@id='message-one']"));
		getValue.getText();
	}
    public static void main(String[] args) {
		CheckBoxDemo checkboxdemo=new CheckBoxDemo();
		checkboxdemo.initializeBrowser();
		checkboxdemo.navigateCheckbox();
		checkboxdemo.checkBox();
		//checkboxdemo.driverQuit();
    }
}
