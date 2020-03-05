package Collection_Pract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Student_Ex {

	public static void main(String[] args) {
		ArrayList<String> alMobNum = new ArrayList<>();
		alMobNum.add("111");
		alMobNum.add("111");
		alMobNum.add("111");
		alMobNum.add("111");
		ArrayList<String> alAllDet = new ArrayList<>();
		alAllDet.add("Name");
		alAllDet.add("DOB");
		alAllDet.add("PAN");
		
		HashMap<String, ArrayList<String>> hmRollNoDet = new HashMap<>();
		hmRollNoDet.put("AllDetails", alAllDet);
		hmRollNoDet.put("MobNums", alMobNum);
		
		HashMap<String, HashMap<String, ArrayList<String>>> hmFinal = new HashMap<>();
		hmFinal.put("k123", hmRollNoDet);
		
		Set<String> keyRollNo = hmFinal.keySet();
		for(String keyRollNos :keyRollNo) {
			HashMap<String, ArrayList<String>> hmInternalDet = hmFinal.get(keyRollNos);
			Set<String> detailKey = hmInternalDet.keySet();
			for(String detailName : detailKey) {
				
				System.out.println(detailName);
				ArrayList<String> det = hmInternalDet.get(detailName);
				System.out.println(det);
			}
			
		}
		
	}

}
