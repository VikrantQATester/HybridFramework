package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoDropAssignment2 {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "./Driver//chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./Driver//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("testing");

		// .//ul[@class='erkvQe']//li'
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
	//	List<WebElement> listOfAllMatchingElements=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
		// ul[@class='erkvQe']//li//descendant::div[@class="sbl1"]//span
		WebDriverWait wait=new WebDriverWait(driver, 20);

		List<WebElement> list =wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='aajZCb']//ul[@class='erkvQe']//li[@class='sbct']")));

		// List<WebElement> list=driver.findElements(By.tagName("a"));

		System.out.println("total suggestions : " + list.size());

		for (int i = 0; i < list.size(); i++)

		{ 
			System.out.println("text is : "+list.get(i).getText());
			
		}

		driver.close();

	}

}
