package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {

	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/akagupta9/eclipse-workspace/seleniumAutomation/selenium-testng/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.quit();
	}
}
