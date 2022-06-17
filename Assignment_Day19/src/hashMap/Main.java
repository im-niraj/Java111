package hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("Delhi", new Student(11, "Ankur", 425));
		map.put("Mumbai", new Student(12, "Bharat", 370));
		map.put("UP", new Student(13, "Brijesh", 350));
		map.put("Bihar", new Student(14, "Aditya", 390));
		map.put("MP", new Student(15, "Ankush", 460));
		map.put("Tamilnadu", new Student(16, "Sarath", 480));
		
		Set<Entry<String, Student>> entrySet = map.entrySet();
		List<Entry<String, Student>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<String, Student>>() {

			@Override
			public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getMarks() - o2.getValue().getMarks();
			}
		});
		
		
//		Student 
		list.forEach(e -> System.out.println(e.getKey()+"  "+e.getValue()));
		
		
	}

}
