package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage1 {
	public WebDriver driver;
	By skills= By.id("iApps");
	
	public LandingPage1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getSkills() {
		return driver.findElement(skills);
	}

}
