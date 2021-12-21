package IDFC.AjioProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	// browser launch

	public static WebDriver getBrowser(String browsername) {

		try {
			
			if (browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Prathiba\\eclipse-workspace\\AjioProject\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
			} 
			else if (browsername.equalsIgnoreCase("msedge")) 
			{
				System.setProperty("webdriver.msedge.driver",
						"C:\\Users\\Prathiba\\eclipse-workspace\\Selenium_Prathiba\\Driver1\\msedgedriver.exe");
				driver = new EdgeDriver();

			} else 
			{
				System.out.println("Invalid browser name");
			}
			driver.manage().window().maximize();
		} 
		catch (Exception e)
		{
			e.getStackTrace();
		}
		return driver;
	}
	// send keys

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

//Url

	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
//Mouse over
	
	public static void movetoElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()", element);
	}
	
	
//click

	public static void click(WebElement element) {
		Actions at = new Actions(driver);
		at.click(element).perform();
	}

	// double click

	public static void doubleclick(WebElement element1) {
		Actions act1 = new Actions(driver);
		act1.doubleClick(element1).perform();
	}

	// context click
	public static void contextclick(WebElement element2) {
		Actions act2 = new Actions(driver);
		act2.doubleClick().perform();
	}

	// dropdown

	public static void dropdown(WebElement element3, String Options, String value) {
		Select s = new Select(element3);

		if (Options.equalsIgnoreCase("byindex")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (Options.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		} else if (Options.equalsIgnoreCase("byvisible text")) {
			s.selectByVisibleText(value);
		}

		else {
			System.out.println("invalid option");
		}
	}

// keydown

	public static void keydown() throws AWTException {
		Robot n = new Robot();
		n.keyPress(KeyEvent.VK_DOWN);
		n.keyRelease(KeyEvent.VK_DOWN);
	}

// window delay
	public static void windowdelay() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

//new Url

	public static void getNewUrl(String NewUrl) {
		driver.navigate().to(NewUrl);
	}

	public static void backtopage() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void reloadpage() {
		driver.navigate().refresh();
	}

	public static void id(String value) {
		driver.findElement(By.id(value));

	}

	public static void name(String value) {
		driver.findElement(By.name(value));
	}

	public static void classname(String value) {
		driver.findElement(By.className(value));
	}

	public static void xpath(String value) {
		driver.findElement(By.xpath(value));
	}

}
