package com.Login;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintBrokenLink {
	//public static WebDriver driver = null;

	@Test
	public void brokenlink1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String homePage = "https://google.com/";
		String url = "";
		HttpURLConnection con = null;
		int responseCode = 200;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePage);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			url = it.next().getAttribute("href");
			try {
				con = (HttpURLConnection) (new URL(url).openConnection());
				con.setRequestMethod("HEAD");
				con.connect();
				responseCode = con.getResponseCode();
				if (responseCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + "is a valid link");
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			
}
	}
}