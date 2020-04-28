package SalesforceTesting;

import java.awt.Desktop.Action;

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
        
     //   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
        Thread.sleep(6000);
        WebElement e=driver.findElement(By.xpath("//div[@id='cke_publisherRichTextEditor']"));
    	e.click();

    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//body[contains(@class,'chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]//p")).sendKeys("I am learning Selenium");
    	Thread.sleep(3000);

    	driver.switchTo().defaultContent();
    	WebElement s=driver.findElement(By.xpath("//div[@class='profileSection']"));
    	s.click();
    	
    	driver.findElement(By.xpath("//span[@class='publisherShareButtonPlaceholder']//input[@id='publishersharebutton']")).click();
    	Thread.sleep(3000);
    	WebElement f=driver.findElement(By.xpath("//span[contains(text(),'File')]"));
    	f.click();
    	WebElement fi=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
    	waitForPageElementToVisible(fi);

    	fi.click();
    	
    	WebElement file=driver.findElement(By.xpath("//input[@id='chatterFile']"));
    	waitForPageElementToVisible(file);
    	
    	file.sendKeys("C:/Users/adila/OneDrive/Desktop/image.png");
    	WebElement pic=driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));
    	waitForPageElementToVisible(pic);
        Actions act=new Actions(driver);
        act.moveToElement(pic).build().perform();
        Thread.sleep(3000);
    	driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
        WebElement upload=driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));
        waitForPageElementToVisible(upload);
        Actions act1=new Actions(driver);
         act1.moveToElement(upload).perform();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[@id='uploadPhotoContent']")).click();
    	
    	driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("C:\\Users\\adila\\OneDrive\\Desktop\\image.jpg");
    	Thread.sleep(3000);
    	//driver.switchTo().defaultContent();
    	//driver.findElement(By.xpath("//div[@class='uploadButtonPanel']")).click();
    	
    	WebElement save=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn' and @type='submit']"));
    	
    	save.click();
    
        Thread.sleep(7000);
       		
	}
		

	}


