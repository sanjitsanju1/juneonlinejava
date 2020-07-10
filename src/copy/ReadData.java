package copy;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Throwable{
	//read path of excel file
		FileInputStream fi=new FileInputStream("C:\\Users\\sanjit sahoo\\Documents\\testcase.xlsx");
		//get WB from File
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get Sheet from WB
		XSSFSheet ws=wb.getSheet("login");
		//get first Row From WS
		XSSFRow row=ws.getRow(0);
		//count no of rows in a sheet
		int rc=ws.getLastRowNum();
		//count no of cell in row
		int cc=row.getLastCellNum();
		System.out.println("No of rows are::"+rc+"   "+"No of cells in first row::"+cc);
		//print second row first column
String username=ws.getRow(5).getCell(0).getStringCellValue();
	//print second row second column
String password=ws.getRow(7).getCell(1).getStringCellValue();
System.out.println(username+"   "+password);
fi.close();
wb.close();
	}

}
