package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	 @FindBy(xpath = "(//a[@href='/buses']//p)[2]")
	    WebElement busesLink;

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 public void bus_Link() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 busesLink.click();
	 }

}
