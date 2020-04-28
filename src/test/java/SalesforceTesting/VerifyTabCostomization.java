package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserUtility.LaunchBrowser;

public class VerifyTabCostomization extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'customize')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Libraries')]")).click();
		driver.findElement(By.xpath("//img[@class='leftArrowIcon']")).click();
		Thread.sleep(7000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")));
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(6000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions act=new Actions(driver);
		act.moveToElement(logout).click().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Login"));
		Row row = Sheet.getRow(1);
		driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.id("password")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(5000);
		driver.close();
				
		

	}

}
