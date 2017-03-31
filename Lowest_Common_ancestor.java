package Trees;

import Trees.Top_View.Node;

public class Lowest_Common_ancestor {

	public static class Node{
		
		int data ;
		Node left = null;
		Node right = null;
		
		Node(int data){
			this.data= data;
			
		}
	}
	static Node root = null;

	public static void main(String args[]){
		
		root = new Node(4);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.right = new Node(7);
		root.right.left = new Node(6);
		
		getLCA(root,2,5);
		
	}
	
	public static Node getLCA(Node n, int v1, int v2){
		
		if(n==null){
			return null;
		}
		
		if(v1<n.data && n.data<v2){
			return n;
		}
		else if (n.data>v1 && n.data>v2){
			
			n= getLCA(n.left,v1,v2);
		}
		else if(n.data<v1 && n.data<v2){
			
			n= getLCA(n.right,v1,v2);
		}
		
		return n;
	}
	
}
