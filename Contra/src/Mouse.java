import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		Actions a= new Actions(driver);
		WebElement move= driver.findElement(By.id("nav-link-accountList"));  //created a webelement
		a.moveToElement(move).build().perform(); //mouse movement 
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("phone").doubleClick().build().perform(); //mouse click on search bar and add and select
		 //a.moveToElement(move).contextClick().build().perform(); //right click
		
		
		
		
		
		
	}
	

}
