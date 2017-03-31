package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BST_From_Array {

	
	public static class node{
		
		int data;
		node left;
		node right;
		
		node(int d){
			
			this.data= d;
			this.left= null;
			this.right= null;
		}
		
	}
	static node root =null;
	public static void main(String args[]){
		
		
		int[] array = {10,7,4,3,15,12,18,8};
		
		root = new node(array[0]);
		for(int i =1 ;i< array.length;i++){
			
			insert(root,array[i]);
			
			
		}
		printLevelOrder();
	}
	
	public static void insert(node root,int n){
		
		if(root == null){
			return ;
		}
		
		if(root.right!=null && n>root.data){
			insert(root.right,n);
		}
		else if(root.left!=null && n<root.data){
			insert(root.left,n);
		}
		else if(root.right==null && n>root.data){
		
			
			root.right = new node(n);
		}
		else if(root.left==null && n<root.data){
			root.left = new node(n);
		}
		
	}
	
	public static void printLevelOrder(){
		
		Queue<node> queueA = new LinkedList<node>();
		
		queueA.add(root);
		
		node temp = root;
		while (!queueA.isEmpty()){
			
			temp = queueA.remove();
			System.out.println(temp.data);
			if(temp.left!=null){
				queueA.add(temp.left);
			}
			if(temp.right!=null){
				queueA.add(temp.right);
			}
		}
		
	}
	
}
