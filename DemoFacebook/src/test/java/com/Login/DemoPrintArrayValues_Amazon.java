package com.Login;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoPrintArrayValues_Amazon {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.amazon.in/");

		Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> op = s.getOptions();
		int size = op.size();

		String[] s1 = new String[op.size()];

		for (int i = 0; i < size; i++) {
			s1[i] = op.get(i).getText();

		}
		System.out.println(Arrays.toString(s1));
		System.out.println("Test Case Passed");
	}

	@AfterMethod
	void afterMethod() {
		driver.close();
	}
}