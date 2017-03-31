package strings;

import java.util.Arrays;
import java.util.HashMap;

import LinkedList.Find_Sum_2_Array_LL.Node;

public class Group_Anagrams {

	public static class Node {
		
		int data;
		Node next;
	    Node(int d){
	    	 
	    	 this.data = d;
	    	 next = null;
	     }
	}
	
	public static void main(String args[]){
		
		String[] s = {"abcde","mno", "edcba", "gh", "nom"};
		
		for(int i=0;i< s.length;i++){
			
			char[] c = s[i].toCharArray();
			
			Arrays.sort(c);
			
			s[i] = String.valueOf(c);
			
		}
		
		Arrays.sort(s);
		System.out.println(s);
		
	}
	
	
}
