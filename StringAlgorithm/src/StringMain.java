
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StringMain {

	static ArrayList<Integer> indexer = new ArrayList<Integer>();
	

	public static void main(String[] args) throws IOException {
				

		 File file = new File("data.txt");
		 readFile(file ,"SMTP");
         indexer.forEach(val -> System.out.print(val+" "));
		

	}
	
	private static void NPatternSearch(String txt  , String pattern) 
	{
		
		int N = txt.length();
		int M = pattern.length();
		
		for(int  i = 0; i <= (N - M); i++)
		{
			
			int j;
			
			for(j = 0; j< M; j++)
				
				if(txt.charAt(i+j) != pattern.charAt(j))
					break;
					
				
				if(j == M) 
					indexer.add(i);		
					  
					
		}
	
	}
	
	public static void readFile(File file  , String pattern) throws IOException
	{
				
		FileReader reader = new FileReader(file);
		BufferedReader buffer_reader = new BufferedReader(reader);
		
		String line;
		
		while((line = buffer_reader.readLine()) != null)
		{
			
			  NPatternSearch(line , pattern);
			
		}
		
		
		buffer_reader.close(); 
		reader .close();
		
	}
	

}
