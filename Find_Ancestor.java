package Trees;

import Trees.Find_Mirror.Node;

public class Find_Ancestor {

	public static class Node{
		
		int data ;
		Node left = null;
		Node right = null;
		Node next = null;
		
		Node(int data){
			this.data= data;
			
		}
	}
	
	static Node root;
	public static void main(String args[]){
		
		root = new Node(10);
		root.left = new Node(8);
		root.left.left = new Node(6);
		root.right= new Node(15);
		root.right.left= new Node(12);
		root.right.right= new Node(16);
		
		System.out.print(find(root,16,12).data);
		
		//System.out.println(diameter(root));
		
	}

	public static Node find(Node n , int v1,int v2){
		
		if(n==null){
			return null;
		}
		
		if(n.data == v1 || n.data == v2){
			return n;
		}
		
		
		Node n1=find(n.left,v1,v2);
		
		Node n2=find(n.right,v1,v2);
		
		if(n1!= null && n2!= null){
			
			return n;
		}
		
		else if(n1!= null){
			return n1;
		}
		else{
			return n2;
		}
		
	}
	
	
	
	
	
	
}
