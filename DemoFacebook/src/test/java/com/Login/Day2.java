package com.Login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class Day2 {
	@Test
	public void test() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println(System.getProperty("user.dir"));
		driver.get("https://www.google.com");
		// driver.findElement(By.id("APjFqb")).sendKeys("Accenture");
		WebElement m = driver.findElement(By.id("APjFqb"));
		m.sendKeys("Accenture");
		m.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		// driver.findElement(By.id("result-stats")).getText();
		WebElement e = driver.findElement(By.id("result-stats"));
		System.out.println(e.getText());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System. getProperty("user.dir")+"//Screenshots/Screen.png"));
		System.out.println("Screenshot is captured");
		
		driver.close();
	}
}