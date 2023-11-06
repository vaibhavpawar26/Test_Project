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
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class OrangeHrm {
   @Test
   public void screenshot() throws InterruptedException, IOException {
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("imagetrgt"));
		 
		File source = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("./screenshots/element.png"));
		Thread.sleep(3000);
		driver.close();
		
		

   }
   
}
