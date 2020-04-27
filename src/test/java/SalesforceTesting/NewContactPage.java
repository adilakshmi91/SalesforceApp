package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class NewContactPage extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		@SuppressWarnings("unused")
		XSSFSheet Sheet = readfile();
		driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		XSSFSheet SheetContacts=readContacts();
		Row row=SheetContacts.getRow(7);
		driver.findElement(By.id("name_lastcon2")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.id("con4")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")).click();
		Thread.sleep(5000);

	}

}
