package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/insurance/v1/register.php");
	driver.manage().window().maximize();
	Select title=new Select(driver.findElement(By.name("title")));
	//By Index
	title.selectByIndex(4);
	Select licence = new Select(driver.findElement(By.id("user_licenceperiod")));
	//By Index
	licence.selectByIndex(3);
	//for first name
	driver.findElement(By.name("firstname")).sendKeys("naveen");
	//surname
	driver.findElement(By.name("lastname")).sendKeys("Kothapally");
	//mobile
	driver.findElement(By.name("phone")).sendKeys("9100351347");
	//year
	Select yearSelect= new Select(driver.findElement(By.name("year")));
	yearSelect.selectByIndex(4);
	//month
	Select monthSelect= new Select(driver.findElement(By.name("month")));
	monthSelect.selectByIndex(8);
	//date
	Select dateSelect= new Select(driver.findElement(By.name("date")));
	dateSelect.selectByIndex(14);
	//occupation
	Select occupation = new Select(driver.findElement(By.name("occupation")));
	occupation.selectByIndex(5);
	//Street
	driver.findElement(By.name("street")).sendKeys("bustand");
	//city
	driver.findElement(By.name("city")).sendKeys("hyderabad");
	//country
	driver.findElement(By.name("county")).sendKeys("India");
	//post code
	driver.findElement(By.name("post_code")).sendKeys("504201");
	//email
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	//password
	driver.findElement(By.name("password")).sendKeys("abc1234");
	//confirm password
	driver.findElement(By.name("c_password")).sendKeys("abc1234");
	driver.findElement(By.name("submit")).click();
	
	
	//email
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	//password
	driver.findElement(By.name("password")).sendKeys("abc1234");
	driver.findElement(By.name("submit")).click();
	

	}

}
