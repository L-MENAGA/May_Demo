package com.Selenium_Mar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {
	
	public static void main(String[] args) throws Throwable{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement multi = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select s = new Select(multi);
		
		System.out.println("multiple or not " +s.isMultiple());
		
		Thread.sleep(2000);

		
		s.selectByIndex(0);
		s.selectByValue("donut");
		s.selectByVisibleText("Bonda");
		
		Thread.sleep(5000);
		
		s.deselectByVisibleText("Donut");
		
		System.out.println("----------------------");
		WebElement fso = s.getFirstSelectedOption();
		System.out.println(fso.getText());
		
		System.out.println("_______________________");
		List<WebElement> aso = s.getAllSelectedOptions();
		for (WebElement all : aso) {
			System.out.println(all.getText());
		}
		
		System.out.println("==========================");
		List<WebElement> options = s.getOptions();
		
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
		
		
		s.deselectAll();
	}

}
