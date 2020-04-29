package SalesforceTesting;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.chrome.ChromeDriver;
import BrowserUtility.LaunchBrowser;

public class Login extends LaunchBrowser {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = getChromedriver();
	
	     readfile();
	}
}
	