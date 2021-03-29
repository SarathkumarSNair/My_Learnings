import java.awt.ItemSelectable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageTypeSpecifier;

import org.omg.CORBA.portable.ValueInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Ecom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver. manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); - implicit wait apllied globally
	WebDriverWait a= new WebDriverWait(driver, 5);    //class is defined for explicit wait object a and can place where needed a.until
		String[] item = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver,item);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
	
	public static void addItems(WebDriver driver, String[] item) {
		int j = 0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++) {

	   String[] name=product.get(i).getText().split("-");
	   String Formattedname = name[0].trim();
	 //  brocoli - ikg spli ItemSelectable to ValueInputStream using Split 
	   // split the actual name from given name (text) using split
	   // a=inorder to remove space use trim()
	   //convert arry to array list (takes less memory and complicated scenario)
	   List itemsNeededList = Arrays.asList(item);
	   if(itemsNeededList.contains(Formattedname)) {
		   j++;
		   driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		  
		   if(j==item.length)
		   {
			   break;
		   }
	   }
	
	}

	}
	}
