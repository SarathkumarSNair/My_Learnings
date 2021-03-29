import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
System.out.println(driver.findElements(By.tagName("a")).size());
WebElement footerdriver = driver.findElement(By.id("navFooter"));
System.out.println(footerdriver.findElements(By.tagName("a")).size());
WebElement merchandise= driver.findElement(By.id("merchandised-content"));
System.out.println(merchandise.findElements(By.tagName("a")).size());
}
}