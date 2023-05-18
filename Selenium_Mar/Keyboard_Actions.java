package com.Selenium_Mar;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	
public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://www.google.com");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				WebElement mail = driver.findElement(By.xpath("//a[text()='Gmail']"));
			
				Actions ac = new Actions(driver);
				
				ac.moveToElement(mail).build().perform();
				
				ac.contextClick(mail).build().perform();
				
				Robot r = new Robot();
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(3000);
				driver.quit();
}

}
