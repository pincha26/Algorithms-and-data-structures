package amazon;

import java.util.Scanner;

public class Kadane_algo {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i< T;i++){
			
			int n = sc.nextInt();
			int a[] = new int[n];
			long max_ending=0;
			long max_sofar=0;
			
			
			for(int j=0;j<n;j++){
				
				a[j] = sc.nextInt();
				
				if(a[j]+max_ending>=0){
					
					max_ending = a[j]+ max_ending;
				}
				else{
					max_ending = 0;
				}
				
				if(max_ending>max_sofar){
					max_sofar = max_ending;
				}
			}
			
			if(max_sofar==0){
				max_sofar =Integer.MIN_VALUE;
				for(int j=0;j<n;j++){
					
					if(a[j]>max_sofar){
						max_sofar =a[j]; 
					}
				}
				
			}
			System.out.println(max_sofar);
		
		}
	}
}
