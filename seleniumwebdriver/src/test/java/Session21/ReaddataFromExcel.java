//read data from Excel file ************************************************************
package Session21;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataFromExcel {

	
//	Hierarchy --> Excel File ->> Workbook --> Sheets --> Rows -->Cells
	
	public static void main(String[] args) throws IOException {
		
		//Read excel file to read the data using FileInputStream class 
		//System.getProperty("user.dir")will direct to current project location andinside will go to test data folder 
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\Excel1.xlsx");
		
		//capture workbook form the file 
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//get the sheet from workbook 
		XSSFSheet sheet = workbook.getSheet("Sheet1"); //OR //XSSFSheet sheet = workbook.getSheetAt(0);
		
		//get the number of rows
		int totalrows = sheet.getLastRowNum();
		
		//capture row from sheet 
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("total rows:"+ totalrows );//5
		System.out.println("total cells:" +totalcells );//4
		
		for(int r=0; r<=totalrows; r++) // outer for loop for getting a single row
		{
			 XSSFRow Currentrow = sheet.getRow(r);
			for(int c=0; c<totalcells; c++)// to read all the cell and go back to outer for and read next row 
			{
			XSSFCell Currentcell = Currentrow.getCell(c); // read value form currentrow
			System.out.print(Currentcell.toString()+"\t"); // once we get a cell object we are extracting cellobject by to string method
			}
			System.out.println();
		}
		
		
		
		
		workbook.close();
		file.close();

	}

}
