package amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Wave_Array {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0 ;i<T;i++){
			
			int n = sc.nextInt();
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			
			for(int j= 0;j<n;j++){
				a.add(sc.nextInt()) ;
			}
			a.sort(null);
			
			for(int j=0;j<n-1;j++){
				
				int t = a.get(j);
				
				a.set(j, a.get(j+1));
				a.set(j+1, t);
				j++;
			}
		
			for(int j=0;j<n;j++){
				System.out.print(a.get(j)+" ");
			}
			System.out.println();
		}
	}	
}
