package SalesforceTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contacts extends Login {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		XSSFSheet sheet1 = readContacts();
		Row row1 = sheet1.getRow(3);
		driver.findElement(By.id("name_lastcon2")).sendKeys(row1.getCell(0).getStringCellValue());
		driver.findElement(By.id("con4")).sendKeys(row1.getCell(1).getStringCellValue());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fname")).sendKeys(row1.getCell(2).getStringCellValue());
		driver.findElement(By.id("devname")).click();
		driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
		driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		driver.findElement(By.id("hotlist_mode")).click();
	    driver.findElement(By.xpath("//option[contains(text(),'Recently Created')]")).click();
	    driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fcf")).click();
		driver.findElement(By.xpath("//option[contains(text(),'My Contacts')]")).click();
		//driver.findElement(By.xpath("//input[@name='go']")).click();
	    
	
		

	}
    
}
