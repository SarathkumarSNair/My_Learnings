package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {

	public WebDriver driver;
	
	By email = By.id("ap_email");
	By password =By.id("ap_password");
	By loginButton = By.id("signInSubmit");
	
	public LoginPage1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
}
