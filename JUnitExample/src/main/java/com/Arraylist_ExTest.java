package com;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Arraylist_ExTest {
	
	static ArrayList<String> expectedArraylist = new ArrayList<String>();
	@BeforeClass
	public static void addData() {
		expectedArraylist.add("Kiran");
		expectedArraylist.add("Kiran1"); 
		expectedArraylist.add("Kiran1"); 
		expectedArraylist.add("Kiran2");
		expectedArraylist.add("Kiran2");
		expectedArraylist.add("Kiran2");
		
	}
	@Test
	public void test() {
		Assert.assertEquals(expectedArraylist, Arraylist_Ex.getactualArraylist());
		System.out.println("Pass");
	}

}
