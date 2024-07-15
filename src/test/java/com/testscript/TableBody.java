package com.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableBody extends Base {
	public void tableBody(String tableAshton) {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		                                                                          //List<WebElement> tableRow=driver.findElements(By.xpath("//tr[@class='odd']//td"));
		                                                                          //"//tr[@class='odd']//parent::tbody"
		                                                                         //List<WebElement> tableRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//child::tbody"));
		                                                                         //ArrayList <String> tableRow =new ArrayList<String>();
		                                                                         //tableRow.get(tableAshton);
		List<WebElement> tableRow1=driver.findElements(By.xpath("//tr[@class='odd']//td[1]"));
		for(WebElement table:tableRow1) {
			String tableValue=table.getText();
			                                                                      //tableValue.get(tableAshton);
			if(tableValue.equals(tableAshton)) {
				System.out.println("contains");
				                                                                //tableValue.contains(tableAshton);
				break;                             
			}
		}
	}
        public static void main(String[] args) {
		TableBody tablebody= new TableBody();
		tablebody.initializeBrowser();
		tablebody.tableBody("Ashton Cox");
		//tablebody.driverQuit();

	}

}
