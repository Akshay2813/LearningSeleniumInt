package com.learning;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class L_01_launchBroswer {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		
	}

}
