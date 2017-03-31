package Trees;

import Trees.VerticalOrderSum.Node;

public class SumTree {
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
		
	     sumTree(root);
	     
	     System.out.println(root.data);
	}
	
	public static int sumTree(Node root){
		
		if(root==null){
			return 0;
		}
		
		if(root.left == null && root.right == null){
			int prev = root.data;
			root.data = 0;
			return prev;
		}
		
		int prev = root.data;
		
		root.data = sumTree(root.left) +sumTree(root.right);
		
		return prev + root.data;
	}
}
