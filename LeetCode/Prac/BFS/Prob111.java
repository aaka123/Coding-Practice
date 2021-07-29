package BFS;

public class Prob111 {
public int minDepth(TreeNode root) {
	
	if(root==null)
	{
		return 0;
	}
	
	if(root!=null && root.left==null && root.right==null)
	{
		return 1;
	}
	if(root.left==null)
		return minDepth(root.right)+1;
	
	if(root.right==null)
		return minDepth(root.left)+1;
	
	
	
	
	int leftD=minDepth(root.left)+1;
	int rightD=minDepth(root.right)+1;
	
	if(leftD>rightD)
	{
		return rightD;
	}
	
	return leftD;
        
    }


}
