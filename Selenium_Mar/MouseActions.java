package com.Selenium_Mar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("http://automationpractice.pl/index.php");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
					
				Actions ac = new Actions(driver);
				
				ac.moveToElement(dresses).build().perform();
				
				Thread.sleep(2000);

				//WebElement summerdress = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
				
				ac.click(dresses).build().perform();
				
				Thread.sleep(2000);
				
				WebElement contactUs = driver.findElement(By.xpath("(//a[@title='Contact us'])[1]"));
					
				ac.doubleClick(contactUs).build().perform();
				
				Thread.sleep(1000);
				
				WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
				
				ac.contextClick(signIn).build().perform();
				
				
}
}
