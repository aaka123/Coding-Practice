package BFS;

public class Prob101 {
public boolean isSymmetric(TreeNode root) {
	
	  return isSymmetric( root.left, root.right);
        
    }

public boolean isSymmetric(TreeNode root1,TreeNode root2) {
	
	if(root1==null && root2==null)
	{
		return true;
	}
	
	if((root1!=null && root2==null) || (root1==null && root2!=null))
	{
		return true;
	}
	if(root1.val==root2.val)
	{
		return  isSymmetric( root1.left, root2.right) && isSymmetric(root1.right, root2.left);
		
	}
	else
	{
		return false;
	}
		
	
	
}

}
  class TreeNod {
     int val;
     TreeNod left;
     TreeNod right;
     TreeNod() {}
     TreeNod(int val) { this.val = val; }
     TreeNod(int val, TreeNod left, TreeNod right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
