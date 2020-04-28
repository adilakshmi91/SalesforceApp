package BrowserUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	    static ChromeDriver driver;
	    public static ChromeDriver getChromedriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		return driver;
	}
        public static XSSFSheet readfile() throws Exception {
		String file = "C:\\Users\\adila\\OneDrive\\Desktop\\Logindetails.xlsx";
		FileInputStream fi = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook myExcelBook = new XSSFWorkbook(fi);
		XSSFSheet Sheet = myExcelBook.getSheetAt(0);
        Row row = Sheet.getRow(1);
	    driver.findElement(By.id("username")).sendKeys(row.getCell(0).getStringCellValue());
	    driver.findElement( By.id("password")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement( By.xpath("//input[@id='Login']")).click();
		Thread.sleep(5000);
		return Sheet;
	}
	        public static XSSFSheet readContacts() throws Exception {

			String file = "C:\\Users\\adila\\OneDrive\\Desktop\\Logindetails.xlsx";
			FileInputStream fi = new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook myExcelBook = new XSSFWorkbook(fi);
		    XSSFSheet Sheet1 = myExcelBook.getSheet("Contacts");
			return Sheet1;
		}
	         public static XSSFSheet readOpty() throws Exception {
			String file = "C:\\Users\\adila\\OneDrive\\Desktop\\Logindetails.xlsx";
			FileInputStream fi = new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook myExcelBook = new XSSFWorkbook(fi);
		    XSSFSheet Sheet2 = myExcelBook.getSheet("opty");
			return Sheet2;
	         }
	            public static XSSFSheet readLeads() throws Exception {
	 			String file = "C:\\Users\\adila\\OneDrive\\Desktop\\Logindetails.xlsx";
	 			FileInputStream fi = new FileInputStream(file);
	 		    XSSFWorkbook myExcelBook = new XSSFWorkbook(fi);
	 		    XSSFSheet Sheet3 = myExcelBook.getSheet("Leads");
	 			return Sheet3;
	         }
	         
	                public static XSSFSheet readAccount() throws Exception {
		 			String file = "C:\\Users\\adila\\OneDrive\\Desktop\\Logindetails.xlsx";
		 			FileInputStream fi = new FileInputStream(file);
		 			XSSFWorkbook myExcelBook = new XSSFWorkbook(fi);
		 		    XSSFSheet Sheet4 = myExcelBook.getSheet("Accounts");
		 			return Sheet4;
		         }
	         
	           public static void waitForPageElementToVisible(WebElement eleToWait) {
	     		WebDriverWait wait = new WebDriverWait(LaunchBrowser.driver, 30);
	     		wait.until(ExpectedConditions.visibilityOf(eleToWait));
	     		
	     	}

	  
}

