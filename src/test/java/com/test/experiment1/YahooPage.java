package com.test.experiment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YahooPage {
  @Test
  public void f() {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sindh\\Documents\\Automation Projects\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			String url = "https://www.yahoo.com/";
			driver.get(url);
			driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("Sindhuja");
  }
}
