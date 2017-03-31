package LinkedList;

import LinkedList.Check_LL_palindrome_recursion.Node;

public class Find_Sum_2_Array_LL {

	public static class Node {
		
		int data;
		Node next;
	    Node(int d){
	    	 
	    	 this.data = d;
	    	 next = null;
	     }
	}
	static Node head1 = null;
	static Node head2 = null;
	
	public static void main(String args[]){
		
		 head1 = new Node(9);
	     head1.next = new Node(9);
	     head1.next.next = new Node(7);
	     head1.next.next.next = new Node(7);
	  
	     head2 = new Node(1);
	     head2.next = new Node(2);
	     head2.next.next = new Node(3);
	     head2.next.next.next = new Node(4);
	     
	     System.out.println(sum(head1,head2).data);
	}
	
	static int carry = 0;
	
	public static Node sum(Node n1, Node n2){
		
		if(n1==null && n2==null){
			return null;
		}
		
		carry = (n1.data+ n2.data+carry)/10;
		
		Node temp = new Node((n1.data+ n2.data+carry)%10);
		
		temp.next= sum(n1.next,n2.next);
	
		return temp;
		
	}
}
