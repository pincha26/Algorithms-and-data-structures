package strings;

public class FirstNonRepeating {
	
	public static void main(String args[]){
		
		String s = "abcded";
		int bits =0;
		char[] c = s.toCharArray();
		
		for(int i=0;i< c.length;i++){
			
			int ascii = c[i] - 'a';
			
			if( (bits & (1<< ascii))!=0 ){
				
				System.out.println(c[i]);
				break;
			}
			else{
				
				bits = bits | 1<<ascii;
				
			}
			
		}
	}
}
