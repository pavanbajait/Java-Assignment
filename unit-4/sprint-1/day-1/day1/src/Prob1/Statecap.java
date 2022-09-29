package Prob1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Statecap {

	public static void main(String[] args) {
		Map<String, String> stCap = new HashMap<>();
		stCap.put("Maharashtra", "Mumbai");
		stCap.put("Gujrat", "Surat");
		stCap.put("Tamil Nadu", "Chennai");
		stCap.put("Telangana", "Hyderabad");
		stCap.put("Karnataka", "Banglore");
		
		System.out.println("Indian State & their respectivce Capital are:");
		Set<Map.Entry<String, String>> keyValue = stCap.entrySet();
		for(Map.Entry<String ,String> k: keyValue) {
			System.out.println(k.getKey()+" = "+k.getValue());
		}
	}

}
