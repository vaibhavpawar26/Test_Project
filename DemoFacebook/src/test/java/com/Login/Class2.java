package com.Login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	 public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
			Thread.sleep(3000);
			WebElement v = driver.findElement(By.id("month"));
			Select s = new Select(v);
			s.selectByVisibleText("Feb");
			WebElement element = driver.findElement(By.id("month"));
			Select select = new Select(element);
			List<WebElement> list = select.getOptions();

			List<String> act_list = new ArrayList<String>();

			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getText());
				act_list.add(list.get(i).getText());
			}
			List<String> exp_list = new ArrayList<>(
					Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
     
	}

	
	public void testlogin(String st) {
		System.out.println(st +"mar");
	}
}