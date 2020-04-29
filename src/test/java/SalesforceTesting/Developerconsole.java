package SalesforceTesting;

import org.openqa.selenium.By;
import BrowserUtility.LaunchBrowser;

public class Developerconsole extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		
			 getChromedriver();
			
			 readfile();
			driver.findElement(By.id("userNavButton")).click();
			driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
			driver.close();
			Thread.sleep(5000);
			driver.close();
		

	}

}
