package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class L_19_JavaScritAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Akshay");
		
		
		driver.findElement(By.id("alertbtn")).click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().accept();
		
		//=================================================
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ajay");
		driver.findElement(By.id("confirmbtn")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		//=================================================
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sunny");
		driver.findElement(By.id("confirmbtn")).click();
		String text3 = driver.switchTo().alert().getText();
		System.out.println(text3);
		driver.switchTo().alert().dismiss();

	}

}
