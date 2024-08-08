package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {


	public static void main(String[] args) throws IOException
	{
		//FileInputStream file=new FileInputStream("C:\\Users\\91988\\eclipse-workspace\\selenium_maven\\testing _data\\Book1.xls") ;
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testing _data\\Book1.xlsx"); 
		
		
		 //workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);//apache poi
		
		//sheet
		XSSFSheet sheet=workbook.getSheet("Sheet1");//name
		//XSSFSheet sheet=workbook.getSheetAt(0);//index
		
		
		int rows=sheet.getLastRowNum();
		int cell=sheet.getRow(1).getLastCellNum();
		System.out.println("the no of rows are:"+ rows);
		System.out.println("the no of cells are:"+ cell);
		
		for(int r=0;r<=rows;r++) //rows
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<cell;c++)
			{
				String cellvalue=currentRow.getCell(c).toString();
				System.out.println(cellvalue+ "  ");
			}
			System.out.println();
		}
	
		workbook.close();
		file.close();
	}

}
