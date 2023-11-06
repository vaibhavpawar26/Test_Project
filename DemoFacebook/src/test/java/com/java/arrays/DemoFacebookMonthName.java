package com.java.arrays;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoFacebookMonthName {
	@Test
	 public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.id("month"));
			
			
			Select select = new Select(element);
			
			List<WebElement> op = select.getOptions();
			
			
			String[] month = new String[op.size()];

	        
	        for (int i = 0; i < month.length; i++) {
	            
	            month[i]= op.get(i).getText();
	            
	}
			System.out.println(Arrays.toString(month));

	        
	        driver.close();

}
}