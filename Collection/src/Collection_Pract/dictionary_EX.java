package Collection_Pract;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class dictionary_EX {

	public static void main(String[] args) {
		Dictionary<Integer, String> d = new Hashtable<Integer,String>();
		d.put(1, "abc");
		d.put(2, "xyz");
		
		 
		
		Enumeration<Integer> e=d.keys();
				while(e.hasMoreElements()) {
				 int k= e.nextElement();
				System.out.println(k+": "+d.get(k));

			
		}
		
		
	}

}
