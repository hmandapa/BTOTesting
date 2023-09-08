
package Task;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class sceanrio1 {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the WebDriver

		WebDriver driver = new ChromeDriver();

		// Navigate to the webpage

		driver.get("https://www.bostonscientific.com/en-IN/products/accessories/cellebrity.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Accept'])[1]")).click();

		// click on products
		// driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();

		// click on Accessories
		driver.findElement(By.xpath("(//a[text()=\"Accessories \"])[2]")).click();

		// click on Cytology Brushes

		driver.findElement(By.xpath("//a[contains(text(),'Cytology Brushes')]")).click();

		// Find the breadcrumb element

		WebElement breadcrumbElement = driver.findElement(By.xpath("//section[@class='row bsc-breadcrumb']"));

		// Get the text from the breadcrumb element

		String breadcrumbText = breadcrumbElement.getText();

		System.out.println(breadcrumbText);

		// Specify the expected breadcrumb text

		String expectedBreadcrumb = "Products Accessories Cellebrityᵀᴹ";

		// Check if the breadcrumb contains the expected text in the same order

		boolean breadcrumbContainsExpectedText = breadcrumbText.equals(expectedBreadcrumb);

		// Print the result

		if (breadcrumbContainsExpectedText) {

			System.out.println("Breadcrumbs contain the expected text in the same order.");

		} else {
			System.out.println("Breadcrumbs do not contain the expected text in the same order.");

		}
	}

}
