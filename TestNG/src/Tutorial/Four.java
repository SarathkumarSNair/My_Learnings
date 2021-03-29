package Tutorial;

import org.testng.annotations.Test;

public class Four {
	@Test
	public  void test4(){
		System.out.println("black");
	}
	@Test(timeOut=2000)
	public  void X2est5(){
		System.out.println("silver");
	}
	
		@Test
		public  void Xest5(){
			System.out.println("white");
		}
		@Test(dependsOnMethods= {"test4","test6"})
		public  void test31(){
			System.out.println("brick");
		}
		//enabled is used to skip the 
		@Test(enabled=false)
		public  void test32(){
			System.out.println("orange");
		}

		
		@Test(groups ={"smoke"})
			public  void test6(){
				System.out.println("pink");
			}
}
