package Trees;

import Trees.Lowest_Common_ancestor.Node;

public class isBinaryTree {

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
		root.right = new Node(7);
		root.right.left = new Node(6);
		
		System.out.println(checkBST(root));
		
	}
    static boolean checkBST(Node root) {
        return isValidBST(root, Integer.MIN_VALUE,
            Integer.MAX_VALUE);
  		
      }
  private static boolean isValidBST(Node node, int MIN, int MAX) {
       if(node == null)
           return true;
       if(node.data > MIN 
           && node.data < MAX
           && isValidBST(node.left, MIN, node.data)
           && isValidBST(node.right, node.data, MAX))
           return true;
       else 
           return false;
  }
}
