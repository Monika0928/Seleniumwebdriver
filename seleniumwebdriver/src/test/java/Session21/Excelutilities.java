package Session21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {
	
	public  static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	//read the data from excel 
	public static int getRowCount(String xlfile, String xlsheet ) throws IOException //filepath and sheet name
	{
		fi = new FileInputStream(xlfile);
		wb= new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	public static int getCellCount(String xlfile , String xlsheet , int rownum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row= ws.getRow(rownum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellCount;
	}
		
	public static String getCellData(String xlfile, String xlsheet , int rownum, int column) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(column);
		
		String data;
		try {
//			data = cell.toString();
			//or
			DataFormatter formatter = new DataFormatter(); // apache poi is provided with special class called dataformatter
			data = formatter.formatCellValue(cell); //returns the formatted value of a cell as a string regardless of cell type 
		}
		catch(Exception e)
		{
			data="";
		}
	wb.close();
	fi.close();
	return data;
	}
	
	//Write data into excel file
	public static void setCellData(String xlfile, String xlsheet, int rownum, int coulmn , String data) throws IOException //set cell write data into cell
	{
		fi = new FileInputStream(xlfile);
		wb= new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet); // create sheet 
		row =ws.getRow(rownum); // get row 
		cell =row.getCell(coulmn); // create cell in above row 
		cell.setCellValue(data); // update cell value
		fo= new FileOutputStream(xlfile);
		
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	

	public static void main(String[] args) {
		
		

	}

}
