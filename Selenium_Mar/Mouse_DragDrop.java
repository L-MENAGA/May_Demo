package com.Selenium_Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_DragDrop {

public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://www.leafground.com/drag.xhtml");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				WebElement drag = driver.findElement(By.xpath("//p[text()='Drag to target']"));
					
				Actions ac = new Actions(driver);
				
				WebElement drop = driver.findElement(By.xpath("//span[text()='Droppable Target']"));

				ac.dragAndDrop(drag, drop).build().perform();


}
}