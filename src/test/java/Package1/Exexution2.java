package Package1;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exexution2 {


	
	
	@Test(priority=1)
	public void setup() throws InterruptedException {
		//System.setProperty("weblocaldriver.chrome.driver", "./Drivers/chromelocaldriver.exe");
		//driver=new ChromeDriver();
		
		//ChromeDriver localdriver = null;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.82 Safari/537.36");
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		//ChromeOptions options1 = new ChromeOptions();
		
		
		driver.get("https://13-11-qa-1.myhbx.org/");
		Thread.sleep(10000);
		
	
	
	
}}
