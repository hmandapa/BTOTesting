package ShoppingCartAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		int count = 1;
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(2000);
		count++;
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		count++;
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		count++;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		// verify the count in the cart
		WebElement cartcount = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		
		int itemCount = Integer.parseInt(cartcount.getText());
		// verify the count in the car
		if (count == itemCount) {
			System.out.println("items add to the cart=" + itemCount);
		} else {
			System.out.println("Failed to add items to the cart.");
		}

		// Remove items from the cart (e.g., remove the first product)
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		count--;
		driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(2000);
		count--;
		// Verify the updated number in the cart (should be 1 in this example)
		WebElement cartCount = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Thread.sleep(2000);
		itemCount = Integer.parseInt(cartCount.getText());	
		// verify the count in the car
				if (count == itemCount) {
					System.out.println("items in the cart=" + itemCount);
				} else {
					System.out.println("Failed to remove items form the cart.");
				}

		driver.quit();

	}
}
