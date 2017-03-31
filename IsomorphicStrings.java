package strings;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String args[]){
		
		String s1 = "aabaa";
		String s2 = "xxyr";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		
		boolean result = true;
		
		if(s1.length()!= s2.length()){
			result = false;
		}
		else{
			for(int i=0; i<s1.length()-1; i++){
				
				if(c1[i] == c1[i+1] && c2[i]!= c2[i+1]){
					
					result =false;
					
				}
				else if(c1[i] != c1[i+1] && c2[i]== c2[i+1]){
					result = false;
				}
				else{
					if(hm.containsKey(c1[i]) && hm.get(c1[i])!= c2[i]){
						result = false;
					}
					else{
						hm.put(c1[i], c2[i]);
					}
				}
			}
		}
		System.out.println(result);
		
	}	
}
