package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locatorsMechanism() {
		//id
		WebElement searchTextBox= driver.findElement(By.id("wotabsearchtextbox"));
		
		WebElement searchTextBox1= driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchTextBox2= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement searchTextBox3= driver.findElement(By.id("nav-tools"));
		WebElement searchTextBox4= driver.findElement(By.id("nav-cart-text-container"));
		WebElement searchTextBox5= driver.findElement(By.id("nav-logo-sprites"));
		//class
		WebElement searchClassName= driver.findElement(By.className("nav-input nav-progressive-attribute"));
		
		WebElement searchClassName1= driver.findElement(By.className("nav-logo-link nav-progressive-attribute"));
		WebElement searchClassName2= driver.findElement(By.className("nav-left"));
		WebElement searchClassName3= driver.findElement(By.className("watch-button-placeholder aok-hidden"));
		WebElement searchClassName4= driver.findElement(By.className("a-carousel-col a-carousel-right"));
		WebElement searchClassName5= driver.findElement(By.className("a-button-inner"));
		//linkText
		WebElement linkText= driver.findElement(By.linkText("Skip to main content"));
		
		WebElement linkText1= driver.findElement(By.linkText("Fashion"));
		WebElement linkText2= driver.findElement(By.linkText("Mobiles"));
		WebElement linkText3= driver.findElement(By.linkText("Today's Deals"));
		WebElement linkText4= driver.findElement(By.linkText("New Releases"));
		WebElement linkText5= driver.findElement(By.linkText("Home & Kitchen"));
		//partialLinkText
		WebElement partialLinkText= driver.findElement(By.partialLinkText("Amazon"));
		WebElement partialLinkText1= driver.findElement(By.partialLinkText("Add"));
		WebElement partialLinkText2= driver.findElement(By.partialLinkText("Add Gift"));
		WebElement partialLinkText3= driver.findElement(By.partialLinkText("Account"));
		WebElement partialLinkText4= driver.findElement(By.partialLinkText("Echo"));
		WebElement partialLinkText5= driver.findElement(By.partialLinkText("Movers"));
		//name
		WebElement name= driver.findElement(By.name("crid"));
		
		WebElement name1= driver.findElement(By.name("description"));
		WebElement name2= driver.findElement(By.name("encrypted-slate-token"));
		//WebElement name3= driver.findElement(By.name(""));
		//WebElement name4= driver.findElement(By.name(""));
		//WebElement name5= driver.findElement(By.name(""));
		//tagName
		WebElement tagName= driver.findElement(By.tagName("input"));
		
		WebElement tagName1= driver.findElement(By.tagName("div"));
		WebElement tagName2= driver.findElement(By.tagName("header"));
		WebElement tagName3= driver.findElement(By.tagName("span"));
		WebElement tagName4= driver.findElement(By.tagName("p"));
		WebElement tagName5= driver.findElement(By.tagName("li"));
		//cssSelector1
		WebElement cssSelector1= driver.findElement(By.cssSelector(" input#ubbShipTo")); //tagname#id
		
		WebElement cssSelector11= driver.findElement(By.cssSelector(" input#twotabsearchtextbox")); 
		WebElement cssSelector12= driver.findElement(By.cssSelector(" input#isscrid")); 
		WebElement cssSelector13= driver.findElement(By.cssSelector(" input#issprefix")); 
		//cssSelector2
		WebElement cssSelector2= driver.findElement(By.cssSelector(" input.nav-progressive-attribute"));//tagname.classname
		
		WebElement cssSelector21= driver.findElement(By.cssSelector(" input.nav-input nav-progressive-attribute"));
		WebElement cssSelector22= driver.findElement(By.cssSelector(" input.nav-left"));
		WebElement cssSelector23= driver.findElement(By.cssSelector(" input.nav-logo-link nav-progressive-attribute"));
		//cssSelector3
		WebElement cssSelector3= driver.findElement(By.cssSelector ("input[aria-label='Search Amazon.in']"));//tagname[attribute='value']
		
		WebElement cssSelector31= driver.findElement(By.cssSelector ("form[accept-charset='utf-8']"));
		WebElement cssSelector32= driver.findElement(By.cssSelector ("label[for=twotabsearchtextbox']"));
		WebElement cssSelector33= driver.findElement(By.cssSelector ("input[aria-label=Search Amazon.in']"));
		//xPath
		WebElement xPath=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		WebElement xPath1=driver.findElement(By.xpath("//input[@id='isscrid']"));
		WebElement xPath2=driver.findElement(By.xpath("//input[@id='issprefix']"));
		WebElement xPath3=driver.findElement(By.xpath("//form[@id='nav-search-bar-form']"));
		WebElement xPath4=driver.findElement(By.xpath("//label[@for='twotabsearchtextbox']"));
		WebElement xPath5=driver.findElement(By.xpath("//div[@id='nav-flyout-iss-anchor']"));
	}

	public static void main(String[] args) {
		Locators locators= new Locators();
		locators.initializeBrowser();
		//locators.driverQuit();

	}

}
