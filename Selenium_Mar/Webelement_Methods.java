package com.Selenium_Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {
	
	public static void main(String[] args) throws Throwable {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("abc@gmail.com");
		
		email.clear();
		
		boolean selected = email.isSelected();
		
		System.out.println(selected);
		
		email.sendKeys("123@gmail");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("1234456");
		
		boolean displayed = password.isDisplayed();
		
		System.out.println(displayed);
		
		Thread.sleep(4000);
		
		WebElement login = driver.findElement(By.name("login"));
		
		 boolean enabled = login.isEnabled();
		 
		 System.out.println(enabled);
		
		login.click();
		
		
		
		
		
		
	}

}
