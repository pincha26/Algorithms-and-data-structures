package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NextLargestNum {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int temp = num;
		
		while(temp>0){
			
			array.add(temp%10);
			temp = temp/10;
		}
		Collections.reverse(array);
	
	
		int f=0;
		int i =0;
		for(int j=array.size()-1;j>=1;j--){
		
			int last = array.get(j);
			for(i=j-1;i>=0;i--){
				
				if(array.get(i)<last){
					
					int t = array.get(i);
					array.set(i, last);
					f=1;
					array.set(j,t);
					break;	
				}
			}
			if(f==1){
				break;
			}
			
		}
		ArrayList<Integer> res  =new ArrayList<Integer>();
		for(int j = i+1;j<array.size();j++){
			
			res.add( array.get(j));
			
		}
		res.sort(null);
		
		for(int k =0; k< res.size();k++){
			
			array.set(i+1, res.get(k));
			i=i+1;
		}
		
	}
}
