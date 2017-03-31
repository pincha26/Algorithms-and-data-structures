package Dynamic;

public class Partition_Problem {

	public static void main(String args[]){
		
		int[] a= {4,2,7,3,1,9,6};
		int sum = 0;
		
		for(int i=0;i< a.length;i++){
			
			sum = sum + a[i];
			
		}
		
		if(sum%2!=0 ){
			
			System.out.println("false");
		}
		else{
			System.out.println(subsetSum(a,a.length, sum/2));
		}
		
		
		
	}
	
	public static boolean subsetSum(int[] a,int n, int sum){
		
		if(sum==0){
			
			return true;
		}
		if(sum<0){
			return false;
		}
		
		if(n==1){
			return false;
		}
		
		boolean b = subsetSum(a,n-1, sum-a[n-1]) | subsetSum(a,n-1, sum);
		
		return b;
	}
	
	
}
