//Write data into excel sheet ***************************************************
package Session21;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RWritedataintoexcel {

	public static void main(String[] args) throws IOException {
	
//		Hierarchy --> Excel File ->> Workbook --> Sheets --> Rows -->Cells
		
//		here we are creating excel file using automation 
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test data\\Excel2.xlsx");

		//create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create sheet
		 XSSFSheet sheet =workbook.createSheet("data");
		 
		//create row 
		XSSFRow row1 = sheet.createRow(0); // created one row 
		
		//create multiple cell in row1
		row1.createCell(0).setCellValue("Welcome java");
		row1.createCell(1).setCellValue("1234"); 
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("thanks");
		row2.createCell(1).setCellValue("567"); 
		row2.createCell(2).setCellValue("py");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("test");
		row3.createCell(1).setCellValue("test"); 
		row3.createCell(2).setCellValue("tr");
		
		workbook.write(file); // attach workbook to file 
		workbook.close();
		System.out.println("File is created");
	
	}

}
