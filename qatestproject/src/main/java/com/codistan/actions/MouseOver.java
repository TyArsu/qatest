package com.codistan.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Codistan\\Documents\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guitarcenter.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"pushRegistration\"]/div/div/div[3]/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		WebElement guitarsMenu= driver.findElement(By.id("association_id_m1520012_link"));
		WebElement electricGuitars = driver.findElement(By.xpath("//*[@id=\"association_id_m1520012\"]/div/div[1]/div[1]/ol/li[2]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(guitarsMenu).moveToElement(electricGuitars).click().build().perform();
	
		
		

	}

}
