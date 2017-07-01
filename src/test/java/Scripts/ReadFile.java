package Scripts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException
	{
		String strline="";
		
		FileReader fr= new FileReader("D:\\ReadData.txt");
		BufferedReader br=new BufferedReader(fr);
		
		//System.out.println(br.readLine());
		
		while((strline=br.readLine())!=null)
		{
		
				System.out.println(strline);
		}
			
		br.close();

	}

}
