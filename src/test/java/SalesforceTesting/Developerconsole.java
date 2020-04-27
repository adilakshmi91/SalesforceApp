package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserUtility.LaunchBrowser;

public class Developerconsole extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		
			ChromeDriver driver = getChromedriver();
			@SuppressWarnings("unused")
			XSSFSheet Sheet = readfile();
			driver.findElement(By.id("userNavButton")).click();
			driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
			driver.close();
			Thread.sleep(5000);
			driver.close();
		

	}

}
