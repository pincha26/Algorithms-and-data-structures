package Trees;

import java.util.Stack;

import Trees.AllAncestorsIterative.Node;

public class PostOrderTraversal {

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
		
	     postOrder(root);
	}
	
	public static void postOrder(Node root){
		
		if(root==null){
			return ;
		}
		
		Stack<Node> s = new Stack<Node>();
		
		s.push(root);
		
		while(!s.isEmpty()){
		
			if(root.right!= null){
				s.push(root.right);
			}
			
			while(root!=null){
				
				s.push(root);
				root = root.left;
			}
			
			root =s.pop();
			
			if(root.right == s.peek()){
				
				s.pop();
				s.push(root);
				root =root.right;
			}
			else{
				
				System.out.println(root.data);
				root =null;
			}
		}	
			
	}
	
	
}
