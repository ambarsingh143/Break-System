package break_system.auto_system;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class start_stop {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Arun Kanaujia\\eclipse-workspace\\automate_ss\\src\\main\\java\\break_system\\auto_system\\chromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Open Successfully");

		driver.manage().window().maximize();
		System.out.println("Chrome Maximize Successfully");

		driver.get("http://hrm.snva.com/login");
		System.out.println("Website Open Successfully");
		
		driver.findElement(By.xpath("//input[@id=\"emp_id\"]")).click();
		System.out.println("Email field clicked");
		
		driver.findElement(By.xpath("//input[@id=\"emp_id\"]")).sendKeys("nhambar67@gmail.com");
		System.out.println("Email field keys send");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).click();
		System.out.println("Password field clicked");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("7538159@Ambar");
		System.out.println("Password field keys send");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("Submit button clicked Successfully");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"skip-login\"]")).click();
		System.out.println("Skip punch-in successfully");
		
		driver.findElement(By.xpath("//select[@id=\"breaktype\"]")).click();
		System.out.println("Select Break-type button clicked Successfully");
		
		driver.findElement(By.xpath("//option[@value=\"Lunch\"]")).click();
		System.out.println("Select Lunch Break clicked Successfully");
		Thread.sleep(900000);
		
//		int minTime = 900000; // 15 Minutes in Milisecond
//		int maxTime = 1020000; // 17 Minutes in Milisecond
//		Random  random = new Random();
//		int randomTime = random.nextInt(maxTime - minTime) + minTime;
//		System.out.println("Random time selected " + randomTime + " millisecond");
//		
		driver.findElement(By.xpath("//a[@id=\"startButton\"]")).click();
		System.out.println("Start Tea Break clicked Successfully");
//		Thread.sleep(randomTime);
//		System.out.println("Waiting"); 
//		
//		driver.findElement(By.xpath("//a[@id=\"stopButton\"]")).click();
//		System.out.println("Stop button clicked Successfully");
				
	}

}
