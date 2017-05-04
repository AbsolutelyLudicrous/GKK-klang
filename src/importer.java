import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class importer implements importerNeededMethods{
		private Path gamedata;	//path to the gamedata folder
		private List<String> kontents;	//the contents of the kode
		public importer(){
				//when the importer is instatiated, it reads the path to the GameData directory from the kode
				try {
						gamedata = Paths.get("/path/to/gamedata/");
						
						//get the list of files in the gamedata directory
						//later, we'll read from the kode to see what we need to modify
						
						File[] files = gamedata.toFile().listFiles();
						for(File f : files){
							
						}
				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}		//helpfully stolen from https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file
				
		}
		/*
		public ArrayList<File> getFiles(){
				
		}
		public int modifyFiles(){
				
		}
		*/
}
