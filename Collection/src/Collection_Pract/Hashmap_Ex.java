package Collection_Pract;

import java.util.HashMap;

import java.util.Set;

public class Hashmap_Ex {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Abc");
		hm.put(2, "xyz");
		hm.put(3, "pqr");
		
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);

		for(int key : keys) {
			String val = hm.get(key);
			System.out.println(val);
			}
		
	}

	
}
