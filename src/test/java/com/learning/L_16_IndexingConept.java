package com.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class L_16_IndexingConept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//div[@id='radio-btn-example']/fieldset/label[3]
		int total = driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label")).size();
		
		for(int i=1; i<=total; i++)
		{
			String text = driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label["+i+"]")).getText();
			System.out.println(text);
		}
		

	}

}
