package Trees;


public class kth_smallest_element {
	
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
		
		root = new Node(40);
		root.left = new Node(20);
		root.left.left = new Node(5);
		root.left.left.left = new Node(1);
		root.right = new Node(60);
		root.right.left = new Node(50);
		
		kthSmallest(root);
		
	}
	static int count =0;
	public static int kthSmallest(Node root){
		
		if(root == null){
			
			return 0;
		}
		
		int c =0;
		if(root.left!= null){
			c= kthSmallest(root.left);
		}
		c++;
		
		if(root.right!= null){
			kthSmallest(root.right);
		}
		return 0;
	}
	
}
