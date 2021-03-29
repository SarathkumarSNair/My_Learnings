package LearningMaven.MvnTutorial;

import org.testng.annotations.Test;

public class SelniumTest {

	@Test
	public void webautomation() {
		System.out.println("Amazon");
	}
	
	@Test
	public void Elemet() {
		System.out.println("Google");
	}
}
//Maven project test files class name shoud end with "Test" or else it wont execute by maven
// to run single test -mvn -Dtest=TestCircle test  - provide the testcase name in testcircle
// in order to change the xml file used for multiple testing purposes like regression ,smoke
// create a profile in pom and copy the build and add it to the profile
//given id
// mvn test -P(profile name)
// artifact id is project name