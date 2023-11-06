package com.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountLinks {
	@Test
	public void link() {
	
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
     
    List<WebElement> elements = driver.findElements(By.xpath("//*"));
    int elementsCount = elements.size();
    System.out.println("Total Number of Elements : " + elementsCount);
}
}