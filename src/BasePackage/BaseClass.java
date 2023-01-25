package BasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;

	
	public static  WebDriver Browser(String BrowserType) {
		if(BrowserType.contains("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			
			if(BrowserType.contains("headless")) {
				options.setHeadless(true);
			}
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://portfolio-assignment.babbangonaapps.com/login");
			return driver;
		}
		else if(BrowserType.contains("Edge")) {
			EdgeOptions options = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			
			if(BrowserType.contains("headless")) {
				options.setHeadless(true);
			}
			
			WebDriver driver = new EdgeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://portfolio-assignment.babbangonaapps.com/login");
			return driver;
		}
		else if(BrowserType.contains("Firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			
			if(BrowserType.contains("headless")) {
				options.setHeadless(true);
			}
			
			WebDriver driver = new FirefoxDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://portfolio-assignment.babbangonaapps.com/login");
			return driver;
		}
		return driver;
		
	}
	
	
	
	public static WebDriver SetUp() {
		return Browser("Chrome headless");
	}
	
	
	
	public static void Admin_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin_032");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("3456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	
	public static void TGE_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ikara.TGE.Hub_Supervisor");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("7939");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

	
	public static void Direct_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ikara.BGD.Hub_Supervisor");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1111");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	
	public static void Advisor_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ikara.PC.Supervisor");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1111");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	public static void Admin_Username_password_2(WebDriver driver, String username, String password) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(5000);
	}
	
	public static void Supervisor_Username_password_2(WebDriver driver, String username, String password) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	
	public static void TearDown(WebDriver driver) {
		driver.quit();
	}

}
