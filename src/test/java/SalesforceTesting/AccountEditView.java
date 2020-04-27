package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class AccountEditView extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
	
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
		driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]")).click();
		XSSFSheet Sheet4= readAccount();
		Row row1 = Sheet4.getRow(4);
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(row1.getCell(1).getStringCellValue());
		driver.findElement(By.id("devname")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Name')]")).click();
	    driver.findElement(By.xpath("//select[@id='fop1']")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.id("fval1")).sendKeys("a");
	    driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")).click();
	    Thread.sleep(6000);
	    driver.close();
	    
	   
		
		
		

	}

}
