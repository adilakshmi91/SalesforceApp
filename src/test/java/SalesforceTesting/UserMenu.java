package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class UserMenu extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		getChromedriver();
		 readfile();
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
