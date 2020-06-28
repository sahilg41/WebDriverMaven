import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
File f= new File("F:\\Sahil\\Selenium_doc\\Files\\myExcel.xlsx");
		
		FileInputStream fi= new FileInputStream(f);
		
		Workbook workbook= WorkbookFactory.create(fi);
		
		Sheet sheet0= workbook.getSheetAt(0);
		
		/*for(Row row:sheet0)
		{
			for(Cell cell:row){
				switch(cell.getCellType()){
				
				case Cell.CELL
				}
				
			}
		}*/
		
		Row row0= sheet0.getRow(4);
		System.out.println(row0);
		Cell cellA= row0.getCell(4);
		System.out.println(cellA);
		Cell cellB= row0.getCell(5);
		System.out.println(cellA+"..."+cellB);
		fi.close();
	}

}
