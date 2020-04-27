package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BrowserUtility.LaunchBrowser;

public class Logout extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		@SuppressWarnings("unused")
		XSSFSheet Sheet = readfile();
	    driver.findElement(By.id("userNavButton")).click();
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions act=new Actions(driver);
		act.moveToElement(logout).click().build().perform();
		Thread.sleep(5000);
		driver.close();
		

	}

}
