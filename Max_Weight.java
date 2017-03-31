package Trees;

import Trees.Diameter.Node;

public class Max_Weight {
	
	
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
		
		System.out.print(max_weight(root));
		
		//System.out.println(diameter(root));
		
	}
	public static int max_weight(Node n){
		
		if(n== null){
			return 0;
		}
		
		if(n.left==null && n.right==null){
			return n.data;
		}
		int left =  max_weight(n.left);
		int right = max_weight(n.right);
		
		int max = Math.max(left, left + right + n.data);
		 max = Math.max(max, left + right + n.data);
			
		return max;
		
	}
	
}
