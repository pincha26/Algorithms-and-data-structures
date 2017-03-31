package strings;

public class String_anagram {

	public static void main(String args[]){
		
		String a = "abcdef";
		String b = "cdeakf";
	
		char c[] = a.toCharArray(); 
		char d[] = b.toCharArray();
				
		int bits=0;
		
		for(int i = 0 ;i< c.length;i++){
			
			int ascii = c[i] - 'a';
			bits = bits | 1<<ascii;
		}
		
		for(int i = 0 ;i< d.length;i++){
			
			int ascii = d[i] - 'a';
			if( (bits & 1<<ascii) ==0 ){
			
				System.out.println("Not an anagram");
				break;
			}	
		}
		
	}
}
