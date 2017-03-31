package amazon;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int T =sc. nextInt();
		
		for(int i=0;i<T;i++){
			int n = sc.nextInt();
			int m = sc.nextInt();
		
			int a[] = new int[n];
			int b[] = new int[m];
			
			for(int j=0;j<n;j++){
				
				a[j] =  sc.nextInt();
			}
			
			for(int j=0;j<m;j++){
				
				b[j] =  sc.nextInt();
			}	
			
			int smallLength;
			if(a.length>b.length){
				smallLength = b.length;
			}
			else{
				smallLength= a.length;
			}
			int count = 0;
			int[] result = new int[smallLength];
			for(int j= 0,k=0;j<smallLength && k<smallLength;){
				
				if(a[j]==b[k]){
					result[count] = a[j];
					count++;
					j++;
					k++;
				}
				else if(a[j]<b[k]){
					j++;
				}
				else if(a[j]>b[k]){
					k++;
				}
			}
			int[] sum = new int[count+1];
			count = 0;
			int sumCount =0;
			for(int j=0;j<a.length;j++){
				
				if(a[j]==result[count] || j == (a.length-1)){
					sumCount = a[j] +sumCount;
					sum[count] = sumCount;
					count++;
					sumCount=0;
				}
				else{
					sumCount = a[j] +sumCount;
				}
			}
			count=0;
			for(int j=0;j<b.length;j++){
				
				if(b[j]==result[count] || j == (b.length-1)){
					sumCount = b[j] +sumCount;
					if(sum[count]<sumCount){
						sum[count] = sumCount;
					}
					count++;
					sumCount=0;
				}
				else{
					sumCount = b[j] +sumCount;
				}
				
			}
			int s=0;
			for(int j=0;j< sum.length;j++){
				s = sum[j]+ s;
				
			}
			System.out.println(s);
		}
	}
}
