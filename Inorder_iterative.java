package Trees;

import java.util.Stack;

import Trees.SumTree.Node;

public class Inorder_iterative {

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
		
	     Inorder(root);
	}
	
	public static void Inorder(Node root){
		
		Stack<Node> stack = new Stack<Node>();
		
		while(root!=null){
			
			stack.push(root);
			root= root.left;
		}
		
		while(stack.size()>0){
			Node poped = stack.pop();
			System.out.println(poped.data);
			
			if(poped.right!=null){
				
				poped =poped.right;
				
				while(poped!=null){
					stack.push(poped);
					poped= poped.left;
					
				}
			}
			
		}
	}
}
