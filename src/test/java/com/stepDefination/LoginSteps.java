package com.stepDefination;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;
	WebDriverWait wait;

	@Given("User is on loginPage")
	public void user_is_on_login_page() {
		System.out.println("step 1: User is on login page");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("User enters username and password")
	public void user_enters_username_and_password()

	{
		System.out.println("step 1: User enters username and password");
		// WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		//WebElement usernameField = driver.findElement(By.name("username"));
		System.out.println("Username field located");
		usernameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");

	}

	@And("Click on Login Button")
	public void click_on_login_button() {
		System.out.println("step 2: User clicks login button");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}

	@Then("User should land on homePage")
	public void user_should_land_on_home_page() {
		System.out.println("step 3: User is on homepage");

	}

	/*
	 * private void takeScreenshot(String fileName) { File scrFile =
	 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); try {
	 * FileUtils.copyFile(scrFile, new File("screenshots/" + fileName + ".png")); }
	 * catch (Exception e) { e.printStackTrace(); } }
	 */

}
