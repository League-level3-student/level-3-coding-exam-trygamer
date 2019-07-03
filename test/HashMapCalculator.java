import java.util.HashMap;

public class HashMapCalculator {

	public  Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
int a = 0;
		


			
	if(hashmap1.containsKey("Alice")&&hashmap1.get("Alice")==hashmap2.get("Alice")) {
		 a =2;
	}
	
	if(hashmap1.containsKey("Mary")&&hashmap1.get("Mary")==hashmap2.get("Mary")) {
		 a =2;
	}
	
	if(hashmap1.containsKey("Bob")&&hashmap1.get("Bob")==hashmap2.get("Bob")) {
		 a =2;
	}
	
	if(hashmap1.containsKey("Chuck")&&hashmap1.get("Chuck")==hashmap2.get("Chuck")) {
		 a =2;
	}
	
	if(hashmap1.containsKey("Felix")&&hashmap1.get("Felix")==hashmap2.get("Felix")) {
		 a =2;
	}
		
	if(hashmap1.containsKey("Ricardo")&&hashmap1.get("Ricardo")==hashmap2.get("Ricardo")) {
		 a =2;
	}
	
	if(hashmap1.containsKey("Tam")&&hashmap1.get("Tam")==hashmap2.get("Tam")) {
		 a =2;
	}
	
	
	

		
		return a;
	}

}
