package com.Selenium_Mar;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.yaml.snakeyaml.events.Event.ID;

public class Windows_handling {
	
public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://www.naukri.com/");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
				
                Actions ac = new Actions(driver);
                
                ac.moveToElement(services).build().perform();
                
                Thread.sleep(2000);
                
                WebElement resume = driver.findElement(By.xpath("//div[text()='Resume display']"));
                
                resume.click();
                
                Thread.sleep(2000);
               
                services.click();
                
                String parentwindow = driver.getWindowHandle();
                
                System.out.println(parentwindow);
                
                
                Set<String> all_window_id = driver.getWindowHandles();
                
                for (String id : all_window_id) {
					
                	String title = driver.switchTo().window(id).getTitle();
                	
                	System.out.println(title);
				}
                
                
               String actual_Title="Resume Display - Resume Spotlight | Naukri Fastforward";
                
               for (String string : all_window_id) {
				
            	   if(driver.switchTo().window(string).getTitle().equals(actual_Title)) {
            		   
            		   driver.switchTo().window(string);
            		   
            		   System.out.println("Switched");
            	   }
            	 
            	
           
               
               }
               Iterator<String> i1 = all_window_id.iterator();
               
               while(i1.hasNext()) {
            	   String child_window = i1.next();
            	   
            	   if(!parentwindow.equals(child_window)) {
                	   
            		   driver.switchTo().window(child_window);
            		   
            		   System.out.println("switched -2");
                   }
               }
               
                  
                  
                  

               





}

}
