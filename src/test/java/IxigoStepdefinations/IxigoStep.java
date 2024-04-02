package IxigoStepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IxigoStep {
	WebDriver driver;
	
	@Given("I am on Ixigo home page")
	public void i_am_on_ixigo_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}

	@Given("I click on Buses")
	public void i_click_on_buses() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("(//a[@href='/buses']//p)[2]")).click();
		Home_Page obj=new Home_Page(driver);
		obj.bus_Link();
	}

	@Then("I can see Book Bus Tickets page")
	public void i_can_see_book_bus_tickets_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("I am on Bus Tickets page")
	public void i_am_on_bus_tickets_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("I click on From Station")
	public void i_click_on_from_station() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	//	WebElement fromstation = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
	}

	@When("I give {string}")
	public void i_give(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement fromstation = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		fromstation.sendKeys(string);
		fromstation.sendKeys(Keys.RETURN);
	}

	@When("I click on To Station")
	public void i_click_on_to_station() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException()
	}
	
	@When("I give station as {string}")
	public void i_give_station_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement tostation = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		tostation.sendKeys(string);
	    tostation.sendKeys(Keys.RETURN);
	}

	@When("I click on Tomorrow")
	public void i_click_on_tomorrow() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
	}

	@When("I click on Search")
	public void i_click_on_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I can see Buses on this route")
	public void i_can_see_buses_on_this_route() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I scroll down")
	public void i_scroll_down() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(8000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,2000)");
	}

	@Given("I am on Buses on this route page")
	public void i_am_on_buses_on_this_route_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on Track Ticket")
	public void i_click_on_track_ticket() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement trackticket = driver.findElement(By.xpath("//a[@id='track-link']"));
		trackticket.click();
	}

	@Then("I can see Track Ticket page")
	public void i_can_see_track_ticket_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I am on Book Bus Tickets page")
	public void i_am_on_book_bus_tickets_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(8000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,2000)");
	}

	@When("I click on APSRTC")
	public void i_click_on_apsrtc() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement apsrtc = driver.findElement(By.xpath("//p[text()='Andhra Pradesh State Road Transport Corporation']"));
		apsrtc.click();
		
	}

	@Then("I can see APSRTC Bus Tickets page")
	public void i_can_see_apsrtc_bus_tickets_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}



}
