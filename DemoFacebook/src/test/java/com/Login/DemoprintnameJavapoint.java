package com.Login;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoprintnameJavapoint {

	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Select s = new Select(driver.findElement(By.id("link")));
		List<WebElement> op = s.getOptions();
		int size = op.size();

		String[] s1 = new String[op.size()];

		for (int i = 0; i < size; i++) {
			s1[i] = op.get(i).getText();

		}
		System.out.println(Arrays.toString(s1));
		System.out.println("Test Case Passed");

	}

}
