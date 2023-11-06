package com.Login;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeStampScreenshot {
	public String Printdate() {

//		Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
//		System.out.println("Formatted Timestamp: " + currentTimestamp.toString());
//		String s = currentTimestamp.toString();
//		//yyyy_mm_dd_hh_mm_ss

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
		String s = dateFormat.format(date);

		return s;
	}

	@Test
	public void test() throws IOException {

		String time = Printdate();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println(System.getProperty("user.dir"));
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,
				new File(System.getProperty("user.dir") + "\\Screenshots\\" + "test_" + time + "_" + "_" + ".jpg"));
	}
}