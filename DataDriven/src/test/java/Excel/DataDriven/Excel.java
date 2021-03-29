package Excel.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//get cases to excel file and sheet
		FileInputStream Excel= new FileInputStream("C:\\File for testing\\Dataddriven.xlsx");
        XSSFWorkbook xdatas= new XSSFWorkbook(Excel);
        int sheetnumber=xdatas.getNumberOfSheets();
        for(int i=0;i<=sheetnumber;i++) {
        	if(xdatas.getSheetName(i).equalsIgnoreCase("sheet1")) {
        		XSSFSheet sheet=xdatas.getSheetAt(i);
        	}
        }
        
        //now to track the cell row and coloumn for the particular tc
	}

}
