package com.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllLinks {
	@Test
	public void getlinks() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// for(int i=0;i<allLinks.size();i++){
		// System.out.println(i +" : "+ allLinks.get(i).getText());
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		
		}
          driver.close();
	}

}
