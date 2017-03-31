package Hacherrank;

import java.util.Scanner;

public class ArrayShift {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int shift= sc.nextInt();
		
		int[] array = new int[n];		
		
		for(int i=0;i<n;i++){
			array[i]= sc.nextInt();
		}
		
		int[] result = new int[n];
		int temp=0;
		for(int i=0;i<n;i++){
				
			if(array[i]-shift<0){
				temp = array[i]-shift + array.length;
			}
			else{
				temp = array[i]-shift;
			}
			result[temp]= array[i];
		}
		
		for(int i = 0;i<n;i++){
			System.out.print(result[i]+ " ");
		}
	}
}
