package gluecode;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class test {
	
	private ChromeDriver driver;

	@Given("The user is in the main Google")
	public void the_user_is_in_the_main_google() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
	   
	}
	@When("writedown Capital de Peru")
	public void writedown_capital_del_peru() {
	    
		By element = By.xpath(".//textarea[@aria-label='Buscar']");
		WebElement search = driver.findElement(element);
		search.sendKeys("Capital de Peru");

	    
	}
	
	@And("press enter")
	public void press_enter() {
	    
		By element = By.xpath(".//textarea[@aria-label='Buscar']");
		WebElement search = driver.findElement(element);
		search.sendKeys(Keys.ENTER);
	    
	}
	
	@Then("Shows result about Capital del Peru")
	public void shows_result_about_capital_del_peru() {
	    
		By element = By.xpath(".//h3[contains(text(),'Bienvenidos a Lima')]");
		WebElement result = driver.findElement(element);
		Assert.assertEquals(result.isDisplayed(), true);
		driver.quit();
	}

	
}
