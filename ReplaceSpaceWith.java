package strings;

public class ReplaceSpaceWith {
	
	public static void main(String args[]){
		
		String s = "Mr John Smith    ";
		
		char c[] = s.toCharArray();
		int flag= 0;
		int pointerSpace =c.length-1;
		
		for(int i=c.length-1;i>=0;i--){
			
			if(c[i] == ' ' && flag == 0){
				
			}
			else if(c[i] == ' ' && flag==1 ){
				c[pointerSpace] = '0';
				pointerSpace--;
				c[pointerSpace] = '2';
				pointerSpace--;
				c[pointerSpace] = '%';
				pointerSpace--;
			}
			else{
				flag=1;
				c[pointerSpace] = c[i];
				pointerSpace--;
			}
		}
		System.out.println(String.valueOf(c));
	}

}
