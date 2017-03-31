package Hacherrank;

import java.util.Scanner;

public class Nikita_and_game_hacherrank {
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
			
		int n = sc.nextInt();
		
		
		for(int i=0;i<n;i++){
			
			int m = sc.nextInt();
			long[] array = new long[m+1];
			
			int T[][] = new int[m+1][m+1];
			
			for(int k =1;k<=m;k++){
				
				array[k] = sc.nextInt();
			}
			
			for(int length =2;length<=m;length++){
				
				for(int j=1;(j+length-1)<= m;j++){
						
					long sum=0;
					for(int p = j;p<j+length;p++){
						
						sum = sum + array[p];
					}
					long sumTemp=0;
					for(int p= j;p<=(j+length-1);p++){
						
						sumTemp= sumTemp + array[p];
						if(sumTemp== (sum/2.0)){
							T[j][j+length-1] = Math.max(T[j][p],T[p+1][j+length-1])+1; 
						}
						
						
					}
				}
			}
			System.out.println(T[1][m]);
		}
	}
}
