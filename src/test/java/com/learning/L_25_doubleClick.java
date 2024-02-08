package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class L_25_doubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--disable-notifications"); 
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver(options);
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Akshay");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		
		
	}

}
