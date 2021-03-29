
public class MissingNum {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,6,7};
		int totalnum =7;
		int expectedNum = totalnum *((totalnum+1)/2);
		int num=0;
		for(int i:a) {
		num +=i;	
		}
	System.out.println(expectedNum - num);
	System.out.println("\n");
	}
	

}
