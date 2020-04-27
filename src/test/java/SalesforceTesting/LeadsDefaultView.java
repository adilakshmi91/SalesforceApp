package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadsDefaultView extends Login {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		Row row = Sheet.getRow(1);
		driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.id("password")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@name='fcf']")).click();
		driver.findElement(By.xpath("//select[@id='fcf']//option[contains(text(),'My Unread Leads')]")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions act=new Actions(driver);
		act.moveToElement(logout).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Login"));
		driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.id("password")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		

	}

}
