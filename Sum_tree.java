package amazon;

public class Sum_tree {

	public static void main(String args[]){
		
		int[] pre = {10,-2,8,-4,6,7,5};
		int[] inorder = {8,-2,-4,10,7,6,5};
	
		int[] result= new int[pre.length];
		
		for(int i=0;i< pre.length;i++){
			int sum=0;
			int flag =1;
			for(int j=0;j< pre.length;j++){
				
				if(inorder[j]==0&& flag==0){
					result[i] = sum;
					break;
				}
				
				if(inorder[j]==pre[i]){
					flag=0;
					inorder[j] =0;
				}
				if(inorder[j]!= pre[i] ){
					sum =sum+inorder[j];
				}
				
			}
			result[i] = sum;
			
		}
		
	
	}
	
}
