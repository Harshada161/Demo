package Collection_Pract;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=sc.next();
		System.out.println("Enter second String");
		String str2=sc.next();
		System.out.println(AnagramCheck(str1,str2));
		sc.close();
		
		
	}
	public static boolean AnagramCheck(String str1,String str2) {
		char c1[]= str1.toCharArray();
		char c2[]=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2
				)) {
			return true;
		}
		else {
		return false;
		}
	}
}