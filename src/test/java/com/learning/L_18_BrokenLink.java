package com.learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class L_18_BrokenLink {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		
//		http://www.deadlinkcity.com/
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		for(WebElement element : allLinks)
		{
			String url =element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("Empty link");
				continue;
			}
			try
			{
				URL link= new URL(url);
				
				HttpURLConnection httpCon = (HttpURLConnection) link.openConnection();
				
				httpCon.connect();
				if(httpCon.getResponseCode()>=400)
				{
					System.out.println("Broken link");
				}
				else
				{
					System.out.println("Normal link");
				}
			}
			catch(IOException e)
			{
				System.out.print(e.getMessage());
			}
			catch (Exception e)
			{
				System.out.print(e.getMessage());

			}
		}
		
		
		
	}

}
