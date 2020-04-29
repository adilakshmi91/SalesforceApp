package SalesforceTesting;

import java.awt.Desktop.Action;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BrowserUtility.LaunchBrowser;

public class MyProfile extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		 getChromedriver();
		
		readfile();
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(5000);
	    WebElement about= driver.findElement(By.xpath("//a[contains(text(),'About')]"));
        about.click();
        driver.findElement(By.xpath("//input[@id='lastName']")).clear();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mandala");
        waitForPageElementToVisible(driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")));
        driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
         Thread.sleep(6000);
     
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("body")).sendKeys("Doing Automation");
    	Thread.sleep(3000);
        driver.switchTo().defaultContent();
    	WebElement s=driver.findElement(By.xpath("//div[@class='profileSection']"));
    	s.click();
    	driver.findElement(By.xpath("//span[@class='publisherShareButtonPlaceholder']//input[@id='publishersharebutton']")).click();
    	Thread.sleep(3000);
    	WebElement file=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
    	file.click();
    	WebElement upload=driver.findElement(By.id("chatterUploadFileAction"));
    	waitForPageElementToVisible(upload);
        upload.click();
    	WebElement choosefile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
    	waitForPageElementToVisible(choosefile);
    	choosefile.sendKeys("C:\\Users\\adila\\OneDrive\\Desktop\\image.jpg");
    	Thread.sleep(5000);
    	//driver.switchTo().defaultContent();
    	driver.findElement(By.id("publishersharebutton")).click();
    	WebElement pic=driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));
    	waitForPageElementToVisible(pic);
        Actions act=new Actions(driver);
        act.moveToElement(pic).build().perform();
        Thread.sleep(3000);
    	WebElement Photo=driver.findElement(By.id("uploadLink"));
    	Photo.click();
    	waitForPageElementToVisible(Photo);
    	driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
    	Thread.sleep(5000);
    	WebElement upload1=driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
    	upload1.sendKeys("C:\\Users\\adila\\OneDrive\\Desktop\\nature.jpg");
    	waitForPageElementToVisible(upload1);
    	
    	WebElement checked=driver.findElement(By.id("j_id0:uploadFileForm:photoVisibility"));
    	if(!checked.isSelected()) {
			 checked.click();
			 System.out.println("checkbox is checked");
			  }
    	else {
    		System.out.println("it failed ");
    	}
    	driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
        Thread.sleep(3000);
        
      
         Actions action=new Actions(driver); 
    	  action.dragAndDropBy(driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']")), 100, 20).perform();
    	  driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click(); 
    	  driver.switchTo().defaultContent();

        Thread.sleep(7000);
       		
	}
		

	}


