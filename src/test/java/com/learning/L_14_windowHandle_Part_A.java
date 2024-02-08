package com.learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class L_14_windowHandle_Part_A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();

        // Disable notifications
        edgeOptions.addArguments("--disable-notifications");
        
        edgeOptions.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("tabButton")).click();
	
		Set<String> windowID = driver.getWindowHandles();
	
		Iterator<String> it  = windowID.iterator();
		
		String parentID= it.next();
		String childID=it.next();
//		
		Thread.sleep(5);
		driver.switchTo().window(childID);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		Thread.sleep(5);
		driver.switchTo().window(parentID);
		Thread.sleep(5);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(5);
		Set<String> windowID_1 = driver.getWindowHandles();
		
		Iterator<String> it_1  = windowID_1.iterator();
		
		String parentID_1= it_1.next();
		String childID_1=it_1.next();
		
		driver.switchTo().window(childID_1);
//		System.out.print(childID_1);
		String text_1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text_1);
		
		driver.switchTo().window(parentID_1);
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> windowID_2 = driver.getWindowHandles();
		
		Iterator<String> it_2  = windowID_2.iterator();
		
		String parentID_2= it_2.next();
		String childID_2=it_2.next();
		
		
		driver.switchTo().window(childID_2);
		
		System.out.println(driver.getCurrentUrl());
		
		String text_3 = driver.findElement(By.tagName("body")).getText();
		
		System.out.println(text_3);
		
		
		

	}

}
