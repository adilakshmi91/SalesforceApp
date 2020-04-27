package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserUtility.LaunchBrowser;

public class Opportunities extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		@SuppressWarnings("unused")
		XSSFSheet Sheet = readfile();
		
		driver.findElement(By.linkText("Opportunities")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fcf")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		XSSFSheet sheet2 = readOpty();
		Row row2 = sheet2.getRow(1);
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("opp3"))));
		driver.findElement(By.id("opp3")).sendKeys(row2.getCell(0).getStringCellValue());
		driver.findElement(By.id("opp4")).sendKeys(row2.getCell(1).getStringCellValue());
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("opp7"))));
		driver.findElement(By.id("opp7")).sendKeys(String.valueOf(row2.getCell(2).getCellType()));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("opp9"))));
		driver.findElement(By.id("opp9")).click();
		WebElement date=driver.findElement(By.xpath("//td[contains(text(),'27')]"));
		date.click();
		driver.findElement(By.id("opp11")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[contains(text(),'Qualification')]"))));
		driver.findElement(By.xpath("//option[contains(text(),'Qualification')]")).click();
	    Thread.sleep(5000);
		driver.findElement(By.id("opp17")).sendKeys(row2.getCell(3).getStringCellValue());
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Opportunities")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Opportunities")).click();
		WebElement Interval=driver.findElement(By.id("quarter_q"));
		Interval.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[contains(text(),'Current and Next FQ')]")).click();
		WebElement include=driver.findElement(By.id("open"));
		include.click();
		driver.findElement(By.xpath("//select[@id='open']//option[contains(text(),'All Opportunities')]")).click();
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(5000);
	}

	
	}
		
	

	


		
		
		
	


