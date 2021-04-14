package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitAssgnment {
	
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Private\\Desktop\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		
	
		   WebDriver driver = new ChromeDriver();

		 	

		   driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		       System.out.println(driver.getTitle());

		   driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();

		   WebDriverWait webDriver=new WebDriverWait(driver,10);

		
		   webDriver.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='results']")));

		   System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());

		}

		}


