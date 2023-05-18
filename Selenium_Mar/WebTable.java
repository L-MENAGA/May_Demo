package com.Selenium_Mar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	
public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://cosmocode.io/automation-practice-webtable/");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				System.out.println("----All data------------------------");
				
				List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
   
				for (WebElement all : all_data) {
					
					String text = all.getText();
					
					System.out.println(text);
					
					}
				
				Thread.sleep(3000);
				
				System.out.println("----Column data----------------------");
				
				List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
				
				for (WebElement column : column_data) {
					
					String text2 = column.getText();
					
					System.out.println(text2);
				}
				
				Thread.sleep(3000);
				System.out.println("----row data----------------------");
				
				List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
				
				for (WebElement row : row_data) {
					
					String text3 = row.getText();
					
					System.out.println(text3);
				}
				
				System.out.println("---------------------Particular data--------------");
				WebElement part_data = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]"));
				
				System.out.println(part_data.getText());
				
				
				System.out.println("getting all headers");
				
 // getting all headers= driver.findElements(By.tagName("h3"));
				
				
				
				
				
				
				
}
}
