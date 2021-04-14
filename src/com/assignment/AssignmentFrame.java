package com.assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Private\\Desktop\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		;
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		//// a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		System.out.println("hello");
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']")));
		System.out.println("hellssdsd");
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']/frame[1]")));
		System.out.println("hi");

		// frameset-middle
//		///frameset[@name='frameset-middle']/frame[2]/html[1]
		System.out.println(driver.findElement(By.xpath("//frameset[@name='frameset-middle']")).getText());

	}

}
