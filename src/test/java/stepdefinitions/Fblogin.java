package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fblogin {
	public WebDriver driver;

	@Given("Open any browser with fb URL")
	public void openBrowserWithURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("User type invalid test data")
	public void typeInvalidTestData() {
		// Type Credentials (UN& PSWD)
		driver.findElement(By.id("email")).sendKeys("Sravansdt54tesdffgd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("4576tdfbxSravansdt54t");
	}

	@And("Click on Login button")
	public void clickOnLoginButton() throws Exception {
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	@Then("System will display error message or not")
	public void getTheErrorMessage() {

		// validate error message
		if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0) {// 0>0
			String errMsg = driver.findElement(By.linkText("Find your account and log in.")).getText();
			System.out.println(errMsg);

		} else if (driver.findElements(By.xpath("//div[text()='You Entered An Old Password']")).size() > 0) {
			String errMsg1 = driver.findElement(By.xpath("//div[text()='You Entered An Old Password']")).getText();
			System.out.println(errMsg1);
		} else {
			System.out.println("No error message, system logged in successfully with valid test data.");
		}

	}

	@When("User type valid test data")
	public void typeValidTestData() {
		driver.findElement(By.id("email")).sendKeys("h2otestingtools@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Test@123");
	}

	@When("^User type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void typeMultipleTestData(String UN, String PWD) {
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.name("pass")).sendKeys(PWD);
	}
}
