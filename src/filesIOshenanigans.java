
/**
	@author Mason Danne
	
	Times:
		Date Started:					dd/mmm/yyyy
		Date Last Edited:				dd/mmm/yyyy
		Total combined hours spent:		hh/mm
	Notes:
		Probably broken.
	Sources:
		#:URL
**/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class filesIOshenanigans {
		private static Scanner scanf = new Scanner(System.in);	//Thanks Scott!
		public static void main(String [] args){
				@SuppressWarnings("unused")
				final int c = 299792458;        
				//code goes here
				
				String content = "";
				String pathAsString = "/home/masondanne/Documents/javaWorkspace/Assorted/src/touchMeDaddy.txt";
				Path path = Paths.get(pathAsString);
				try {
						content = new String(Files.readAllBytes(path));
						System.out.println(content);
						System.out.println("And now we modify the file.");	//original text: foo\nbar\nbaz
						String newContent = "qux\nquux\ncorge";
						
						BufferedWriter writer = null;
						try{
								writer = new BufferedWriter(new FileWriter(pathAsString));
								writer.write(newContent);
						}
						catch (IOException e){/*do nothing*/}
						finally{
							try{
									if(writer != null){writer.close();}
						    }
						    catch ( IOException e){/*do nothing*/}
						}
						content = new String(Files.readAllBytes(path));
						System.out.println(content);
				} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
		}
}