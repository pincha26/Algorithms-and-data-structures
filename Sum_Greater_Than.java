package Trees;

import Trees.Find_Mirror.Node;

public class Sum_Greater_Than {

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
		
		update(root);
		
		//System.out.println(diameter(root));
		
	}
	
	static int sum =0;
	
	public static void update(Node n){
		
		if(n==null){
			return ;
		}
		
		update(n.right);
		
		sum = n.data+ sum;
		n.data =sum;
		
		update(n.left);
		
	}
	
}
