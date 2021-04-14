package com.assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandler {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Private\\Desktop\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		;
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		//// a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		// Switching to child window
		driver.switchTo().window(childwindow);

		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		// Switching to Parent window
		driver.switchTo().window(parentwindow);

		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());

	}

}
