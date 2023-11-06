package com.Login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Opencart {
	@Test
	   public void screenshot() throws InterruptedException, IOException {
		   WebDriver driver = new ChromeDriver();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.opencart.com/index.php?route=cms/demo");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[class='navbar-right hidden-xs']")).click();
			
           
}
}
