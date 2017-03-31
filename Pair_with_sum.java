package Trees;

import java.util.Arrays;

import Trees.Find_Ancestor.Node;

public class Pair_with_sum {

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
		
		root = new Node(10);
		root.left = new Node(8);
		root.left.left = new Node(6);
		root.right= new Node(15);
		root.right.left= new Node(12);
		root.right.right= new Node(16);
		
		System.out.print(findSum(root.left,root.right,12));
		
		//System.out.println(diameter(root));
		
	}
	
	public static boolean findSum(Node n1, Node n2, int data){
		
		
		if(n1==null || n2==null){
			return false;
		}
		
		if(n1.left == null && n2.right == null){
			return true;
		}
		else if(n1.left==null){
			
			findSum(n1,n2.right,data);
		}
		else if(n2.right==null){
			
			findSum(n1.left,n2,data);
		}
		else{
			
			findSum(n1.left,n2.right,data);
			
		}
		
		if(n1.data +n2.data == data){
			
			return true;
		}
		else if(n1.data + n2.data >data){
			
			findSum(n1,n2.left,data);
		
		}
		
		String a = "maulik";
		
		char[] c= a.toCharArray();
		
		Arrays.sort(c);
		
		
	
		return false;
		
		
	}
	
}
