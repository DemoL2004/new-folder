package filepack;
import java.io.*;

public class fileee {
	public static void main(String args[]) throws IOException {
		File inputfile=new File("C:\\Piyush\\input.txt");
		File outputfile=new File("C:\\Piyush\\output.txt");
		FileReader in=new FileReader(inputfile);
		FileWriter out=new FileWriter(outputfile);
		FileReader in2=new FileReader(outputfile);
		int c;
		while ((c=in.read())!=-1)
			out.write(c);
		in.close();
		out.close();
		while ((c=in2.read())!=-1){
			System.out.print((char)c);}
		in2.close();
	}
}
