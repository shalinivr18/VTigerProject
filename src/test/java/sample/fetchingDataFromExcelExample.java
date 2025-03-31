package sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class fetchingDataFromExcelExample {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//FileInputStream fis=new FileInputStream("C:\\Users\\91776\\Desktop\\Book1.xlsx");
		//Workbook wb= WorkbookFactory.create(fis);
		//Sheet sh=wb.getSheet("animal");
		//Row r=sh.getRow(0);
		//Cell cell=r.getCell(1);
		//String value=cell.getStringCellValue();
		
		//usinggeneric utility
		ExcelUtility eutility= new ExcelUtility();
		String value=eutility.getDataFromExcelFile("animal", 3, 3);
		System.out.println(value);
		String value1=eutility.getDataFromExcelFile("bird", 1, 1);
		System.out.println(value1);
	}

}
