package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 91776
 * version- 3.3.2025
 */
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
/**
 * this method is used to fetch cell data from excel file
 * @param sheetName
 * @param rowIndex
 * @param cellIndex
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String getDataFromExcelFile(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{

		FileInputStream fis=new FileInputStream(IPathUtility.excelPathvtiger);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row r=sh.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		return value;
	}
	/**
	 * this method is used to fetch multiple cell data from excel file
	 * @param sheetName
	 * @param startRoWIndex
	 * @param startCellIndex
	 * @return
	 * @throws Exception
	 * @author 91776
	 * version 4-03-2025
	 */
	public List<String> getMultipleDataFromExcelFiles(String sheetName, int startRoWIndex,int startCellIndex ) throws Exception
	{
		FileInputStream fis= new  FileInputStream(IPathUtility.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetName);
		DataFormatter df= new DataFormatter();
		List<String> al=new ArrayList<String>();
		for(int i=startRoWIndex;i<=sh.getLastRowNum();i++)
		{
		    Row r=sh.getRow(i);
		    for(int j=startCellIndex;j<r.getLastCellNum();j++) {
		    	Cell c=r.getCell(j);
		        String value=df.formatCellValue(c);
		        al.add(value);
		    }    
		    }
		return al;
	}
}