package Trees;

import Trees.height_bt.Node;

public class Tree_From_inorder_preorder {

	public static class Node{
		
		int data ;
		Node left = null;
		Node right = null;
		
		Node(int data){
			this.data= data;
			
		}
}
	
	
	public static void main(String args[]){
		
		int[] inorder = {7,8,4,1,6,2,5};
		int[] preorder = {1,4,7,8,2,6,5} ;
		
		Node root = new Node(preorder[0]);
		
		for(int i =0;i< preorder.length;i++){
			
			makeTree(root,preorder[i]);
			
		}
		
		
	}
	
	public static void makeTree(Node n,int value){
		
		
		
		
		
	}
}
