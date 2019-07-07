import java.util.HashMap;

public class HashMapCalculator {

	public  Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
int a = 0;
		System.out.println("hi");


for(String k: hashmap1.keySet()) {
	System.out.println("hi");
	if(hashmap2.containsKey(k)) {
	
		
		
		if(hashmap2.get(k)==hashmap1.get(k)) {
			
			
		
a +=1;
		
			
	}
}



	
		
		
		
	

}
System.out.println(a);
return a;


}
	
}