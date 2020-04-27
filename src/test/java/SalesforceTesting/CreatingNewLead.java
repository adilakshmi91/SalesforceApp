package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class CreatingNewLead extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		XSSFSheet sheet3=readLeads();
		Row row=sheet3.getRow(3);
		driver.findElement(By.id("name_lastlea2")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.id("lea3")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();

	}

}
