package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class L_28_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		driver.get("https://demo.opencart.com/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(desktop).build().perform();

	}

}
