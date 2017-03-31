package amazon;

import java.util.Scanner;

import amazon.reverse_rightpart.Node;

public class Segregate_even_odd {

	static Node head = null;
	
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
		
		int T = sc.nextInt();
		
		
		for(int i=0;i<T;i++){
			
			int size = sc.nextInt();
			head =  null;
			Node curr = head;
			for(int j =0;j< size ;j++ ){
				
				int v = sc.nextInt();
				Node new1 = new Node(v);
				
				if(curr == null){
					head = new1;
					curr = new1;
			
				}
				else{
					curr.next= new1;
					curr =curr.next;
				}
				
			}
 
		
	     Node n = head;
	     int length =0;
	     while(n != null){
	    	 
	    	 length++;
	    	 n= n.next;
	     }
	     Node n1= Segregate(head,length);
	     
	     while(n1!=null){
	    	 System.out.print(n1.data + " ");
	    	 n1 =n1.next;
	     }
	     System.out.println();
		}
	}
	
	public static Node Segregate(Node n,int length){
		
		int oddNumber = 0;
		if(n.data%2!= 0){
			oddNumber=1;
		}
		Node insertPointer= n;
		Node prev = n;
		Node current = n.next;
		
		
		while(current!=null){
			
			if((current.data%2)==0 && oddNumber==1){
			
				prev.next= current.next;
				
				if(insertPointer==head){
					n= current;
					current.next = head;
					insertPointer= current;
					
				}
				else{
					current.next= insertPointer.next;
					insertPointer.next=current;
					insertPointer=current;
				}
				prev= current;
				current= current.next;
			}
			else{
				
				if((current.data%2)==0){
					insertPointer = insertPointer.next;
					prev = current;
					current=current.next;
				}
				else{
					oddNumber= 1;
					prev = current;
					current=current.next;
				}
			}
			
		}
		
		
		
		return n;
	}
	
}
