package Trees;

import java.util.Stack;

import Trees.Inorder_iterative.Node;

public class PostOrderUsingIteration {

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
		
	     PostOrder(root);
	}
	
	public static void PostOrder(Node root){
		
		if(root== null){
			return ;
		}
		
		Stack<Node> s = new Stack<Node>();
		
		while(root!=null){
			
			s.push(root);
			root = root.left;
			
		}
		while(root!=null){
			
			root = s.pop();
			
			if(root.right!=null){
				root = root.right;
				
				while(root!=null){
					
					s.push(root);
					root = root.left;
				}
			}
		}
		
		
		
		
		
		
	}
}
