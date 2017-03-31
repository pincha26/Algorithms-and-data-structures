package amazon;

import java.util.Scanner;

public class reach_nth_stairs {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++){
			
			int n = sc.nextInt();	
			long[] recurse = new long[n+1];
			
			if(n==1){
				recurse[1] = 1;
			}
			
			
			if(n>=2){
				recurse[1] =1;
				recurse[2] =2;
			}
			
			for(int j=3;j<=n;j++){
				recurse[j] = (recurse[j-1] +recurse[j-2]);
				recurse[j] = (long) ((int)recurse[j]%(Math.pow(10, 9)+7));
 			}
			System.out.println((long)((recurse[n])%(Math.pow(10,9)+7)));
		}
	}
}
