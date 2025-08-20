package Testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_execution_dependency {
WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
	  }
	
	
  @Test
  public void login() throws InterruptedException {
	  WebElement login=driver.findElement(By.cssSelector("span>a[_sp=\"m570.l1524\"]"));
	  login.click();
	  
	  
			  
	  WebElement username=driver.findElement(By.cssSelector("div>input[id=\"userid\"]"));
	  username.sendKeys("prath-32");
	  
	  WebElement cont=driver.findElement(By.id("signin-continue-btn"));
	  cont.click();
	  Thread.sleep(3000);;
	  
	  WebElement pass=driver.findElement(By.cssSelector("div>input[id=\"pass\"]"));
	  pass.sendKeys("Prathamesh13");
	  
	 driver.findElement(By.id("sgnBt")).click();
	  
  }
  
  
  
  @Test
  public void search() throws InterruptedException {
	  String [] searches = {"Watch","Phone","Bag"};
		
		for(String s : searches)
		{
			WebElement sea = driver.findElement(By.id("gh-ac"));
			sea.clear(); 
			sea.sendKeys(s);
			sea.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
	
  }
  @Test(dependsOnMethods= {"search"})
  public void addtocart() throws InterruptedException
  {
	  WebElement search = driver.findElement(By.id("gh-ac"));
	  search.click();
	  search.sendKeys("adidas men Hoops 4.0 Shoes");
	  search.sendKeys(Keys.ENTER);
	  String newurl = driver.getWindowHandle();
	  
	  
	  
	  Thread.sleep(4000); 
	  driver.findElement(By.partialLinkText("Adidas men Hoops 4.0 Shoes - Size 10")).click();
	 
	  
	  for (String window : driver.getWindowHandles()) {
	        if (!window.equals(newurl)) {
	            driver.switchTo().window(window);
	            break;
	        }
	    }

	  
	  driver.findElement(By.id("atcBtn_btn_1")).click();
	  Thread.sleep(3000);
	  
	
	  
	  WebElement close = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[5]/ul/li[2]/div[1]/div/div[2]/div[2]/button"));
	  close.click();
	  
  }
  
  @Test(dependsOnMethods= {"addtocart"})
  public void removecart() {
	  WebElement icon = driver.findElement(By.className("gh-cart__icon"));
	  icon.click();
	  
	
	  
	  WebElement remove = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[1]/div[1]/div/ul/li/div/div/div/div[2]/span[2]/button"));
	  remove.click();
  }
  
  @Test(invocationCount = 2)
  
  public void shopbycategory() {
	  WebElement sbc = driver.findElement(By.cssSelector("div>button[aria-controls=\"s0-1-4-12-0-1-dialog\"]"));
	  sbc.click();
	  
	  WebElement men = driver.findElement(By.cssSelector("div>a[href=\"https://www.ebay.com/b/Men/260012/bn_7116419459\"]"));
	  men.click();
  }
  
  @Test
  public void rightclicks() throws InterruptedException {
	  WebElement search = driver.findElement(By.id("gh-ac"));
	  search.click();
	  search.sendKeys("New - Adidas men Grand Court Alpha Shoes (Size 12)");
	  search.sendKeys(Keys.ENTER);
	  
	  
	  Thread.sleep(4000); 
	  Actions act = new Actions(driver);
	  WebElement right_click = driver.findElement(By.partialLinkText("New - Adidas men Grand Court Alpha Shoes (Size 12)"));
	  act.contextClick(right_click).perform();
	  
  }
  
  
  @Test
  public void shopallcat() {
	  WebElement sball = driver.findElement(By.className("gh-search-categories"));
	  sball.click();
	  
	  WebElement baby = driver.findElement(By.cssSelector("select>option[value=\"2984\"]"));
	  baby.click();
	  
	  driver.findElement(By.className("gh-search-button__label")).click();
  }
  
//  @Test
//  public void change_lang() {
//	  WebElement lan = driver.findElement(By.className("gf-flag__button"));
//	  lan.click();
//	  lan.click();
//	  
//	  WebElement au = driver.findElement(By.linkText("Australia"));
//	  au.click();
//  }
  
  
//  @Test
//  public void logout() {
//	  WebElement log = driver.findElement(By.className("gh-identity__greeting"));
//	  log.click();
//
//	  
////	  WebElement au = driver.findElement(By.linkText("Australia"));
////	  au.click();
//  }
  
  
  
  

  @AfterTest
  public void afterTest() {
	  Assert.assertTrue(true,"Signin button is not working");
//	  driver.close();
  }
}
