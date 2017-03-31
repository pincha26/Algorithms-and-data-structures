package amazon;

public class reverseLinkedlist {

	 class Node {
	     int data;
	     Node next;
	  }
	 
	Node Reverse(Node head) {

	    Node t1=null;
	    Node t2;
	    Node t3=null;
	    
	    t2=head;
	    while(t2!= null){
	        
	        t3 = t2.next;
	        t2.next = t1;
	        t1 = t2;
	        t2 = t3;
	    }
	    
	    head=t1;
	    return head;
	}
	
}
