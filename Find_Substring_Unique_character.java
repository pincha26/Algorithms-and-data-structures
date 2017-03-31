package strings;

import java.util.HashMap;

public class Find_Substring_Unique_character {

	public static void main(String args[]){
		
		String s = "abcabcbb";
		
		int max=0;
		int curr =0;
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		
		for(int i =0;i< s.length();i++){
			
			if(hs.containsKey(s.charAt(i))){
				
				int index = hs.get(s.charAt(i));
				
				if((i-curr)>index){
					curr = curr+1;
					hs.put(s.charAt(i), i);
					if(curr>max){
						max =curr;
					}
				}
				else{
					hs.put(s.charAt(i), i);
					curr= 1;
				}
			}
			else{
				curr = curr+1;
				hs.put(s.charAt(i), i);
				if(curr>max){
					max =curr;
				}
			}
			
		}
		
	}
}
