import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sele {
	public static void main (String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.in/");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
		
		driver.get("https://www.google.in/");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils
		}
	}
