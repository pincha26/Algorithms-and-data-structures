package Bloomberg;

import java.util.Scanner;

public class Chocalate_Fix {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int prize = sc.nextInt();
		int wrapperCount = sc.nextInt();
		int friendCount = sc.nextInt();
		
		long[] amount = new long[friendCount];
		
		for(int i=0 ;i< friendCount;i++){
			
			amount[i]= sc.nextInt();
			
		}
		
		for(int i=0;i<friendCount;i++){
			
			long totalChocalates =amount[i]/prize;
			
			long wrapperTemp = totalChocalates;
			
			long reminder =0;
			while(wrapperTemp >=wrapperCount){
				
				totalChocalates = totalChocalates + wrapperTemp/wrapperCount;
				reminder = wrapperTemp%wrapperCount;
				
				wrapperTemp = wrapperTemp/wrapperCount + reminder ;
			}
			System.out.println(totalChocalates);
		}
		
		
		
	}

}
