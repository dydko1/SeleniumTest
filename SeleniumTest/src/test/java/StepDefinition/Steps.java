package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver81.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		driver.findElement(By.name("uid")).sendKeys("mngr258522");
		driver.findElement(By.name("password")).sendKeys("hetEmAr");
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		driver.findElement(By.name("btnLogin")).click();
	}

}