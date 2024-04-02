package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APSRTC_Page {
	
	@FindBy(xpath = "//h3[contains(text(), 'APSRTC')]")
    private WebElement apsrtc;
	
	public APSRTC_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 public void apsrtc()
	 {
		 apsrtc.click();
	 }

}
