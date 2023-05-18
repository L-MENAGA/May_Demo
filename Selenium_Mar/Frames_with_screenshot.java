package com.Selenium_Mar;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Frames_with_screenshot {
	
public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Selenium_PG\\\\Driver\\\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://demo.automationtesting.in/Frames.html");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				//single frame
			
				driver.switchTo().frame("singleframe");
				
				WebElement singleText = driver.findElement(By.xpath("//input[@type='text']"));
				
				singleText.sendKeys("Single Frame testing");
				
				driver.switchTo().defaultContent();
				
				driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
				
				
				WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
				
				driver.switchTo().frame(outerframe);
				
				
				
				WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
				
				driver.switchTo().frame(innerframe);
				
				WebElement multiText = driver.findElement(By.xpath("//input[@type='text']"));
				
				multiText.sendKeys("Multiple frame testing");
				
				driver.switchTo().parentFrame();
				
				driver.switchTo().defaultContent();
				

				//TakeScreenshot
				TakesScreenshot ts =(TakesScreenshot)driver;//Narrowing
				
				File source = ts.getScreenshotAs(OutputType.FILE);
		
			     File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Screenshot\\april.png");
			  
			     FileHandler.copy(source,dest);
			   
			   
}

}
