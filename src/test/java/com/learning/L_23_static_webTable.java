package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class L_23_static_webTable {

	//In General below tag structure for table
	/*
	  <table>
	  		<thead>
	  			<tr> tableRow
	  			  <th> heading 1
	  			  <th> heading 2
	  		<tbody>
  		       <tr>  Row 1 </tr>
  		       		<td>  data1 </td>
  		       		<td>  data2 </td>
  		       <tr>  Row  2
  		       		<td> 
  		       		<td>
  		       		
  		       		
	
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//https://www.rahulshettyacademy.com/AutomationPractice/
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe" );

		WebDriver driver = new EdgeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		//for practise we are any 5 vegatable
		for(int i=0;i<5;i++)
		{
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		int totalCol= driver.findElements(By.xpath("//table[@class='cartTable']/thead/tr/td")).size();
		
		int totalRow =driver.findElements(By.xpath("//table[@class='cartTable']/tbody/tr")).size();
		
		//table[@class='cartTable']/tbody/tr[1]/td[1]
		
		//print specific element
		String specificVal = driver.findElement(By.xpath("//table[@class='cartTable']/tbody/tr[1]/td[2]")).getText();
		System.out.println(specificVal);
		
		//print all data
		System.out.println("totalRow= "+totalRow);
		System.out.println("totalCol= "+totalCol);
		for(int row=1; row<=totalRow;row++)
		{
			for(int col=1;col<=totalCol;col++)
			{
				String val = driver.findElement(By.xpath("//table[@class='cartTable']/tbody/tr["+row+"]/td["+col+"]")).getText();
				System.out.print(val + " ");	
			}
			System.out.println();
		}
		
			
			
		
		
		
		
		
		

	}

}
