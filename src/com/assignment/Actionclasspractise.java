package com.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclasspractise {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver",				"./Driver//chromedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./Driver//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.actitime.com/");

		//driver.findElement(By.xpath("//ul[@class='header__menu']/child::li[3]")).click();
		Actions a=new Actions(driver);
			
			
			
			a.moveToElement(driver.findElement(By.xpath("//ul[@class='header__menu']/child::li[3]"))).build().perform();
			Thread.sleep(3000);
			
		////ul[@class='header__menu']/child::li[3]/ancestor::*
		
			//System.out.println("list :"+list.size());
			//driver.findElement(By.xpath("//a[text()='Try Free']")).click();
			
			/*
			 * for(int i=0;i<list.size();i++)
			 * 
			 * { System.out.println("text is : "+list.get(i).getText());
			 * 
			 * // list.get(i).click(); if(list.get(i).getText().equals("Pricing")) {
			 * list.get(i).click(); break;
			 * 
			 * 
			 * }
			 * 
			 * 
			 * }
			 */
			//driver.close();
	}

}
