package com.example.assignment5;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class AppTest {
	WebDriver driverObj;
	@Test
	@Given("I launch google browser for google")
	public void iLaunchGoogleBrowserForGoogle() {
		System.setProperty("webdriver.chrome.driver", "C://Users//User//Downloads//chromedriver.exe");
		 driverObj = new ChromeDriver();
	}
	
	@Test
	@When("I open google sign up webpage")
	public void iOpenGoogleSignUpWebpage() {
		driverObj.get("https://accounts.google.com/SignUp");
	}
	
	@Test
	@Then("I enter user data and process next button")
	public void iEnterUserDataAndProcessNextButton() {
		driverObj.manage().deleteAllCookies();
		driverObj.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driverObj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverObj.findElement(By.name("firstName")).sendKeys("Aleksei");
		driverObj.findElement(By.name("lastName")).sendKeys("Pant");
		driverObj.findElement(By.name("Username")).sendKeys("apantjke2023");
		driverObj.findElement(By.name("Passwd")).sendKeys("j123sdetin90cV");
		driverObj.findElement(By.name("ConfirmPasswd")).sendKeys("j123sdetin90cV");
		driverObj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverObj.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
	}
	
	@Test
	@And("Close browser for Google")
	public void closeBrowserForGoogle() {
		System.out.println("end");
	}
}