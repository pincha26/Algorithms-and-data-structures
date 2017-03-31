package Bloomberg;

import java.util.Scanner;

public class Binary {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int start =sc.nextInt();
		int end = sc.nextInt();
		
		int finalResult = 0;
		int left_upper = start;
		
		while(left_upper>=0){
			
			if((left_upper)== end){
				
				finalResult++;
				break;
			}
			else{
				left_upper =left_upper-9;
			}
		}
		
		left_upper = start;
		
		while(left_upper>=8){
			
			if((left_upper)== end){
				
				finalResult++;
				break;
			}
			else{
				left_upper = left_upper -7;
			}
		}
		
		left_upper = start;
		
		while(left_upper<=64){
			
			if((left_upper)== end){
				
				finalResult++;
				break;
			}
			else{
				left_upper = left_upper +9;
			}
		}
		
		left_upper = start;
		
		while(left_upper>=57){
			
			if((left_upper)== end){
				
				finalResult++;
				break;
			}
			else{
				left_upper = left_upper +7;
			}
		}
		
		
		
		
	}
}
