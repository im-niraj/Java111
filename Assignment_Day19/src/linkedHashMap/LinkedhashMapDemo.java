package linkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedhashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("UP", "Lucknow");
		map.put("Telangana", "Hyderabad");
		map.put("Punjab", "Chandigarh");
		map.put("Maharastra", "Mumbai");
		map.put("Karnataka", "Bengaluru");
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		Iterator<Map.Entry<String, String>> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			  Map.Entry<String, String> entry =iterator.next();
			  System.out.println(entry.getKey() +"----------"+entry.getValue());
		}
	}

}
