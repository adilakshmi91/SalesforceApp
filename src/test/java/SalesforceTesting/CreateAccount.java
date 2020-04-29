package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;


public class CreateAccount extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		getChromedriver();
		readfile();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		

	}

}
