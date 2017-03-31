package Trees;

import Trees.Max_Weight.Node;

public class Find_Mirror {
	
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
		
		System.out.print(mirror(root.left, root.right));
		
		//System.out.println(diameter(root));
		
	}

	public static boolean mirror(Node n1, Node n2){
		
		if(n1== null && n2==null){
			return true;
		}
		
		if(n1==null || n2==null){
			return false;
		}
		
		boolean left =mirror(n1.left, n2.right);
		
		boolean right =mirror(n1.right,n2.left);
		
		
		
		return (left & right);
		
	}
	
}
