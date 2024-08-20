package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility 
{
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet sh,sh1;			
		
	public static String getStringData(int a,int b) throws IOException
	 {
	   f=new FileInputStream("C:\\Users\\amrit\\git\\7rmartsupermarket\\7rmartSupermarketLiveProject\\src\\main\\resources\\7rmartsupermarketLiveProject.xlsx");
	   w=new XSSFWorkbook(f);
	   sh=w.getSheet("LoginDetails");
	   Row r=sh.getRow(a);//Interface
	   Cell c=r.getCell(b);//Interface
	   return c.getStringCellValue();//method for returning cell value    
	 }
	public static String getIntegerData(int a,int b) throws IOException
	 {
	  f=new FileInputStream("C:\\Users\\amrit\\git\\7rmartsupermarket\\7rmartSupermarketLiveProject\\src\\main\\resources\\7rmartsupermarketLiveProject.xlsx");
	  w=new XSSFWorkbook(f);
	  sh=w.getSheet("LoginDetails");
	  Row r=sh.getRow(a);//Interface
	  Cell c=r.getCell(b);//Interface
	  int x=(int) c.getNumericCellValue();//type casting String value to integer value
	  return String.valueOf(x);
     }
}
	//add read from Excel code

