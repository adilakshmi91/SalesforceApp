package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserUtility.LaunchBrowser;

public class TodayLeads extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		 getChromedriver();
		readfile();
		
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//select[@name='fcf']")).click();
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]"))));
		WebElement todayleads=driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]"));
		todayleads.click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"))));
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		
		
		

	}

}
