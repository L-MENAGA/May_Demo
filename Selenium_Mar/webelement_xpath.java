package com.Selenium_Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webelement_xpath {

	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
	
	ChromeOptions ch = new ChromeOptions();
	
	ch.addArguments("incognito");
	
	WebDriver driver = new ChromeDriver(ch); 
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	WebElement contactus = driver.findElement(By.xpath("(//a[contains(@title,'Visit our')])[2]"));
	
	String text = contactus.getText();
	
	System.out.println(text);
	
	System.out.println(contactus.getText());
	
	String attribute = contactus.getAttribute("title");
	
	System.out.println("value of the attribute :" +attribute);
	
	String attribute2 = contactus.getAttribute("id");
	
	System.out.println("Value of non available atribute "+attribute2);
	
	driver.close();
	
	
	}
}
