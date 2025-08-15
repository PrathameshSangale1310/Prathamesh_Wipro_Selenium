package Swag_labs_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_labs {
	static WebDriver driver;

	public static void login() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("user-name"));
		login.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		
		
		driver.findElement(By.id("login-button")).click();

	}
	
	public static void addtocart() {
		
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	}
	
	
	public static void checkout() throws InterruptedException {
		
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("CHECKOUT")).click();
		
		WebElement fname = driver.findElement(By.id("first-name"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("last-name"));
		lname.sendKeys("xyz");
		
		WebElement zip = driver.findElement(By.id("postal-code"));
		zip.sendKeys("100000");
		
		WebElement cont = driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
		cont.click();
		
		driver.findElement(By.linkText("FINISH")).click();
				
				
	}
	
	
	public static void logout() {
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		
		WebElement logout_but = driver.findElement(By.id("logout_sidebar_link"));
		logout_but.click();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		login();
		addtocart();
		checkout();
		logout();
		

	}

}
