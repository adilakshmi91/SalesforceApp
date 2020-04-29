package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserUtility.LaunchBrowser;

public class BlockingEventCalender extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		getChromedriver();
		readfile();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Tuesday April 28, 2020')]")).click();
		WebElement time=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		Actions act=new Actions(driver);
		act.moveToElement(time).click().perform();
		Thread.sleep(5000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")));
		driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")).click();
		Thread.sleep(7000);
		String child_window=driver.getWindowHandle();
		driver.switchTo().window(child_window);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.titleContains("Login"));
		Thread.sleep(6000);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Other')]"))));
		WebElement other=driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(other).click().perform();
		Thread.sleep(5000);
		String Parent_window=driver.getWindowHandle();
		Thread.sleep(5000);
		driver.switchTo().window(Parent_window);
		Thread.sleep(6000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		waitForPageElementToVisible(driver.findElement(By.id("timePickerItem_36")));
		driver.findElement(By.id("timePickerItem_36")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		

	}

}
