package SalesforceTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BrowserUtility.LaunchBrowser;

public class MyProfile extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = getChromedriver();
		@SuppressWarnings("unused")
		XSSFSheet Sheet = readfile();
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		driver.switchTo().frame(driver.findElement(By.id("aboutTab")));
		Thread.sleep(5000);
	    WebElement about= driver.findElement(By.xpath("//a[contains(text(),'About')]"));
        about.click();
		//driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		 
		
	/*	driver.findElement(By.id("moderatorMutton")).click();
		Thread.sleep(5000);
		
		
		WebElement editprofile=driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		Actions  act=new Actions(driver);
		act.moveToElement(editprofile).click().build().perform();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.id("aboutMeContentId")));
		driver.findElement(By.id("editContactInfoCancelButton")).click();
		Thread.sleep(5000);
		driver.close();
		
	}*/
	}
		

	}


