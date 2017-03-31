package LinkedList;

import amazon.reverse_rightpart.Node;

public class Check_LL_palindrome_recursion {
	
	public static class Node {
			
			int data;
			Node next;
		    Node(int d){
		    	 
		    	 this.data = d;
		    	 next = null;
		     }
	}
	
	static Node head;
	
	public static void main(String args[]){
		
		 head = new Node(1);
	     head.next = new Node(2);
	     head.next.next = new Node(3);
	     head.next.next.next = new Node(4);
	     head.next.next.next.next = new Node(3);
	     head.next.next.next.next.next = new Node(4);
	     head.next.next.next.next.next.next = new Node(1);
		
	     
	   //  reverse(head);
	   //  reverseEasy(head,null);
	     
	     System.out.println(check(head));
	     
	}
	static Node left = head;
	public static boolean check(Node n){
		
		left = head;
		if(n==null){
			return true;
		}
		boolean b = check(n.next);		
		
		if(b==false){
			return false;
		}
		
		if(left.data == n.data){
			left = left.next;
			return true;
		}
		else{
			return false;
		}
	}
	
	public static Node reverse(Node n ){
		
		if(n==null){
			return n;
		}
		
		if(n.next==null){
			return n;
		}
		
		Node new1= reverse(n.next);
		Node temp = new1;
		
		while(new1.next!=null){
			new1= new1.next;
			
		}
		n.next=null;
		new1.next = n;
		
		return temp;
	}
	
	public static void reverseEasy(Node curr, Node prev){
		
		if(curr.next==null){
			
			head = curr;
			curr.next= prev;
			return;
			
		}
		Node next = curr.next;
		curr.next=prev;
		reverseEasy(next, curr);
		
	}
}
