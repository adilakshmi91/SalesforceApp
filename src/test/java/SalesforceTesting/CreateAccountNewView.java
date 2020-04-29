package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class CreateAccountNewView extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		 getChromedriver();
		 readfile();
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(" //a[contains(text(),'Create New View')]")).click();
		XSSFSheet Sheet4= readAccount();
		Row row = Sheet4.getRow(3);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
		
		

	}

}
