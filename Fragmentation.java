package Bloomberg;

import java.util.Scanner;

public class Fragmentation {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		long[] fileSize = new long[n]; 
		
		for(int i =0;i<n;i++){
			
			fileSize[i] = sc.nextLong();
			
		}
		long C = sc.nextLong(); 
		
		long totalUsed = 0;
		long temp=0;
		for(int i=0;i<n;i++){
			
			if(fileSize[i]==0){
				
			}
			else if(fileSize[i]<=C){
				totalUsed = C +totalUsed;
			}
			else{
				temp=fileSize[i]/C;				
				if(fileSize[i]%C==0){
					totalUsed = totalUsed+C*(temp);
				}
				else{
					totalUsed = totalUsed+C*(temp+1);
				}
			}
		}
		System.out.println(totalUsed);
		
		
	}
}
