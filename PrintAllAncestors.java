package Trees;

import Trees.PostOrderUsingIteration.Node;

public class PrintAllAncestors {

	static class Node{
		
		int data ;
		Node left;
		Node right;
		
		public Node(int data){
			
			this.data=data;
			this.left = null;
			this.right = null;
		}
	}

	static Node root = null;

	public static void main(String args[]){
		
		 root = new Node(1);
	     root.left = new Node(2);
	     root.right = new Node(3);
	     root.left.left = new Node(4);
	     root.left.right = new Node(5);
	     root.right.left = new Node(6);
	     root.right.right = new Node(7);
	     root.right.left.right = new Node(8);
	     root.right.right.right = new Node(9);
		
	     allAncestors(root,9);
	}

	public static int allAncestors(Node root, int v){
		
		if(root==null){
			return 0;
		}
		if(root.data== v){
			
			return root.data;
		}
		int left =allAncestors(root.left, v);
		
		int right =0;
		
		if(left==0){
			right=allAncestors(root.right, v);
		}
		
		if(left!= 0 || right != 0){
			System.out.println(root.data);
			return root.data;
		}
	
		else return 0;
	}
}
