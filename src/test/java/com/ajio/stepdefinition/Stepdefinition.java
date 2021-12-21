package com.ajio.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ajio.runner.AjioRunner;

import IDFC.AjioProject.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {

	public static WebDriver driver = AjioRunner.driver;

	@Given("To launch the application")
	public void to_launch_the_application() {
		System.out.println("User launch the application");
	}

	@When("user launch the browser")
	public void user_launch_the_browser() {
		driver.get("https://www.google.com/");
	}

	@Then("user invoke the Ajio application")
	public void user_invoke_the_ajio_application() {
		driver.get("https://www.ajio.com/shop/women");
	}

	@Then("user in homepage")
	public void user_in_homepage() {
		System.out.println("user in homepage");

	}

	@Given("To mouse over on women category")
	public void to_mouse_over_on_women_category() {
		System.out.println("Mouse over women category");
	}

	@When("user mouse over on women category")
	public void user_mouse_over_on_women_category() {
		WebElement Women = driver.findElement(By.xpath("//a[@title ='WOMEN']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Women).perform();

	}

	@Then("user select the dress material category")
	public void user_select_the_dress_material_category() {
		WebElement drss = driver.findElement(By.xpath("//a[@title ='Dress Material']"));
		Actions at = new Actions(driver);
		at.moveToElement(drss).perform();

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()", drss);

	}

	@Then("user on the dress material category")
	public void user_on_the_dress_material_category() {
		System.out.println("dress material category");
	}

	@Given("select the price range option.")
	public void select_the_price_range_option() {
	   WebElement select = driver.findElement(By.xpath("(//span[@class ='facet-left-pane-label'])[3]"));
	    select.click();
	}
	
	@When("^ user enter the minimum price^")
	public void user_enter_the_minimum_price() {
	    driver.findElement(By.id("minPrice")).sendKeys("300");
	}

	@When("^user enter the maximum price^")
	public void user_enter_the_maximum_price() {
	    driver.findElement(By.id("maxPrice")).sendKeys("500");
	
	}

	@When("user the select the continue button")
	public void user_the_select_the_continue_button() {
		driver.findElement(By.xpath("// button[@type='submit']")).click();
	}

	@Then("select the list out item")
	public void select_the_list_out_item() {
		 System.out.println("Items");
	}


}
