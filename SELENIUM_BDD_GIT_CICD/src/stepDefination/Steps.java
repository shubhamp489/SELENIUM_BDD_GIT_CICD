package stepDefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;
	
	
	@Given("I Open Bongaricia Home Page")
	public void i_open_bongaricia_home_page() {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/index.html");
	}

	@When("I click on WebForm icone")
	public void i_click_on_web_form_icone() {
	   driver.findElement(By.xpath("//a[text()='Web form']")).click();
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
	/*	JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement element=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	 element.click();	
	
	 WebElement element = driver.findElement(By.xpath("//button[text()='Submit']"));
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	 element.click();
 */
	 driver.findElement(By.cssSelector("input#my-text-id")).sendKeys("Shubham");
	 
	}

	@Then("I validate the Received as outcome")
	public void i_validate_the_received_as_outcome() {
	   String url=driver.findElement(By.xpath("//h1[text()='Web form']")).getText();
	   System.out.println(url);
	   Assert.assertEquals(url,"Web form");
	   driver.quit();
	}

}
