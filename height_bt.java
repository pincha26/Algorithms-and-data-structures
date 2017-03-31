package Trees;

import Trees.min_sum_bst.Node;

public class height_bt {
	
	public static class Node{
			
			int data ;
			Node left = null;
			Node right = null;
			
			Node(int data){
				this.data= data;
				
			}
	}
	

	public static void main(String args[]){
		
		Node root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.left.left = new Node(33);
		root.left.left.left.left = new Node(14);
		root.right = new Node(5);
		root.right.left = new Node(4);
		root.right.right = new Node(6);
		root.right.right.right = new Node(7);
		
		System.out.println(height(root));
		
	}
	
	static int height(Node root) {
		
		if(root == null){
			
			return 0;
		}
		int h= 0;
		if(root.left==null && root.right==null){
			h = 0;
		}
		else{
			h = height(root.left) +1;
		
		h = Math.max(h, height(root.right)+1);
		}
		
		return h;
	}
	
}


