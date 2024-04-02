package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusTicket_Page {
	
	@FindBy(xpath = "//input[@placeholder='From Station']")
    WebElement fromstation;
	
	public BusTicket_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void fromStation()
	 {
		fromstation.click();
	 }
	
	@FindBy(xpath = "//input[@placeholder='To Station']")
    WebElement tostation;
	
	public void toStation()
	 {
		tostation.click();
	 }

    @FindBy(xpath = "//button[text()='Tomorrow']")
    WebElement tomorrowButton;
    
    public void tomorrowButton()
	 {
    	tomorrowButton.click();
	 }
    public void data(String loc, String dest) {
    	fromstation.click();
    	fromstation.sendKeys(loc);
    	tostation.click();
    	tostation.sendKeys(dest);
    	
    }
    
	
	
}
