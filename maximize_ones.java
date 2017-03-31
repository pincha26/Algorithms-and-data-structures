package amazon;

import java.util.Scanner;

public class maximize_ones {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0;i<n ; i++){
			
			array[i]= sc.nextInt();
			
		}	
		int m =sc.nextInt();
		
		int temp=0 ;
		int counter=0;
		int m_temp = m;
		int max = 0;
		
		for(int i= 0 ;i< n ;i++){
			
			if(array[i]==0){
				
				if(m_temp ==0){
						
					while(array[temp]!=0){
						temp++;
						counter--;
					}
					temp++;
					
				}else{
					
					counter =counter +1;
					m_temp--;
				}
				
			}
			else{
				counter = counter +1 ;
			}
			if(counter>max){
				max = counter ;
			}
		}
		System.out.println(max);
		
		
	}
}
