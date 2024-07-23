package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		//First name
		driver.findElement(By.name("customer.firstName")).sendKeys("Navi");
		Thread.sleep(3000);
		//Last name
		driver.findElement(By.name("customer.lastName")).sendKeys("Kothapally");
		driver.findElement(By.name("customer.address.street")).sendKeys("Nirmal");
		driver.findElement(By.name("customer.address.city")).sendKeys("Nirmal");
		driver.findElement(By.name("customer.address.state")).sendKeys("Telangana");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("504203");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.name("customer.username")).sendKeys("Navi");
		driver.findElement(By.name("customer.password")).sendKeys("1234567890");
		driver.findElement(By.name("repeatedPassword")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		//Login
		driver.findElement(By.name("username")).sendKeys("Navi");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Thread.sleep(4000);
		//Logout
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

	}

}
