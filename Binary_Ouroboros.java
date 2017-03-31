package Bloomberg;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary_Ouroboros {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		ArrayList<Long> count = new ArrayList<Long>();
		
		
		count.add((long) 0);
		
		for(int i=0;i< N;i++){
			
			for(int j=0;j<count.size(); j++){
				
				if(count.get(j)==1){
					
					count.add(j+1,(long) 0);
					j++;
				}
				else{
					count.add(j+1,(long) 1);
					j++;
				}	
			}
		}
		if(K>count.size()){
			System.out.println(-1);
		}
		else{
			System.out.println(count.get(K-1));
		}
	}
	
}
