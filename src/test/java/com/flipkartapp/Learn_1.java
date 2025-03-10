package com.flipkartapp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Learn_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver = new EdgeDriver(options);
		
		//Open URL
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		List<WebElement> mobileNameList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> mobileNamesSection =  driver.findElements(By.xpath("//div[@class='_3pLy-c row']/div[1]"));
		
//		List<WebElement> priceSection =  driver.findElements(By.xpath("//div[@class='_3pLy-c row']/div[2]"));

		
//		for(WebElement name: mobileNamesSection)
//		{
//			WebElement mobileName = name.findElement(By.xpath("//div[@class='_4rR01T']"));
//			
//			String text=mobileName.getText();
//			System.out.println(text);
//		}
//		
//		for(WebElement mobPrice: priceSection)
//		{
//			WebElement price = mobPrice.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//			
//			String text=mobPrice.getText();
//			System.out.println(text);
//		}
		
//		for(WebElement name: mobileNamesSection)
//		{
//			WebElement mobileName = name.findElement(By.xpath("//div[@class='_4rR01T']"));
////			WebElement price = name.findElement(By.xpath("/following-sibling::div"));
//			
//			
//			WebElement p=  name.findElement(By.xpath("/following-sibling::div"));
//			
//			String price = p.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
//			
//			
//
//			
//			String text=mobileName.getText();
//
//			System.out.println(text +"  " + price);
//		}
		
		//div[@class='_3pLy-c row']/div[1]/following-sibling::div
		
		//div[@class='_3pLy-c row']/div[1]/following-sibling::div/div/div/div[1]
		
		List<WebElement> mobileElements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		// Find corresponding price elements
		List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		// Printing mobile names and prices
		for (int i = 0; i < mobileElements.size(); i++) {
		    String mobileName = mobileElements.get(i).getText();
		    String price = priceElements.get(i).getText();
		    System.out.println(mobileName + " " + price);
		}

}
}