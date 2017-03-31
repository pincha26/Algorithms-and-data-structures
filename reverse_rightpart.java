package amazon;

import java.util.LinkedList;
import java.util.Scanner;

public class reverse_rightpart {
	
	public static class Node {
		
		int data;
		Node next;
	    Node(int d){
	    	 
	    	 this.data = d;
	    	 next = null;
	     }
}

	 
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		

		 Node head = new Node(85);
	     head.next = new Node(15);
	     head.next.next = new Node(4);
	     head.next.next.next = new Node(20);
	     head.next.next.next.next = new Node(10);
	     head.next.next.next.next.next = new Node(8);
 
	     Node n = head;
	     int length =0;
	     while(n != null){
	    	 
	    	 length++;
	    	 n= n.next;
	     }
	     reverse(head,length);
	}

	public static Object reverse(Node head,int l){
		
		int reverseLength = l/2;
		
		Node n = head;
		for(int i=0;i<reverseLength-1;i++){
			n = n.next;	
		}
		
		Node prev= null;
		Node current = n.next;
		Node next =null;
		
		while(current!=null){
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		n.next= prev;
		
		
		return head;
	}
}
