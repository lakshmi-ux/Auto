package com.testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHeader extends Base {
	public void tHeader() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tableList=driver.findElements(By.xpath("//tr[@role='row']//th"));
		List<String> header= new ArrayList<String>();
	//	header.add(val1);
		//header.add( val2);
		
		List<String> expectedHeader= new ArrayList<String>();
		expectedHeader.add(0, "Name");
		expectedHeader.add(1, "Position");
		expectedHeader.add(2, "Office");
		expectedHeader.add(3, "Age");
		expectedHeader.add(4, "Start date");
		expectedHeader.add(5, "Salary");
		
		for(WebElement table:tableList) {
			String tableValue=table.getText();
			header.add(tableValue);
		}
			if(header.equals(expectedHeader)) {
				System.out.println("same");
				
			}
			}
		
	    public static void main(String[] args) {
		TableHeader tableheader= new TableHeader();
		tableheader.initializeBrowser();
		tableheader.tHeader();
		//tableheader.driverQuit();

	}

}
