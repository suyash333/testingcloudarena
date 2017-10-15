package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring and initialising the HtmlUnitWebDriver
				//HtmlUnitDriver unitDriver = new HtmlUnitDriver();
				HtmlUnitDriver unitDriver = new HtmlUnitDriver(true);
				//HtmlUnitDriver unitDriver = new HtmlUnitDriver(BrowserVersion.FIREFOX_3);
		 
				// open google.com webpage
				unitDriver.get("http://google.com");
		 
				System.out.println("Title of the page is -> " + unitDriver.getTitle());
		 
				// find the search edit box on the google page
				WebElement searchBox = unitDriver.findElement(By.name("q"));
		 
				// type in Selenium
				searchBox.sendKeys("Selenium"+Keys.ENTER);

				// find the search button
				//WebElement button = unitDriver.findElement(By.name("gbqfba"));
		 
				// Click the button
				//button.click();
		 
				System.out.println("Title of the page is -> " + unitDriver.getTitle());
		 
			}

}
