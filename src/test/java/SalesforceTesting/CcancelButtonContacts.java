package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class CcancelButtonContacts extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		XSSFSheet SheetContacts=readContacts();
		Row row=SheetContacts.getRow(6);
		driver.findElement(By.id("fname")).sendKeys(row.getCell(2).getStringCellValue());
		 driver.findElement(By.id("devname")).sendKeys(row.getCell(3).getStringCellValue());
		 Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")).click();
        Thread.sleep(5000);
	}

}
