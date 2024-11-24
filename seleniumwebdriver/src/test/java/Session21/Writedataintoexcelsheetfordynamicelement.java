//Writing dynamic data into excel sheet 
package Session21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedataintoexcelsheetfordynamicelement {

	public static void main(String[] args) throws IOException {
//Hierarchy --> Excel File ->> Workbook --> Sheets --> Rows -->Cells
		
//		here we are creating excel file using automation 
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test data\\2");

		//create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create sheet
		 XSSFSheet sheet =workbook.createSheet("dynamicdata");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter how many number of rows");
		 int noOfrows= sc.nextInt();
		 
		 System.out.println("Enter number of cells");
		 int noofcells= sc.nextInt();
		 
		 for(int r=0; r<noOfrows; r++) //represtng rows
		 {
			XSSFRow Currentrow=  sheet.createRow(r);
			 for(int c=0; c<noofcells; c++) //representing cells 
			 {
			XSSFCell	cell=  Currentrow.createCell(c);
			cell.setCellValue(sc.next());
			
				 
				 
			 }
		 }
			workbook.write(file); // attach workbook to file 
			workbook.close();
			System.out.println("File is created");

	}

}
