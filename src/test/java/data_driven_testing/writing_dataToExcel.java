package data_driven_testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writing_dataToExcel {


	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream (System.getProperty("user.dir")+ "\\\\testing _data\\\\Book2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");
	     
		//without for loop
		
		//XSSFRow row1=sheet.createRow(0);
		//row1.createCell(0).setCellValue("welcome");
		//row1.createCell(1).setCellValue("1234");
		//row1.createCell(2).setCellValue("automation");
		
		//XSSFRow row2=sheet.createRow(1);
		//row2.createCell(0).setCellValue("john");
		//row2.createCell(1).setCellValue("core");
		//row2.createCell(2).setCellValue("java");
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<3;r++)
		{
			XSSFRow row1=sheet.createRow(r);
			for(int c=0;c<2;c++)
			{
				//currentRow.createCell(c).setValue("welcome");
				System.out.println("enter the cell");
				String data=sc.next();
				row1.createCell(c).setCellValue(data);
				
			}
			
		}
		
		
		
		System.out.println("writing of file is completed");
		workbook.write(file);
		workbook.close();
		file.close();
		
		

	}

}
