package BFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Prob103 {
	 public static List<List<Integer>> zigzagLevelOrder(TreeNode root) { Stack<TreeNode> ms=new Stack<TreeNode>();
	 Stack<TreeNode> ch=new Stack<TreeNode>();

	 List<List<Integer>> result=new ArrayList<List<Integer>>();
	 
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 int level=0;
	 
	 ms.push(root);
	 
	 while(!ms.isEmpty())
	 {
		 TreeNode node= ms.pop();
         if(node!=null)
		 {
			 list.add(node.val);
		 }
		
		 
		 if(level%2==0 && node!=null)
		 {
			 ch.push(node.left);
			 ch.push(node.right);
		 }
		 else if(node!=null)
		 {
			 ch.push(node.right);
			 ch.push(node.left);						 
		 }
		 
		 if(ms.isEmpty())
		 {
			 level++;
			 ms=ch;
			 if(!list.isEmpty())
			 result.add(list);
			 list = new ArrayList<Integer>();
			 ch=new Stack<TreeNode>();
		 }
	 }
	return result;
        
    
    }
	 
	 public static void main(String[] args)
	 {
		 TreeNode root=new TreeNode(1);
		 root.left=null;
		 root.right=new TreeNode(2);
		 zigzagLevelOrder( root);
	 }

}

