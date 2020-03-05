package Collection_Pract;

import java.util.ArrayList;

public class Arraylist_Ex_Sublist {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("Harshu");
	al.add("Pratiksha");
	al.add("Puja");
	al.add("Priyanka");
	System.out.println(al.subList(al.indexOf("Pratiksha"), al.indexOf("Priyanka")));

}
}
