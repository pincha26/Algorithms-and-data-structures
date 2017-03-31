package Dynamic;

public class SubSet_Problem {

	public static void main(String args[]){
		
		int[] a= {4,2,7,3,1,9,6};
		
		System.out.println(subsetSum(a,7,40));
		
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
