
public class booleanOpeartors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=20.00;
		double b=80.00;
		double c= (a+b)*100;
		System.out.println("c=" + c);
		double remainder=c%40;
		System.out.println("remainder=" + remainder);
	boolean d=(remainder==0) ?true:false;
	System.out.println("The number is zero=" + d);
		if(!d) {
		System.out.println("the number is not zero");
		}
		
	}

}
