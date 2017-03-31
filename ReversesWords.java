package strings;

public class ReversesWords {
	
	static String s= "";
	static char c[] = new char[s.length()];
	
	public static void main(String args[]){
		
		String s = " Maulik is a good boy";
		
		c = s.toCharArray();
		
		reverses(0,c.length-1);
		
		int i =0;
		while(i<s.length()){
			
			if(c[i] == ' '){
				i++;
				
			}
			else{
				break;
			}
			
		}
		
		int j =i;
		while(j<s.length()){
			
			if(c[j]== ' '){
				
				reverses(i, j-1);
				i = j+1;
				j++;
			}
			else{
				j++;
			}
		}
		
		System.out.println(c);
	}
	
	public static void reverses(int i, int j){
		
		char temp;
		while(i<j){
			
			temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		
		
	}
}
