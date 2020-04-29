package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPasswordB  extends Login{

	public static void main(String[] args) throws Exception {
		 getChromedriver();
		XSSFSheet Sheet = readfile();
		Row row = Sheet.getRow(4);
		driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
		driver.findElement( By.id("password")).sendKeys(row.getCell(1).getStringCellValue());
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(5000);
		driver.close();
	

	}

}
