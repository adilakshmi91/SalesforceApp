package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPasswordA extends Login{

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		Row row = Sheet.getRow(3);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
