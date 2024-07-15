package com.testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowPopUp extends Base {
	public void windowPopUp() {
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement windowpopUP= driver.findElement(By.xpath("//a[text()='Window Popup']"));
		WebElement likeUsFB= driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		likeUsFB.click();
		String mainWindow=driver.getWindowHandle();//to handle only 1 window and that will be parent
		Set <String> s1= driver.getWindowHandles();//to handle all new opened windows
		// 'sl' il ulla windows il aara parent aara child enne kandu pidikan aanu ethe cheyunna
		 Iterator<String> i1=s1.iterator();		
			//ippol 'il' il ellam windows um unde
	        while(i1.hasNext()){		
	            String ChildWindow=i1.next(); //'il' il ulla all windows chilsWindows il assign aaki
	            if(!mainWindow.equalsIgnoreCase(ChildWindow)) { //ippum main inta id child il match ayilenkil inside if il cdtn kerum	
	            	//1st inside if main window inta id kerum appol same ayi so if cdtn il kerilla pinna vannathe match ayilla so if cdtnil keri, appol manasilayi athe child aanu enne
	                // if cdtn gets true then Switching to Child window
	                    driver.switchTo().window(ChildWindow);
	                    //enni evida log in btn displayed aano enne check cheyanam
	                    WebElement logInButton= driver.findElement(By.xpath("//span[text()='Log in']//ancestor::div[@class=\"x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1fq8qgq\"]"));
	                   boolean logButton= logInButton.isDisplayed();
	                    driver.close();//eppol child window il ninne exit aayi
	                    driver.switchTo().window(mainWindow);//this is the method to switch to any window
	            }}
		}

	public static void main(String[] args) {
		WindowPopUp windowpopup= new WindowPopUp();
		windowpopup.initializeBrowser();
		windowpopup.windowPopUp();
		//windowpopup.driverQuit();
     }

}
