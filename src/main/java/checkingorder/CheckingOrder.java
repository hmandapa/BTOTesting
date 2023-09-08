package checkingorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CheckingOrder {
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Navigate to the website
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		Thread.sleep(2000);

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

		Select option = new Select(dropdown);

		option.selectByVisibleText("Name (A to Z)");

		Thread.sleep(3000);

		// Find and collect all elements with a specific class name
		List<WebElement> productElements = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		// Create an ArrayList of product names (in ascending order)
		List<String> productNames = new ArrayList<>();
		
		// add the product names in the list

		for (WebElement productElement : productElements) {
			String productName = productElement.getText();
			productNames.add(productName);
			System.out.println(productNames);
		}
		// Sort in descending order (Z to A)
		Select option1 = new Select(dropdown);
		option1.selectByVisibleText("Name (Z to A)");
		Thread.sleep(3000);

		// Find and collect all elements with a specific class name
		List<WebElement> productElements1 = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		// Create an ArrayList of product names (in descending order)
		List<String> productNames1 = new ArrayList<>();

		// Collect product names in descending order
		for (WebElement productElement : productElements1) {
			String productName = productElement.getText();
			productNames1.add(productName);
			System.out.println(productNames1);
		}

		}	
	}	

