package day20_Assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Combined {

		    public static void main(String[] args) throws InterruptedException {
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://demoqa.com/buttons");
		        Thread.sleep(2000);

		        Actions act = new Actions(driver);

		        WebElement double_click = driver.findElement(By.id("doubleClickBtn"));
		        act.doubleClick(double_click).perform();
		        Thread.sleep(1000);

		        WebElement right_click = driver.findElement(By.id("rightClickBtn"));
		        act.contextClick(right_click).perform();
		        Thread.sleep(1000);

		        WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
		        act.click(clickme).perform();
		        Thread.sleep(2000);

		        driver.get("https://demoqa.com/select-menu");
		        Thread.sleep(2000);

		        WebElement oldSelect = driver.findElement(By.id("oldSelectMenu"));
		        Select select = new Select(oldSelect);
		        select.selectByVisibleText("Blue");
		        Thread.sleep(1000);

		        String[] colors = {"Green", "Blue", "Black"};
		        WebElement colorInput = driver.findElement(By.id("react-select-4-input"));
		        for (String c : colors) {
		            colorInput.sendKeys(c);
		            colorInput.sendKeys(Keys.ENTER);
		            Thread.sleep(500);
		        }

		        driver.get("https://demoqa.com/alerts");
		        Thread.sleep(2000);

		        driver.findElement(By.id("alertButton")).click();
		        Alert alert = driver.switchTo().alert();
		        alert.accept();

		        driver.findElement(By.id("timerAlertButton")).click();
		        Thread.sleep(7000);
		        driver.switchTo().alert().accept();

		        driver.findElement(By.id("confirmButton")).click();
		        Alert confirmAlert = driver.switchTo().alert();
		        confirmAlert.dismiss();

		        driver.findElement(By.id("promtButton")).click();
		        Alert promptAlert = driver.switchTo().alert();
		        promptAlert.sendKeys("Hello from Selenium!");
		        promptAlert.accept();

		    }
	}
