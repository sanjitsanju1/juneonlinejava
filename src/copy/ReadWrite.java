package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable{
	FileInputStream fi=new FileInputStream("C:\\Users\\sanjit sahoo\\Documents\\testcase.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheet("login");
	int rc=ws.getLastRowNum();
	for(int i=1;i<=rc;i++)
	{
		String username=ws.getRow(i).getCell(0).getStringCellValue();
		String password=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(username+"   "+password);
		//write as pass into results column
		ws.getRow(i).createCell(2).setCellValue("pass");
	}
fi.close();
FileOutputStream fo=new FileOutputStream("C:\\Users\\sanjit sahoo\\Documents\\tester.xlsx");
wb.write(fo);
fo.close();
wb.close();
	}

}
