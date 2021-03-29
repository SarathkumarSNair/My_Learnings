import javax.xml.transform.Templates;

public class SortDes {

	public static void main(String[] args) {
	int temp =0;
     int [] a= new int[] {5,10,7,20,30};
     for (int i=0;i<a.length;i++) {
    	 for(int j=1+i;j<a.length;j++) {
    		 if(a[i]>a[j]) {
    			temp = a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		 } 
    	}
     }
     System.out.println();
     for(int i=0;i<a.length;i++) {
    	 System.out.println(a[i] +"");
     }
}
}
