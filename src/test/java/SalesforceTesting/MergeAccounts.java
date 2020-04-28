package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class MergeAccounts extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
	
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		XSSFSheet Sheet4= readAccount();
		Row row1 = Sheet4.getRow(1);
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("Arhu");
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='srchbutton']")));
		driver.findElement(By.xpath("//input[@name='srchbutton']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(6000);
		
		
		

	}

}
