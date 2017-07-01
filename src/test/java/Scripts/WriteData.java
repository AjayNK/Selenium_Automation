package Scripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
	
	public static void main(String[] args) throws IOException {
		File filevar=new File("D:\\june_logs.txt");
		
		if(filevar.exists()==false)
		{
			filevar.createNewFile();
		}
		
		//File write and Buffered writer
		
		FileWriter fw=new FileWriter(filevar);
		BufferedWriter bw= new BufferedWriter(fw);
		
		//write
		
		bw.write("Testcase1 is Passed");
		bw.newLine();
		bw.write("Testcase3 is failed");
		bw.newLine();
		
		//append
		bw.append("June month end");
				
		bw.close();
		
	}

}
