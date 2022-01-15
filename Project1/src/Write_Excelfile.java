import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Write_Excelfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Blank workbook. XSSFWorkbook is a class in APache POI 
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		//create excel sheet
		XSSFSheet samplesheet = workbook.createSheet("SampleSheet");
		
		//creating the Data
		Map<String, Object[]> dataSet = new TreeMap<String,Object[]>();
		dataSet.put("1", new Object[] {"ID", "Name", "Company"});
		dataSet.put("2", new Object[] {"1", "Name1", "Company"});
		dataSet.put("3", new Object[] {"2", "Name2", "Company"});
		dataSet.put("4", new Object[] {"3", "Name3", "Company"});
		dataSet.put("5", new Object[] {"4", "Name4", "Company"});
		dataSet.put("6", new Object[] {"5", "Name5", "Company"});
		dataSet.put("7", new Object[] {"6", "Name6", "Company"});
		
		//iterate over the data
		Set<String> set= dataSet.keySet();
		int rownum = 0;
		
		for(String key : set) {
			
			Row row = samplesheet.createRow(rownum++);
			Object[] data = dataSet.get(key);
			int cellnum = 0;
			 for (Object value : data) {
				 Cell cell = row.createCell(cellnum++);
				 
				 if (value instanceof String) 
					 cell.setCellValue((String)value);
				 else if(value instanceof Integer)
					 cell.setCellValue((Integer)value);
			}
			
		}
		
		//write down file on disk
		try {
			FileOutputStream writeFile = new FileOutputStream("SampleTest.xlsx");
			
			workbook.write(writeFile);
			writeFile.close();
			System.out.println("excel file is being created");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
