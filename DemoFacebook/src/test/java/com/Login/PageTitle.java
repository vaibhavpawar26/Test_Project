package com.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTitle {
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
}
}