package amazon;

public class ReachNthStep {

	public static void main(String args[]){
		
		int n =10;
		System.out.print(recurse(n));
	}
	
	public static void getCount(int n){
		
		int array[] = new int[n+1];
		
		array[1] = 1;
		array[2] = 2;
		
		for(int i=3;i<=n;i++ ){
			
			array[i] = array[i-1] + array[i-2];
			
		}
		System.out.println(array[n]);
	}
	
	public static int recurse(int n){
		
		if(n==0){
			return 0;
		}
		
		else if (n==1){
			return 1;
		}
		else if(n==2){
			return 2;
		}
		else{
			return (recurse(n-1)+recurse(n-2));
		}
		
	}
}
