package Excel.DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.commons.collections4.functors.IfClosure;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ATM {

	public static ArrayList<String> getData()  throws IOException {
		ArrayList<String> a=new ArrayList<String>();
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the pin");
		int Pincode=sca.nextInt();
	  FileInputStream Excel = new FileInputStream("C:\\File for testing\\Dataddriven.xlsx");
	  XSSFWorkbook data = new XSSFWorkbook(Excel);
	  int Sheetnumber=data.getNumberOfSheets();
	 for(int i=0;i<=Sheetnumber;i++) {
		 if(data.getSheetName(i).equalsIgnoreCase("sheet4")) {
			XSSFSheet sheet= data.getSheetAt(i); 
			Iterator<Row> rows = sheet.iterator();
			Row firstrow= rows.next();
			Iterator<Cell> cells = firstrow.cellIterator();
			int k =0;
			int Coloumn =0;
			while(cells.hasNext()) {
				Cell Value= cells.next();
			if(Value.getStringCellValue().equalsIgnoreCase("Pin"))	
			{
				Coloumn =k;
			}
			k++;
			
			
		 }
			System.out.println(Coloumn);
			 // to identify the element from excel coloumn
			 while(rows.hasNext()) {
				 Row r =rows.next();
				 if(r.getCell(Coloumn).getNumericCellValue()==Pincode) {
					 Iterator<Cell> cv =r.cellIterator();
					 while(cv.hasNext()) {
						 Cell c= cv.next();
						 if(c.getCellTypeEnum()==CellType.NUMERIC) {
							 a.add(c.getStringCellValue());
							 }
						 else {
							 a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						 }
						 }
					 
						 
					 
				 }
			 }
	 }
		 }
	 return a;
	}
	public static void main(String[]args) throws IOException {
		getData();
	}
	
}

