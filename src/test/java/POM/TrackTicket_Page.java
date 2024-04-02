package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackTicket_Page {
	
	@FindBy(xpath = "//input[@id='ticket_number']")
    private WebElement ticketNumberInput;
	
	public void ticketNumber()
	 {
		ticketNumberInput.click();
	 }
	
	public TrackTicket_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
    @FindBy(xpath = "//button[text()='Track']")
    private WebElement trackButton;
    
    public void trackButton()
	 {
    	trackButton.click();
	 }

}
