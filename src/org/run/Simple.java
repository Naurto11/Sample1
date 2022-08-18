package org.run;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Simple {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Sample1\\src\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement cancelbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		cancelbtn.click();

		Actions a=new Actions(driver);
		
		WebElement movetocourse = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		a.moveToElement(movetocourse).perform();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		Robot r= new Robot();
		
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		
		js.executeScript("arguments[0].setAttribute('value','laptop')", txtuser);
		
		WebElement srchbtn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
//		js.executeScript("arguments[0].click", srchbtn);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
