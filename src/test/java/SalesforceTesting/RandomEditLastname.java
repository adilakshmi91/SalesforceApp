package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class RandomEditLastname extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		 getChromedriver();
         readfile();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")).click();
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		waitForPageElementToVisible(driver.findElement(By.id("contactInfoContentId")))	;
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		waitForPageElementToVisible( driver.findElement(By.xpath("//a[contains(text(),'About')]")));
	    WebElement about= driver.findElement(By.xpath("//a[contains(text(),'About')]"));
        about.click();
        driver.findElement(By.xpath("//input[@id='lastName']")).clear();
        waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='lastName']")));
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("m");
        driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
        Thread.sleep(5000);
        driver.close();
        
        
	}

}
