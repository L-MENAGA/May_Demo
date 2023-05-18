package com.Selenium_Mar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_withWaits {
	
	public static void main(String[] args) throws Throwable{
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://www.leafground.com/alert.xhtml");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
				WebElement simplealert = driver.findElement(By.xpath("//span[@id='simple_result']//preceding::span[text()='Show']"));
				
				simplealert.click();
				
				Thread.sleep(2000);
				
				Alert alert = driver.switchTo().alert();
				
				alert.accept();
				
				
				WebElement confirmAlert = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
	
				confirmAlert.click();
				
				Thread.sleep(2000);
				
				Alert alert2 = driver.switchTo().alert();
				
				alert2.dismiss();
				
				WebElement promptAlert = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
				
				WebDriverWait wait = new WebDriverWait (driver,30);

				wait.until(ExpectedConditions.visibilityOf(promptAlert));
				
				promptAlert.click();
				
				Thread.sleep(2000);
				
				Alert alert3 = driver.switchTo().alert();
				
				alert3.sendKeys("Testing Prompt Alert");
				
				String text = driver.switchTo().alert().getText();
				
				System.out.println("Promt Box Text :"   +text);
				
				alert3.accept();
				
				
	}

}
