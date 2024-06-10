package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {

	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a website
	        driver.get("https://www.google.com");

	        // Perform any required actions or assertions
	        System.out.println("Title: " + driver.getTitle());

	        // Close the browser
	        driver.quit();
	    }
	}

