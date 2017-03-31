package Trees;

import java.util.Stack;

import Trees.Find_Ancestor.Node;

public class AllAncestorsIterative {

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
		
	     allAncestorsIterative(root,9);
	}
	
	public static void allAncestorsIterative(Node root, int data){
		
		if(root == null){
			
			return ;
		}
		
		Stack<Node> s = new Stack<Node>();
		
		while(root!= null){
			
			s.push(root);
			root= root.left;
		}
		
		while(!s.isEmpty()){
			
			root = s.peek();
			
			root= root.right;
			
			while(root!= null){
			
				s.push(root.left);
				root = root.left;
			}
			s.pop();
			printStack(s);
			
		}
	}
	
	public static void printStack(Stack s){
		
		Node a[] = new Node[s.size()];
		int i=0;
		while (!s.isEmpty()){
			
			a[i] =  (Node) s.pop();
			System.out.println(a[i].data);
			i++;
		}
		
		for(int j=a.length-1;j>=0;j--){
			
			s.push(a[j]);
			
		}
	}
}
