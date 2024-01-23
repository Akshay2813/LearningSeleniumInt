package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class L_03_isDisplayedIsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement w = driver.findElement(By.xpath("//input[@name='email']"));
		
		System.out.print(w.isDisplayed());
		System.out.print(w.isEnabled());
		System.out.print(w.isSelected());

	}

}
