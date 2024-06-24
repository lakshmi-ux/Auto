package com.testscript;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
	}
	public void navigationCommands() {
		//driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().back();
		//driver.navigate().forward();
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands= new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.navigationCommands();
		
		browsercommands.driverQuit();
		

	}

}
