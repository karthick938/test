package Package1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch1 {

	
	

	@BeforeTest
	public void setup() throws InterruptedException, MalformedURLException {
		DesiredCapabilities capability=new DesiredCapabilities();
		java.net.URL url =new java.net.URL("http://18.117.123.212:4445");
		WebDriver driver = new RemoteWebDriver(url,capability);
		driver.get("https://13-15-qa-1.myhbx.org");
		Thread.sleep(5000);
		driver.quit();

	}}
	
	
