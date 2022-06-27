package com.sample.NewMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver_102.exe");
		driver = new ChromeDriver();
		System.out.println("Launching browser");
		
		//driver.get("https://login.salesforce.com/?locale=in");
	}
	@Test
	public void doLogin()
	{
		System.out.println("Executing Login Test");
		System.out.println("Login to facebook account");
	
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		
		System.out.println("Entering username");
		driver.findElement(By.id("email")).sendKeys("kondalkaramruta06@gmail.com");
		
		System.out.println("Entering password");
		driver.findElement(By.id("pass")).sendKeys("Amru#09");
		
		System.out.println("Clicking on login button ");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Logging into facebook account");
		
	}
	@AfterTest
	public void QuitDriver()
	{
		if(driver!=null)
			driver.close();
	}
	

}
