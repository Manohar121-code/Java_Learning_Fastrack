package part3.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Sachin");
		map.put(18, "Kohli");
		map.put(7, "Dhoni");
		map.put(45, "Rohit");
		map.put(45, "Rohit");
		
		String string = map.get(7);
		System.out.println("value for key 7 - "+ string);
		
		System.out.println("-------------");
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key - "+ key+ " "+ "Value - "+ value);
		}
		System.out.println("---------------");
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			String value = map.get(key);
			System.out.println("Key - "+ key+ " "+ "Value - "+ value);
		}
		System.out.println("-----------");
		
		System.out.println("size - "+ map.size());
		
	}
}
