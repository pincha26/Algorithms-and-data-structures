package Trees;

import Trees.height_bt.Node;

public class Top_View {

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
		
		root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.left.left = new Node(33);
		root.left.left.left.left = new Node(14);
		root.right = new Node(5);
		root.right.left = new Node(4);
		root.right.right = new Node(6);
		root.right.right.right = new Node(7);
		
		getView(root,0);
		
	}
	
	public static void getView(Node n,int right){
		
		if(n ==null){
			return ;
		}
		
		if(right==0){
			getView(n.left, right);
			System.out.println(n.data);
		}
		else{
			System.out.println(n.data);
			getView(n.right, right);
		}
		
		if(n==root){
			right=1;
			getView(n.right,right);
		}
	}
}
