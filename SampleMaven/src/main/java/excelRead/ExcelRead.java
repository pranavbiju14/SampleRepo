package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	static FileInputStream f; //used to input a file

	static XSSFWorkbook w; //used to fetch a workbook from the file

	static XSSFSheet s; //used to input an excel sheet

	

	public static String getStringData(int a,int b) throws IOException
	{

		f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel Read.xlsx");

		w=new XSSFWorkbook(f);

		s=w.getSheet("Sheet1");

		XSSFRow r=s.getRow(a);

		XSSFCell c=r.getCell(b);

		return c.getStringCellValue();

	}

	public static int getIntegerData(int a,int b) throws IOException 
	{

		f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel Read.xlsx");

		w=new XSSFWorkbook(f);

		s=w.getSheet("Sheet1");

		XSSFRow r=s.getRow(a);

		XSSFCell c=r.getCell(b);

		int y=(int) c.getNumericCellValue(); //type casting - converting of data from one type to another [ double to int ].

		return y;
		//return String.valueOf(y);

	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(ExcelRead.getStringData(1, 0));
		System.out.println(ExcelRead.getIntegerData(1, 1));
		System.out.println(ExcelRead.getStringData(2, 0));
		System.out.println(ExcelRead.getIntegerData(2, 1));

	}

}
