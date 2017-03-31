package strings;

public class Palindrome_Permutation {

	public static void main(String args[]){
		
		String s = "cdac  dee";
		char[] c = s.toCharArray();
		int spaceCount = 0;
		int bitVactor = 0;
		for(int i = 0; i<s.length();i++){
			
			if(c[i]== ' '){
				spaceCount++;
			}
		}
		int charCount = c.length - spaceCount;
		
		for(int i=0;i< c.length;i++){
			
			if((bitVactor & 1<<c[i])!=0){
				
				bitVactor = bitVactor^( 1<< c[i]);
			}
			else{
				bitVactor = bitVactor | ( 1<< c[i]);
				
			}
		}
		
		int count =0;
		for(int i=0;i< bitVactor;i++){
			
			if((bitVactor & (1<<i))>0){
				count ++;
			}
		}
		
		if((charCount%2==0 && bitVactor !=0) || (charCount%2!=0 && count!=1) ){
			
			System.out.println("Not a palindrome");
			
		}
		else{
			System.out.println("palindrome");
		}
		
		
	}
}