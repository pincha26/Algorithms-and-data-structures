package Trees;


public class min_sum_bst {

	public static class Node{
		
		int data ;
		Node left = null;
		Node right = null;
		
		Node(int data){
			this.data= data;
			
		}
		
		
	}
	
	Node head ;
	
	public static void main(String args[]){
		
		Node root = new Node(-10);
		
		root.left = new Node(-2);
		root.left.left = new Node(-8);
		root.left.right = new Node(-4);
		
		root.right = new Node(-7);
		
		System.out.println(minSum(root));
	}
	
	public static int minSum(Node n){
		
	/*	if(n==null){
			
			return 0;
		}
		int sum =0;
		sum = minSum(n.left);
		
		if(minSum(n.right)!=0){
			
		sum = Math.min(sum, minSum(n.right));
		}
		
		sum = sum+ n.data;
		return sum;
	*/
		   if(n == null)
		        return 0;

		    int sum = n.data;

		    int left_sum = minSum(n.left);
		    int right_sum = minSum(n.right);

		    if(left_sum <= right_sum)
		        sum += minSum(n.left);
		    else
		        sum += minSum(n.right);

		    return sum;
		
	}
}
