package IxigoStepdefinations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.BusTicket_Page;
import POM.Home_Page;
import POM.IxigoExcel;
import io.cucumber.java.en.When;

public class IxigoExcelUnit {
	WebDriver driver;

		@DataProvider(name = "testdata")

		public Object getData() {

			IxigoExcel utils = new IxigoExcel("C:\\Users\\KSREEK\\OneDrive - Capgemini\\kalyani.html\\OneDrive - Capgemini\\Desktop\\Data.xlsx");

			int rows = utils.getRowCount(0);

			Object[][] logindata = new Object[rows][2];

			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < 2; j++) {

					logindata[i][j] = utils.getdata(0, i + 1, j);

					System.out.println(logindata[i][j]);

				}
	 
			}

			return logindata;

		}
		@BeforeMethod 
		public void destination() throws InterruptedException{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ixigo.com");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			Home_Page obj=new Home_Page(driver);
			obj.bus_Link();
			driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		}

		
		
	@Test(dataProvider = "testdata")

		public void details(String loc1,String loc2){
	 
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

			 BusTicket_Page bp = new BusTicket_Page(driver);
			 bp.data(loc1, loc2);
			 

		}
}
