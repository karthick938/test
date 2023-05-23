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

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch1 {

	ChromeDriver localdriver = null;
	
	

	@BeforeTest
	public void setup() throws InterruptedException {
		/*ChromeOptions options = new ChromeOptions();
		//options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.82 Safari/537.36");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("headless");
		options.addArguments("disable-gpu");

		WebDriverManager.chromedriver().setup();
		System.out.println("Checking chrome launching succesful or not");

		WebDriver driver=new ChromeDriver(options);
		System.out.println("Checking chrome launching succesful or not");
		driver.get("https://13-13-qa-1.myhbx.org/");
		Thread.sleep(5000);
		driver.findElement(By.id("id_username")).sendKeys("superuser@hbxcloud.com");
		driver.findElement(By.id("id_password")).sendKeys("5up3rU53r!");
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a")).click();
		driver.findElement(By.partialLinkText("Create User")).click();*/
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver","/var/lib/snapd/apparmor/profiles/snap.chromium.chromedriver");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("disable-gpu");
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://13-13-qa-1.myhbx.org/");
		System.out.println("Chrome Launched");
		

	}
	//@Test(priority=1)
	public void loginTest() {
		try {
		//WebDriver driver;
		//System.setProperty("weblocaldriver.chrome.driver", "./Drivers/chromelocaldriver.exe");

		//System.setProperty("weblocaldriver.chrome.driver", "Drivers/chromelocaldriver.exe");
		//System.setProperty("weblocaldriver.http.factory", "jdk-http-client");
		//WebDriverManager.chromedriver().setup();
		
		//driver=new ChromeDriver();
		
		//localdriver.get("https://13-11-qa-1.myhbx.org/");
		//localdriver.manage().window().maximize();
		
		//driver = localdrver
		localdriver.findElement(By.id("id_username")).sendKeys("superuser@hbxcloud.com");
		localdriver.findElement(By.id("id_password")).sendKeys("5up3rU53r!");
		localdriver.findElement(By.id("signin")).click();
		localdriver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a")).click();
		localdriver.findElement(By.partialLinkText("Create User")).click();
//		localdriver.findElement(By.xpath("//button[@class='btn btn-primary' and text()='Select']")).click();
//		//creating User 
//		
//		localdriver.findElement(By.name("category")).click();
//		localdriver.findElement(By.xpath("//option[text()='Participant']")).click();
//		//localdriver.findElement(By.id("id_first_name")).sendKeys(Fname);
//		//localdriver.findElement(By.id("id_last_name")).sendKeys(Lname);
//		localdriver.findElement(By.id("id_gender")).click();
//		localdriver.findElement(By.xpath("//option[text()='Male']")).click();
//		
//		localdriver.findElement(By.id("id_country")).click();
//		localdriver.findElement(By.xpath("//option[text()='United States of America']")).click();
//		
//		localdriver.findElement(By.id("id_city")).sendKeys("new orlens");
//		
//		
//		
//		
//		
//		//localdriver.findElement(By.id("id_username")).sendKeys(Email);
//		localdriver.findElement(By.id("id_password")).sendKeys("02134B0dge@!");
//		
//		localdriver.findElement(By.id("create_user_save")).click();
//		
//		WebElement errorMessage = localdriver.findElement(By.xpath("//ul[@class='errorlist']/li"));
//        if (errorMessage.isDisplayed()) {
//            localdriver.findElement(By.className("navbar-brand")).click();
//            System.out.println("the User is already created.");
//
//        } else {
//            System.out.println("User created successfully.");
//        }
	}
	catch (Exception e) {
		e.printStackTrace();
	}}}
	
