import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// create a file which ends with the name.propertiese and to call the data using properties class 
// create an object for it
public class GlobalValueDrive {
	public static void main(String[]args) throws IOException {
Properties Prop = new Properties();
FileInputStream File= new FileInputStream("C:\\Users\\saratnai\\eclipse-workspace\\Learn java\\src\\Data.properties");
Prop.load(File);
System.out.println(Prop.getProperty("browser"));
System.out.println(Prop.getProperty("url"));
Prop.setProperty("browser", "firefox"); // change the data which is already exist
System.out.println(Prop.getProperty("browser"));// value can be chnaged but it is not stored
FileOutputStream Fi=new FileOutputStream("C:\\Users\\saratnai\\eclipse-workspace\\Learn java\\src\\Data.properties");
Prop.store(Fi, null);
Prop.setProperty("name", "8am");
	}	
}

