package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fbdemoSteps {
	
		WebDriver driver;
	
	//Hooks
	@Before(order = 0)
	
	public void setup()
	{
		System.out.println("This is Before order 0");
		}
	
	@Before(order = 1)
	
	public void url() throws InterruptedException
	{
		
		System.out.println("This is Before order 1");

	}
	
		
		@Given("User launches the fb url")
		public void maximize() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			
		    
		}

		@When("User enter the username")
		public void user_enter_the_username() throws InterruptedException {
		    driver.findElement(By.id("email")).sendKeys("Oranium");
		    Thread.sleep(2000);
		}

		@When("User enters the password")
		public void user_enters_the_password() {
		    driver.findElement(By.id("pass")).sendKeys("123456");
		}
		

		@When("User clicks on login button")
		public void user_clicks_on_login_button() {
			
		    driver.findElement(By.name("login")).click();
		}
		
		@Then("User should be on facebook page")
		public void facebookPage()

		{
			driver.close();
		}
		
		@When("User enter the username {string}")
		public void user_enter_the_username(String uname) {
			
			{
				 driver.findElement(By.id("email")).sendKeys(uname);
			}
		
			
			
			
		}
		@When("User enters the password {string}")
		public void user_enters_the_password(String pass) {
			
			driver.findElement(By.id("pass")).sendKeys(pass);
		    
		}
 


	@After
		
		public void tear()
		
		{
			System.out.println("I am going to close the URL");
		}
	
	

	}
