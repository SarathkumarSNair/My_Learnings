package LearningMaven.MvnTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITest {
	
	@BeforeTest
	public void extendreport() {
		ExtendSparkReporter reporter = new ExtendSparkReporter();
		
	}

	@Test
	public void Rest() {
		System.out.println("Get");
	}
	
	@Test
	public void Postman() {
		System.out.println("HTTP");
	}
	
	
	
	
}
