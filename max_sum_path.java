package Trees;

import java.util.ArrayList;


class Node
{
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class max_sum_path {
	Node root;
	static Node target;
	
	public static void main(String args[]){
		
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        
        int sum = computeMaxSum(root);
        System.out.println(sum);
	}

	static int computeMaxSum(Node root) {
		if (root == null)
            return 0;
		ArrayList value = new ArrayList<Integer>();
        getTargetLeaf(root, value, 0);
        return 0;
	}

	private static void getTargetLeaf(Node node, ArrayList value, int current) {
		
		if(node == null){
			return;
		}
		current += node.data;
		if(node.left == null && node.right == null){
				value.add(current);
				target = node;
		}
		
		getTargetLeaf(node.left,value,current);
		getTargetLeaf(node.right, value, current);
		
	}
	
}
