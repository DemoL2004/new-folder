package count;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class combo extends SeleneseTestCase
{
   public void setUp()throws Exception
   {
	   selenium=new DefaultSelenium("localhost",4444,"*chrome",
			   "file:///D:/anu/combocount.html");
	  selenium.start();
	 }
   public void testloginlogout()
   {
	   selenium.setSpeed("1000");
	   selenium.open("file:///D:/anu/combocount.html");
	   selenium.waitForPageToLoad("30000");
	   selenium.windowMaximize();
	   String[]selectelements = new String[1000];
	   selectelements=selenium.getSelectOptions("//select");
	   System.out.println("the number of options present in the given selectbox is"+selectelements.length);
	   
   }
}
