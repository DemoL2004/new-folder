package readstudent;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;

public class read 
{
 public void st() throws IOException
 {
	 File inputWorkbook = new File("D://anu//student.xls");
	 Workbook w;
	 int count=0;
	 try
	 {
		 w= Workbook.getWorkbook(inputWorkbook);
		 Sheet sheet = w.getSheet(0);
		 for(int j=0;j<sheet.getRows();j++)
		 {
			 for(int i=0;i<sheet.getColumns();i++)
			 {
				 Cell cell=sheet.getCell(i,j);
				 if(cell.getType()==CellType.NUMBER)
				 {
					 if(Integer.parseInt(cell.getContents())>60)
					 {
						 count ++;
						 break;
					 }
				 }
			 }
		 }
		 System.out.println("total number of students who scored more than 60 in one or more subjects is:"+count);
		 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
		 
	 }
 }
 public static void main(String[] args)throws IOException
 {
	 read test =new read();
	 test.st();
 }
}
