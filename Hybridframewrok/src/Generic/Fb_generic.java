package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fb_generic {
	public static String fb_generic(String Sheet,int Row,int Cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./excel/fb.2.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		  Sheet sheet1 = book.getSheet(Sheet);
		  Row row = sheet1.getRow(Row);
		  Cell cell = row.getCell(Cell);
		  String value = cell.toString();
			return Sheet;

		 
	}

}
