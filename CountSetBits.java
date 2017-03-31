package BitManipulation;

public class CountSetBits {

	public static void main(String args[]){
		
		int x =23;
		
		int count =0;
		for(int i=0;i< x ;i++){
			
			if((x & (1<<i))>0){
				
				count ++;
				
			}
			
		}
		System.out.println(count);
	}
}
