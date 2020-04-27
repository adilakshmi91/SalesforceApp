package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class PasswordError extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		Row row = Sheet.getRow(2);
		driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.close();
		

	}

}
