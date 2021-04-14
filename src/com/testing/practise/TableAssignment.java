
package com.testing.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Private\\Desktop\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);

		jse.executeScript("document.querySelector('.table-display').scrollTop=5000");
		// print 2nd rows
		String rowsPrint = driver.findElement(By.cssSelector("tbody tr:nth-child(3)")).getText();
		System.out.println("rowsPrint is:" + rowsPrint);

		int rowcount = driver.findElements(By.xpath("//div/fieldset/table/tbody/tr")).size();

		System.out.print("No of rows in the table:" + rowcount);

		int columncount = driver.findElements(By.xpath("//div/fieldset/table/tbody/tr/th")).size();

		System.out.print("No of columns in the table:" + columncount);

		// int rowcount =
		// driver.findElements(By.xpath("//table[@id='product']//tr")).size();

		/*
		 * int
		 * rowcount=driver.findElements(By.xpath("//table[@id='product']//tr")).size();
		 * System.out.println("rowcount:"+rowcount);
		 * 
		 * 
		 * int columnCount =
		 * driver.findElements(By.xpath("//table[@id='product']//tr/th")).size();
		 * System.out.println("columnCount :"+columnCount);
		 */

	}

}
