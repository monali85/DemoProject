package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void test01()
	{
       // System.setProperty("webdriver.chrome.driver","D:/selenium software/chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","D:/selenium software/chromedriver_win32/chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver","D:/selenium software/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium%20software/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
		
	}
}
