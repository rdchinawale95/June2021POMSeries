import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream readFile = new FileInputStream("SampleTest.xlsx");
		
		//c://test//sample//file//sampleTest.xlsx
		
		XSSFWorkbook workbook = new XSSFWorkbook(readFile);
		XSSFSheet sheet= workbook.getSheet("samplesheet");
		Row row;
		Cell cell;
		
		Iterator<Row> rowIterator = sheet.iterator();
		 while(rowIterator.hasNext()) {
			 row= rowIterator.next();
			 
			 Iterator<Cell> cellIterator = row.cellIterator();
			 while(cellIterator.hasNext()) {
				 cell = cellIterator.next();
				 
				 DataFormatter formatter= new DataFormatter();
				 String text= formatter.formatCellValue(cell);
				 
				 System.out.println(text);
				 
			 }
		 }
		
		
		
		
		
		

	}

}
