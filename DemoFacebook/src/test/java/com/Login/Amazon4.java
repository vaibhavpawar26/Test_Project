package com.Login;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon4 {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	
	
	public void beforeMethod(String browser) throws Exception{
	if(browser.equalsIgnoreCase("Chrome"))
	{
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
	}else if(browser.equalsIgnoreCase("Edge"))
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.amazon.in/");

	}
	else
	{
		throw new Exception("Invalid Brower");
	}
		}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.amazon.in/");
    String ExpectedOptions []= {"All Categories","Alexa Skills","Amazon Devices","Amazon Fashion",
    		"Amazon Pharmacy","Appliances","Apps & Games","Audible Audiobooks","Baby","Beauty","Books","Car & Motorbike","Clothing & Accessories","Collectibles","Computers & Accessories",
    		"Electronics", 
    		"Furniture",
    		"Garden & Outdoors",
    		"Gift Cards",
    		"Grocery & Gourmet Foods",
    		"Health & Personal Care",
    		"Home & Kitchen",
    		"Industrial & Scientific",
    		"Jewellery",
    		"Kindle Store",
    		"Luggage & Bags",
    		"Luxury Beauty",
    		"Movies & TV Shows",
    		"Music",
    		"Musical Instruments",
    		"Office Products",
    		"Pet Supplies",
    		"Prime Video",
    		"Shoes & Handbags",
    		"Software",
    		"Sports, Fitness & Outdoors",
    		"Subscribe & Save",
    		"Tools & Home Improvement",
    		"Toys & Games",
    		"Under ₹500",
    		"Video Games",
    		"Watches"};
       Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
       List <WebElement> op = s.getOptions();
       int size = op.size();
       
       String[] s1 = new String[op.size()];
       
       for(int i =0; i<size ; i++){
    	   String options=op.get(i).getText();
    	   s1[i]=op.get(i).getText();
          Assert.assertEquals(options, ExpectedOptions [i]);
//          System.out.println(options);
}
       System.out.println(Arrays.toString(s1));
       System.out.println("Test Case Passed");
       System.out.println(driver.getTitle());
}
	@AfterMethod
	void afterMethod()
	{
		driver.close();
	}
}