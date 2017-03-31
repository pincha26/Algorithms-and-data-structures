package Trees;

import java.io.PrintWriter;

import Trees.isBinaryTree.Node;

public class k_distance_nodes {
	
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
		
		root = new Node(4);
		root.left = new Node(2);
		root.left.left = new Node(5);
		root.left.left.left = new Node(1);
		root.right = new Node(7);
		root.right.left = new Node(6);
		
		printNodes(root,3);
	}

	public static void printNodes(Node n,int k){
		
		if(n==null){
			return ;
		}
		
		if(k<0){
			return;
		}
		
		if(k>0){
			k--;
			printNodes(n.left, k);
			printNodes(n.right, k);
		}
		else if(k==0){
			System.out.println(n.data);
		}
	}
}
