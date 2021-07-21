package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Prob102 {
	
public List<List<Integer>> levelOrder(TreeNode root) {
	
	 Queue<TreeNode> q= new LinkedList<>();
	 List<List<Integer>> result=new ArrayList<List<Integer>>();
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 TreeNode dummy=new TreeNode(-1001);
	 q.add(root);
	 q.add(dummy);
	 
	 while(!q.isEmpty())
	 {	 
		 TreeNode roo=q.poll();
		 if(roo==dummy && q.isEmpty())
		 {
			 break;
		 }
		 else if(roo==dummy)
		 {
			 result.add( list);
			 q.add(dummy);
			 list = new ArrayList<Integer>();
		 }
		 else if(roo!=null)
		 {
		   list.add(roo.val);
		   q.add(roo.left);
		   q.add(roo.right);
		 }
	
	 }
	return result;
        
    }

}
/*
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
*/