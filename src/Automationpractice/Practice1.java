package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		//Add to cart
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		//add to cart 2
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		Thread.sleep(3000);
		//view cart
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(3000);
		//Checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		//First name
		driver.findElement(By.name("firstName")).sendKeys("Navi");
		//Last name
		driver.findElement(By.name("lastName")).sendKeys("kothapally");
		//pincode
		driver.findElement(By.name("postalCode")).sendKeys("500080");
		//continue
		driver.findElement(By.name("continue")).click();
		//finish
		driver.findElement(By.name("finish")).click();
		Thread.sleep(3000);
		//Back to home
		driver.findElement(By.name("back-to-products")).click();
		//menu
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(3000);
		//logout
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		
	}

}
