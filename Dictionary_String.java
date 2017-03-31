package Dynamic;

public class Dictionary_String {

	public static void main(String args[]){
		
		String s[] = {"mobile","samsung","sam","sung","man","mango","icecream","and","go","i","like","ice","cream" };
		
		String given = "mobile";
		System.out.println(checkString(s,given));
	}
	
	public static boolean isPresent(String s[] ,String prefix){
		
		for(int i=0;i<s.length;i++){
			
			
			if(s[i].compareTo(prefix)==0){
			
				return true;
			}
			
		}
		return false;
	}
	
	
	public static boolean checkString(String[]s,String given){
		
		
		int size = given.length();
		
		for(int i=0;i< size ;i++){
			
			
			if(isPresent(s, given.substring(0,i)) && checkString(s, given.substring(i+1,size-1))){
				
				return true;
			}
		}
		
		
		return false;
	}
}
