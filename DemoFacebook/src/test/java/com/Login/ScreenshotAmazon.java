package com.Login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotAmazon {
	@Test
	public void screenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println(System.getProperty("user.dir"));
		driver.get("https://www.amazon.in/");
		WebElement m = driver.findElement(By.id("nav-xshop-container"));
//		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = m.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System.getProperty("user.dir") + "//Screenshots/Screen.png"));
		System.out.println("Screenshot is captured");
		driver.close();

	}
}