package Trees;

import Trees.Array_To_BST.Node;

public class MinMaxNode {
	
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
		
		getValues(root,0);
		
		
		for(int i=min;i<=max;i++){
			printVerticalOrder(root,i,0);
		}
	}

	static int min =0;
	static int max = 0;
	
	public static void getValues(Node root,int distance){
		
		if(root==null){
			return ;
		}
		if(min>distance){
			min = distance;
		}
		
		if(max<distance){
			max= distance;
		}
		
		getValues(root.left, distance-1);
		getValues(root.right, distance+1);
		
		return ;
	}
	
	public static void printVerticalOrder(Node root , int level, int distance){
		
		if(root==null){
			return;
		}
		if(level==distance){
			System.out.println(root.data);
		}
		printVerticalOrder(root.left, level, distance-1);
		printVerticalOrder(root.right, level, distance+1);
		return;
	}
}
