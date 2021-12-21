package com.ajio.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import IDFC.AjioProject.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\ajio\\feature", glue = "com\\ajio\\stepdefinition")


public class AjioRunner{
	
		public static WebDriver driver;
	

		@BeforeClass
		public static void set() {
			//driver=Base_Class.getBrowser("Chrome");
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Prathiba\\eclipse-workspace\\AjioProject\\Driver\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments(" --disable-notifications");

			driver = new ChromeDriver(options);
		}

	}


