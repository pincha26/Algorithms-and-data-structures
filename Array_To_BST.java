package Trees;

public class Array_To_BST {
	
	static class Node{
		
		int data ;
		Node left;
		Node right;
		
		public Node(int data){
			
			this.data=data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void main(String args[]){
		
		int a[] = {1,2,3,4,5,6,7,8,9};
	
		BST(a,0,8);
			
	}
	
	public static Node BST(int[] a, int left,int right){
		
		if(left>right){
			
			return null;
		}
		
		int mid =left+right/2;
		
		Node n1= new Node(a[mid]);
		
		n1.left = BST(a,left,mid-1);
		n1.right= BST(a,mid+1,right);
		
		
		return n1;
	}
	
		
}
