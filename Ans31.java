package Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ans31 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
		
		String userdir = System.getProperty("user.dir");
		//System.out.println(userdir);
		
		String fileSeparator = System.getProperty("file.separator");
		
		String sreadpath =  userdir+fileSeparator+"Files"+fileSeparator+"ReadFile.txt";
		
		FileReader ofilereader = new FileReader(sreadpath);
		BufferedReader obufferedreader = new BufferedReader(ofilereader);
		
		String swritepath =  userdir+fileSeparator+"Files"+fileSeparator+"WriteFile.txt";
		BufferedWriter obufferedwriter = null;
		FileWriter ofilewriter = new FileWriter(swritepath);
		obufferedwriter =new BufferedWriter(ofilewriter);
		String str;
		
		while((str= obufferedreader.readLine())!=null) {
			
			StringBuffer value = new StringBuffer(str);
			StringBuffer str2=value.reverse();
			
		//	obufferedwriter.write(str2.toString());
		
			
		//	obufferedwriter.write(str);;
		//	obufferedwriter.write("\n");
		}
		obufferedwriter.close();
		
		

	}

}
