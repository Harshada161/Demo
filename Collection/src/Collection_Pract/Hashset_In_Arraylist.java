package Collection_Pract;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset_In_Arraylist {

	public static void main(String[] args) {
		
	
	HashSet<String> hset = new HashSet<String>();
	hset.add("abc");
	hset.add("xyz");
	hset.add("pqr");
	
	System.out.println("Hashset valu :" +hset);
	
	ArrayList<String> al = new ArrayList<>(hset);
	System.out.println("Value of hashset after taking it into Arraylist :"+al);

	}	
}