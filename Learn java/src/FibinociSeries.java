
public class FibinociSeries {

	public static void main(String[]args)
	{
		int i=0;
	    int j=1;
	   int k;
	   int S;
	   int  count=10;
	   System.out.println(i+""+j);
	   for (S=2;S<10;++S) {
		   k=i+j;
		  
		   System.out.println(""+k);
		   i=j;
		   j=k;
	   }
	    
	}	
}
