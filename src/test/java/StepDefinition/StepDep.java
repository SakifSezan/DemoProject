package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDep {

	WebDriver driver;
@Given("^Open Dell application$")
public void open_Dell_application() throws Throwable {
	System.setProperty("Webdriver.chrome.driver", "C:\\ChromeDriver\\chrome.exe\"");
	ChromeOptions TX = new ChromeOptions();
	TX.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    
   
}

@Then("^Click Computers & Accessories$")
public void click_Computers_Accessories() throws Throwable {
	WebElement A = driver.findElement(By.xpath("Deals"));
	A.click();
    
}

@Then("^Dropdown to Laptops$")
public void dropdown_to_Laptops() throws Throwable {
	Select DD = new Select(driver.findElement(By.id("2")));
	DD.selectByVisibleText("Laptops");
}

@Then("^Click View all laptops$")
public void click_View_all_laptops() throws Throwable {
   
}



}
