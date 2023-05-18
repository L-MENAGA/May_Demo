package com.Selenium_Mar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Single_dropdown {
	
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(ch); 
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement create_acct = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	
		create_acct.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kamesh");
		
		driver.findElement(By.name("lastname")).sendKeys("mohan");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("abc@123");
		
		Thread.sleep(2000);
		
		WebElement doB_day = driver.findElement(By.id("day"));
		
		Select s = new Select(doB_day);
		
		s.selectByValue("3");
		
		WebElement doB_Month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(doB_Month);
		
		boolean multiple = s1.isMultiple();
		
		System.out.println("is multiple or not" +multiple);
		
		s1.selectByVisibleText("Jun");
		
		WebElement doB_Year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(doB_Year);
		
		s2.selectByIndex(1);
		
		WebElement fso = s2.getFirstSelectedOption();
		
		System.out.println(fso.getText());
		
		System.out.println("get options");
		List<WebElement> options = s2.getOptions();
		for (WebElement opt : options) {
			String text = opt.getText();
			System.out.println(text);
		}
		
		
	}

}
