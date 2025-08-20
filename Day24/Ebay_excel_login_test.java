package Testng_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ebay_excel_login_test {
	    @Test
	    @Parameters({"username","password"})
	    public void testLogin(String username,String password) throws InterruptedException {
	    	
	    	System.out.println("username :"+username+" | password :"+password);
	    	 WebDriver driver=new ChromeDriver();
	    	 driver.get("https://www.ebay.com/");
	    	 WebElement login=driver.findElement(By.cssSelector("span>a[_sp=\"m570.l1524\"]"));
	   	  	 login.click();
	    	 driver.manage().window().maximize();
	    	 
	    	 driver.findElement(By.cssSelector("div>input[id=\"userid\"]")).click();
	    	 driver.findElement(By.cssSelector("div>input[id=\"userid\"]")).sendKeys(username);
	    	 driver.findElement(By.id("signin-continue-btn")).click();
	    	 Thread.sleep(1000);
	    	 driver.findElement(By.cssSelector("div>input[id=\"pass\"]")).click();
	    	 driver.findElement(By.cssSelector("div>input[id=\"pass\"]")).sendKeys(password);
	    	 driver.findElement(By.id("sgnBt")).click();
	    	 driver.close();
	    }
}
