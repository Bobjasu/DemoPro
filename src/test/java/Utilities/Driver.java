package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	public WebDriver driver;
	
	public WebDriver getDriver(String browser) {
		
		switch(browser) {
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
		case "FF":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		}
		
		
		
		return null;
		
		
		
	}
}
