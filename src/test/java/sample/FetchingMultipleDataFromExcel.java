package sample;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
import genericUtility.IPathUtility;

public class FetchingMultipleDataFromExcel {
public static void main(String[] args) throws Exception {
//	FileInputStream fis=new  FileInputStream(IPathUtility.excelPath);
//	Workbook wb=WorkbookFactory.create(fis);
//	Sheet sh= wb.getSheet("animal");
//	DataFormatter df= new DataFormatter();
//	for(int i=1;i<=sh.getLastRowNum();i++)
//	{
//	    Row r=sh.getRow(i);
//	    for(int j=0;j<r.getLastCellNum();j++) {
//	    	Cell c=r.getCell(j);
//	        String value=df.formatCellValue(c);
//	        System.out.print(value+" ");
//	        }
//	    System.out.println();
	
	 ExcelUtility eutil=new ExcelUtility();
	 List<String> value=eutil.getMultipleDataFromExcelFiles("animal", 1, 3);
	 for(String i:value) {
		 System.out.println(i);
	 }
}
}

