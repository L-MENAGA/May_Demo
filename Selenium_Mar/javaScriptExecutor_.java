package com.Selenium_Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor_ {
public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("http://automationpractice.pl/index.php");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				WebElement lorem = driver.findElement(By.xpath("//h3[text()='Lorem Ipsum']"));
				
				JavascriptExecutor js =(JavascriptExecutor) driver;
				
				//upto particular webelemnt
				js.executeScript("arguments[0].scrollIntoView();",lorem);
				
				System.out.println("Scrolled upto paricular element");
				
				Thread.sleep(2000);
				
				// to bottom 
				js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
				
				
				
				
}
}
