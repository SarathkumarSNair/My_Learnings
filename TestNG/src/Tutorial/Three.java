package Tutorial;

import org.testng.annotations.Test;

public class Three {

	@Test
	public  void test7(){
		System.out.println("peace");
	}
	
	@Test(groups ={"smoke"})
		public  void test8(){
			System.out.println("Canada");
		}
		
			@Test
			public  void test9(){
				System.out.println("Job");
			}
}
