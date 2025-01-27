package poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata {

	public static void main(String[] args) throws IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\pml01\\eclipse-workspace\\amarporjectapache\\Testdata\\Bookamar.xlsx");
	XSSFWorkbook workbook =new XSSFWorkbook(file);
	XSSFSheet Sheet =workbook.getSheet("Sheet1");
	int TotalRows= Sheet.getLastRowNum();
	int TotalCells= Sheet.getRow(1).getLastCellNum();
	for(int r=0;r<=TotalRows;r++) {
		XSSFRow currentRow=Sheet.getRow(r);
		for(int c=0;c<TotalCells;c++) {
		XSSFCell cell=currentRow.getCell(c);
		System.out.print(cell.toString()+   "\t");
			
		}
		System.out.println();
	}
	workbook.close();
	file.close();
	}

}
