package org.opencart;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	
	
	WebDriver driver;
	
	@BeforeClass
	public void tc1() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void tc2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	
		Thread.sleep(3000);
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("asdf@gmail.com");
	}
}
