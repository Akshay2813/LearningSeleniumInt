package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class L_22_wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe" );

		WebDriver driver = new EdgeDriver();
		
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 //Explicit wait
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		 
		 driver.get("");
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a[@role='button']")));
		 
		 
		 
		
	}

}
