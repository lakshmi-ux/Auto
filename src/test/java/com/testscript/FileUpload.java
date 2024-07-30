package com.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadUsingSendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		
		WebElement chooseFile= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	   chooseFile.sendKeys("C:\\Users\\Emvigo\\Downloads\\Document18.pdf");
		}
	
	public void fileUploadUsingRobotclass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdf= driver.findElement(By.xpath("//a[@class='uploader__btn tooltip--left active']"));
		selectPdf.click();
		                                                               //actions il mouse vechite ulla karyagal padichu, but robot classil mouse activities keyboard activities ellam unde.
		                                                              //nammal just string il path koduthal mathi, thaniye enter paste release okka ayikolam
		StringSelection ss = new StringSelection("C:\\Users\\Emvigo\\Downloads\\Document18.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//ss il store aya path ippol ee toolkit il keri means clipboard il copy ayi
		Robot robot = new Robot(); //object creation, its a inbuild class
		robot.delay(250);//delay cheyunathe crct ayi process nadakunathe kaanan vendiya
		robot.keyPress(KeyEvent.VK_ENTER);//paste cheyan vendi ulla click
		robot.keyRelease(KeyEvent.VK_ENTER);//then release
	    robot.keyPress(KeyEvent.VK_CONTROL);//cntrl paste
		robot.keyPress(KeyEvent.VK_V);//paste
		robot.keyRelease(KeyEvent.VK_V);//remove from v
		robot.keyRelease(KeyEvent.VK_CONTROL);//remove from cntl
		robot.keyPress(KeyEvent.VK_ENTER);//paste akan ulla enter
		//nammal manually cheyunathe ellam ee code ittal athe thaniye cheyum hence using robot class
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		FileUpload fileupload=new FileUpload();
		fileupload.initializeBrowser();
		fileupload.fileUploadUsingSendkeys();
		try {
			fileupload.fileUploadUsingRobotclass();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		//fileupload.driverQuit();

	}

}
