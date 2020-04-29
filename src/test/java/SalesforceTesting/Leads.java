package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class Leads extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
	  getChromedriver();
		XSSFSheet Sheet = readfile();
		Row row = Sheet.getRow(1);
		driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.id("password")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@name='fcf']")).click();
		Thread.sleep(6000);
		if(driver.findElement(By.xpath("//select[@name='fcf']")) != null) {
			System.out.println("dropdown is viewed");
			
		}
		else {
			System.out.println("drop down is not viewed");
		}
		driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")).click();
		

	}

}
