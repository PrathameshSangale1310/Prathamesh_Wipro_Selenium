package day20_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertq1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");

		
		WebElement firstalert = driver.findElement(By.id("alertButton"));
		firstalert.click();
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		WebElement timealert = driver.findElement(By.id("timerAlertButton"));
		timealert.click();
		Thread.sleep(7000);
		Alert alert12 = driver.switchTo().alert();
		alert12.accept();
		
		Thread.sleep(3000);
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Thread.sleep(4000);
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		Thread.sleep(3000);
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(4000);
		Alert alert11 = driver.switchTo().alert();
		alert11.sendKeys("Hello");
		alert11.accept();
		

	}

}
