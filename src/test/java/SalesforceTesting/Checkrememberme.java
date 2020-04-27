package SalesforceTesting;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BrowserUtility.LaunchBrowser;

public class Checkrememberme  extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		XSSFSheet Sheet = readfile();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		 if(!checkbox.isSelected()) {
			 checkbox.click();
			  }
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.id("userNavLabel")).click();
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions act=new Actions(driver);
		act.moveToElement(logout).click().build().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
