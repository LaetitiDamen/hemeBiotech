package hemebiotech;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author Laetitia Damen
 *
 */

public class Class2 {
	
	/**
	 * Count occurrences  
	 *  
	 * @param list = ArrayList type container. Contains each line read
	 * @param map = Object of class Map<String, Integer> with parameters (String)key = w (word list)  
	 * 				and parameters values (Integer) = i (occurrences)
	 */
	
	static void calculOcc(List<String> list, Map<String, Integer> map) {

		for (String w : list) {
			Integer i = map.get(w);
			if (i == null) {
				map.put(w, 1);
			} else {
				map.put(w, i + 1);
				
				System.out.println ("count occurences ==> Ok "); 
				
			}
			
		}			
		
	}
}



