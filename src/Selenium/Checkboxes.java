package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		List<WebElement> CHK=driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(CHK.size());
		for(int i=0;i<CHK.size();i++) {
			CHK.get(i).click();

		}

		

	}

}
