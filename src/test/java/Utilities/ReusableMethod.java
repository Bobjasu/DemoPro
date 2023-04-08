package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethod {
	
	static WebDriver driver=null;
	
	public static void explicitWait_ElementToBeClickable(String xpathExpression) {
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
		
		}
	
	
	public static void explicitWait_ElementToBeSeleted(String xpathExpression) {
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpathExpression)));
		
		
	}
	
	
	
	public static void sleep(int i) throws Exception{
		Thread.sleep(i*1000);		
	}


}
