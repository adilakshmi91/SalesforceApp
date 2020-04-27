package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserUtility.LaunchBrowser;

public class CheckErrorContacts extends LaunchBrowser {

	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver = getChromedriver();
		@SuppressWarnings("unused")
		XSSFSheet Sheet = readfile();
	
		driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		XSSFSheet SheetContacts=readContacts();
		Row row=SheetContacts.getRow(5);
        driver.findElement(By.id("devname")).sendKeys(row.getCell(3).getStringCellValue());
        driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
        
		
	

	}

}
