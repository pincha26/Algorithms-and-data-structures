package Hacherrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Sam_Substring {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String s = n.substring(0,1);
		char[] c = n.toCharArray();
		
		
		 BigInteger sum = new BigInteger("0"); 
		String temp= n;
		long[] sums = new long[c.length];
		
		for(int i = 0;i<c.length;i++ ){
			
			if(i!=0){
			sum = sum.add(BigInteger.valueOf(sums[i-1]));
			}
			for(int j=i;j>=0;j--){
				
				sum = sum.add(BigInteger.valueOf(Long.parseLong(n.substring(i-j,i+1))));
				
			}
		}
		System.out.println((sum.mod((BigInteger.valueOf((long) (Math.pow(10,9)+7))))));
		
	}
}