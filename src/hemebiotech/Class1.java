package hemebiotech;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * 
 * @author Laetitia Damen
 *
 */


public class Class1 {
	
	/**
	 * Read, analyze file and containing elements in an ArrayList  
	 * 
	 * @param doc = String variable containing the file path to analyze
	 * @param list = ArrayList type container. Contains each line read
	 */
	
	public static void readDoc(File doc, List<String> list) {
		if (doc != null) {

			try {
				BufferedReader br = new BufferedReader(new FileReader(doc));

				String line = null;
				while ((line = br.readLine()) != null) {
					list.add(line);
				}
				br.close();

			} catch (IOException e) {
				System.err.println("Unable to read the file."); // Error message
			}
		}
		System.out.println(doc + " : reading ->  Ok");
	}
}

