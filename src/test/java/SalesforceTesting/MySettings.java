package SalesforceTesting;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserUtility.LaunchBrowser;


public class MySettings extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		
      ChromeDriver driver = getChromedriver();
	  @SuppressWarnings("unused")
	XSSFSheet Sheet = readfile();
	  Thread.sleep(5000);
	  driver.findElement(By.id("userNavLabel")).click();
	  WebElement settings=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
	  Actions act= new Actions(driver);
	  act.moveToElement(settings).click().build().perform();
	  Thread.sleep(4000);
	  WebElement personal=driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
	  Actions act1=new Actions(driver);
	  act1.moveToElement(personal).click().build().perform();
	  WebElement history=driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
	  Actions act2=new Actions(driver);
	  act2.moveToElement(history).click().build().perform();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
	  driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[@class='folderIcon DisplayAndLayout_icon']")).click();
	  Thread.sleep(6000);
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("CustomizeTabs_font"))));
		WebElement custom=driver.findElement(By.id("CustomizeTabs_font"));
	   Actions act3=new Actions(driver);
	  act3.moveToElement(custom).click().build().perform();
	  Thread.sleep(5000);
	  driver.findElement(By.id("p4")).click();
	  WebElement scroll=driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]"));
	  scroll.click();
	 @SuppressWarnings("unused")
	 WebElement Availabletabs=driver.findElement(By.id("duel_select_0"));
	 driver.getMouse();
	 JavascriptExecutor je = (JavascriptExecutor) driver;
     WebElement reports=driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
     je.executeScript("arguments[0].scrollIntoView()",reports);
     reports.click();
     wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@class='rightArrowIcon']"))));
     driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
     driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
     driver.findElement(By.xpath("//span[@class='folderIcon DisplayAndLayout_icon']")).click();
	  Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']")).click();
	 wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//span[@id='EmailSettings_font']"))));
	 driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
	 driver.findElement(By.xpath("//input[@name='save']")).click();
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"))));
	 driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']")).click();
	 driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
	 WebElement Activity=driver.findElement(By.xpath("//span[@id='Reminders_font']"));
	 Actions act4=new Actions(driver);
	 act4.moveToElement(Activity).click().perform();
	 driver.findElement(By.xpath("//input[@name='save']")).click();
	 Thread.sleep(5000);
	 driver.close();
	}
}

