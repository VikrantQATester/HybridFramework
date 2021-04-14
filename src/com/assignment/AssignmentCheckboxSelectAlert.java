package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCheckboxSelectAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Private\\Desktop\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
		//// select option2 and store in string
		String selectedOption = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println("slect" + selectedOption);
//		for dropdown selection 
		WebElement dropdownText = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select staticDropdownSelect = new Select(dropdownText);
		System.out.println(dropdownText);
		staticDropdownSelect.selectByVisibleText(selectedOption);

		driver.findElement(By.id("name")).sendKeys(selectedOption);
//		/
		driver.findElement(By.id("alertbtn")).click();

		String reuiredtext = driver.switchTo().alert().getText();

		if (reuiredtext.contains(selectedOption)) {
			System.out.println("test case execute properly");

			driver.switchTo().alert().accept();
		} else {
			System.out.println("test case failed Kindly  debug your test case");
		}

	}

}
