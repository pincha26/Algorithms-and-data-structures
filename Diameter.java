package Trees;

import Trees.Connect_Each_Level_BinaryT.Node;

public class Diameter {

	public static class Node{
		
		int data ;
		Node left = null;
		Node right = null;
		Node next = null;
		
		Node(int data){
			this.data= data;
			
		}
	}
	
	static Node root;
	public static void main(String args[]){
		
		root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.left.left = new Node(33);
		root.left.left.left.left = new Node(34);
		root.right= new Node(5);
		
		
		System.out.println(diameter(root));
		
	}
	
	 /* Complete the function to get diameter of a binary tree */
    static int diameter(Node node)
    {
    	
    	if(node==null){
    		return 0;
    	}
    
    	int left = height(node.left);
    	int right = height(node.right);
    	int current =left + right +1;
    	
    	int left_sub=diameter(node.left);
    	int right_sub=diameter(node.right);
    	
    	int m = Math.max(left_sub, current);
    	
    	return Math.max(m, right_sub);
    }
    
    static int height(Node root) {
		
		if(root == null){
			
			return 0;
		}
		int h= 0;
		if(root.left==null && root.right==null){
			h = 1;
		}
		else{
			h = height(root.left) +1;
		
		h = Math.max(h, height(root.right)+1);
		}
		
		return h;
	}
    
}
