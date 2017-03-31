package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Find_set_anagrams {

	public static void main(String args[]){
		

		String a[] = new String[7];
		
		
		a[0]= "abcde";
		a[1]= "xyz";
		a[2]= "cdbea";
		a[3]= "yzx";
		a[4]= "mnop";
		a[5]= "pnmo";
		a[6]= "wy";
		
		int index[] ={0,1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++){
			
			char[] ar = a[i].toCharArray();
			Arrays.sort(ar);
			String sorted = String.valueOf(ar);
			a[i] = sorted;
			
		}
		String tempVar;
		int tempInt;
		   for (int i = 0; i < a.length; i++)
	        {
	                 for(int j = i+1; j < a.length; j++)
	                 {
	                         if(a[i].compareTo(a[j])>0)
	                         {
	                        	 
	                        	 tempInt = index [j ];
		                         index [j ]= index [i];
		                         index [i] = tempInt;
		                         
		                         tempVar = a [j ];
		                         a [j ]= a [i];
		                         a [i] = tempVar;
	                         }
	                 }
	        }	   
	}
}
