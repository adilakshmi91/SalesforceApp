package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BrowserUtility.LaunchBrowser;

public class AccountReport extends LaunchBrowser {

	public static void main(String[] args) throws Exception{
		 getChromedriver();
		 readfile();
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("ext-gen20")).click();
		WebElement createddate=driver.findElement(By.xpath("//div[@class='x-combo-list-item x-combo-selected']"));
		Actions act=new Actions(driver);
		act.moveToElement(createddate).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.id("ext-gen152")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ext-gen154")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ext-gen299")).click();
		driver.findElement(By.id("ext-gen305")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen338")).click();
		driver.findElement(By.xpath("//table[@id='ext-gen294']//span[contains(text(),'25')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ext-gen49")).click();
		driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).sendKeys("abcdef");
		Thread.sleep(5000);
		driver.findElement(By.id("ext-gen286")).click();

	}

}
