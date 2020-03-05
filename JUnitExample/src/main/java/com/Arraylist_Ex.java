package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Arraylist_Ex {
	private ArrayList<String> actualArraylist;

	public static ArrayList<String> getactualArraylist() {
		ArrayList<String> actualArraylist = new ArrayList<String>();
		actualArraylist.add("Kiran");
		actualArraylist.add("Kiran1");
		actualArraylist.add("Kiran1");
		actualArraylist.add("Kiran2");
		actualArraylist.add("Kiran2");
		actualArraylist.add("Kiran2");
		return actualArraylist;
	}

	List list = (List) actualArraylist.stream().distinct().collect(Collectors.toList());

	{
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < list.size(); i++) {
			map.put((String) list.get(i), Collections.frequency(actualArraylist, list.get(i)));
		}
		System.out.println(map);
	}
}
