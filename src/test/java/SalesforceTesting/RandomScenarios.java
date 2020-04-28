package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class RandomScenarios extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		@SuppressWarnings("unused")
		XSSFSheet Sheet = readfile();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")).click();
		Thread.sleep(4000);
		driver.close();
		

	}

}
