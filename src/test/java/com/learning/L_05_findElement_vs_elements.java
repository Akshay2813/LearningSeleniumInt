package com.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class L_05_findElement_vs_elements {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='products']/div"));
		
		System.out.print(productList.size());
	}

}
