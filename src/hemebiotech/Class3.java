package hemebiotech;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * @author Laetitia Damen
 *
 */



public class Class3 {
	
	/**
	 * Sort in natural order and write out as the file resuts.out.txt
	 * 
	 * @param map = Object of class Map<String, Integer> with parameters (String)key = w (word list)  
	 * 				and parameters values (Integer) = i (occurrences)
	 * @throws IOException = show up when an I/O Exception occurs 
	 */

	static void docOut(Map<String, Integer> map) throws IOException {

		Map<String, Integer> newmap = new TreeMap<String, Integer>(map); // Sort map in natural order in the TreeMap

		File doc2 = new File(" results.out.txt"); // String variable containing the file path to generate

		BufferedWriter writOut = null;
		try {
			writOut = new BufferedWriter(new FileWriter(doc2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Entry<String, Integer> entry : newmap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			writOut.write(key + " = " + value + System.getProperty("line.separator"));
		}
		System.out.println("New File Create: " + doc2);
		System.out.println("File location: " + doc2.getAbsolutePath());

		writOut.flush();
		writOut.close();

	}

}


