package Amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skillcert.aka.amazon.com/itemgroup/application/search.html");
		driver.findElement(By.id("user_name_field")).sendKeys("saratnai");
		driver.findElement(By.id("user_name_btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password_field")).sendKeys("Tesla@12");
		driver.findElement(By.id("password_btn")).click();
		Thread.sleep(10000);
		 System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("searchString")).sendKeys("2242753252");
		driver.findElement(By.id("basicSearchButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"title\"]/tbody/tr/td[1]/a")).click();
		Thread.sleep(5000);
		

	}

}
