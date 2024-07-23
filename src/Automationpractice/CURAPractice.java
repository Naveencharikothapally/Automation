package Automationpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CURAPractice {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		//appointment
		driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]")).click();
		//login
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.xpath("//*[@id=\"btn-login\"]")).click();
		//drop down
		Select title= new Select(driver.findElement(By.xpath("//*[@id=\"combo_facility\"]")));
		title.selectByIndex(2);
		//check box
		driver.findElement(By.id("chk_hospotal_readmission")).click();
		//radio button
		driver.findElement(By.id("radio_program_medicaid")).click();
		//calendar date picker
		driver.findElement(By.id("txt_visit_date")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div")));
		
		String aMonth =driver.findElement(By.className("datepicker-switch")).getText();
		String aYear =driver.findElement(By.className("datepicker-switch")).getText();
		
		while(!(aMonth.equals("September") && aYear.equals("2024")))
		{
		   driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[2]/th[3]")).click();
		   aMonth =driver.findElement(By.className("datepicker-switch")).getText();
		   aYear =driver.findElement(By.className("datepicker-switch")).getText();
		}
		  driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[2]")).click();



	}

}

