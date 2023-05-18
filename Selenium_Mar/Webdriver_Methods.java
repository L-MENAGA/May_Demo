package com.Selenium_Mar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); //upcasting
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println(currentUrl);
	
	//navigation methods
	
	driver.navigate().to("https://www.youtube.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	driver.navigate().forward();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
}
}
