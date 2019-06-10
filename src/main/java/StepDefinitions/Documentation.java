package StepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import UtilList.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

public class Documentation extends Utils{
	
	
	WebDriver driver;
	
	@Given("^user launch the browser$")
	public void user_launch_the_browser() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Infocampus\\Software\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
			
		 driver.get("https://developer.here.com/documentation");
		
	}
	
	@When("^user validate the sublinks in current page$")
	public void user_validate_the_sublinks_in_current_page() {
		
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='documentation-link-features']//a"));
		
		for(WebElement links:link) {
			
			String str = links.getAttribute("href");
			
			int statusCode = new Utils().httpResponseCodeViaGet(str);
			
			if(200 == statusCode)
			{
				System.out.println(str+" page is rendered and status is : "+statusCode);
			}
			else
			{
				System.out.println(str+" page is not rended :");
			}
		}
		
	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		
		driver.quit();
	}

}
