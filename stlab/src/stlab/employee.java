package stlab;

import java.io.File;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class employee
{
		public void write() throws Exception
		{
	File file = new File("D://anu//student.xls");
	WritableWorkbook workbook = Workbook.createWorkbook(file);
	workbook.createSheet("Report",0);
	WritableSheet excelSheet = workbook.getSheet(0);
	createLabel(excelSheet);
	createContent(excelSheet);
	workbook.write();
	workbook.close();
}
	private void createLabel(WritableSheet sheet) throws Exception
	{
		addLabel(sheet,0,0,"student name");
		addLabel(sheet,1,0,"subject 1");
		addLabel(sheet,2,0,"subject 2");
		addLabel(sheet,3,0,"subject 3");
		}
	private void createContent(WritableSheet sheet) throws Exception
	{
		for(int i=1;i<10;i++)
		{
			addLabel(sheet,0,i,"stlab"+i);
			
			addNumber(sheet,1,i,((i*i)+10));
			addNumber(sheet,2,i,((i*i)+4));
			addNumber(sheet,3,i,((i*i)+3));
		}
	}
	private void addNumber(WritableSheet sheet,int column,int row,Integer 
			integer)throws Exception
	{
		Number number;
		number = new Number(column,row,integer);
		sheet.addCell(number);
	}
	private void addLabel(WritableSheet sheet,int column,int row,String s)throws Exception
	{
		Label label;
		label =new Label(column,row, s);
		sheet.addCell(label);
	}
	public static void main(String[] args)throws Exception
	{
		employee test = new employee();
		test.write();
		System.out.println("please check the result file under D://anu//student.xls");
	}
	}
