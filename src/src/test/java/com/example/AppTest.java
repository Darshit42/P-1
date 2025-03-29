package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class set_1 {
	WebDriver driver;
	
	@Test(priority=1)
	public void open() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("https://linkedin.com/");
		
		String xpath ="/html/body/main/section[1]/div/div/a";
//				/html/body/div[7]/header/div/nav/ul/li[6]/div/button/span;
				
		WebElement element;
		element = driver.findElement(By.xpath(xpath));
		element.click();
		
		xpath="//*[@id=\"username\"]";
		element = driver.findElement(By.xpath(xpath));
		element.sendKeys("darshit02736@gmail.com");
		
		xpath="/html/body/div/main/div[3]/div[1]/form/div[2]/input";
		element = driver.findElement(By.xpath(xpath));
		element.sendKeys("Darshit,01");
	
		xpath="/html/body/div/main/div[3]/div[1]/form/div[4]/button";
		element = driver.findElement(By.xpath(xpath));
		element.click();
		
		xpath="//*[@id=\"ember17\"]/span";
		element = driver.findElement(By.xpath(xpath));
		element.click();
		
		
		xpath="/html/body/div[7]/header/div/nav/ul/li[6]/div/div/div/ul/li[1]/ul/li[2]/a\r\n"
				+ "	";
		element = driver.findElement(By.xpath(xpath));
		element.click();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void test1() throws InterruptedException {

		WebElement element;
		String xpath ="/html/body/div[8]/div/div/div[1]/div/section/div";
		element = driver.findElement(By.xpath(xpath));
		boolean result = element.isDisplayed();
		
		Assert.assertEquals(result, true);
		Thread.sleep(1000);

	}
	
	
	@Test(priority=3)
	public void test2() throws InterruptedException {
		WebElement element;
		String xpath ="/html/body/div[8]/div/div/main/section/div/ul/li[3]/ul/li[5]/a/section";
		element = driver.findElement(By.xpath(xpath));
		boolean result = element.isDisplayed();
		
		Assert.assertEquals(result, false);
		Thread.sleep(1000);
	}
	@Test(priority=4)
	public void test3() throws InterruptedException {
		WebElement element;
		String xpath ="/html/body/div[8]/div/div/main/section/div/ul/li[3]/div/h2";
		element = driver.findElement(By.xpath(xpath));
		boolean result = element.isDisplayed();
		
		Assert.assertEquals(result, true);
		Thread.sleep(1000);

	}
	@Test(priority=5)
	public void test4() throws InterruptedException {
		WebElement element;
		String xpath ="/html/body/div[8]/div/div/main/section/div/ul/li[3]/div/h2";
		element = driver.findElement(By.xpath(xpath));
		boolean result = element.isDisplayed();
		
		Assert.assertEquals(result, false);
		Thread.sleep(1000);
	}
	@Test(priority=6)
	public void test5() throws InterruptedException {
		WebElement element;
		String xpath ="/html/body/div[8]/div/div/main/section/div/ul/li[3]/ul/li[5]/a/section";
		element = driver.findElement(By.xpath(xpath));
		boolean result = element.isDisplayed();
		
		Assert.assertEquals(result, true);
		Thread.sleep(1000);
	}
	
	
	
	
}
