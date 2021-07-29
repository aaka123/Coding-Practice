package BFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Prob107 {
	
     public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    	 
    	 Queue<TreeNode> q=new LinkedList<>();
    	 Stack<Integer> st=new Stack<>();
    	 TreeNode dummy=new TreeNode(0);
    	 List<List<Integer>> list =new  ArrayList<List<Integer>>();
    	 q.add(root);
    	 q.add(dummy);
    	 
    	 while(!q.isEmpty())
    	 {
    		 TreeNode node=q.poll();
    		 if(node==dummy && q.isEmpty())
    		 {
    			 break;
    		 }
    		 if(node==dummy)
    		 {
    			 st.add(-1);
    			 q.add(dummy);
    		 }
    		 else if(node!=null)
    		 {
    			
        		 q.add(node.right);
        		 q.add(node.left);
        		 st.add(node.val);
    		 }  		
    		
    	 }
    	 
    	 ArrayList<Integer> li = new ArrayList<Integer>();
    	 
    	 while(!st.isEmpty())
    	 {
    		 int value=st.pop();
    		 if(value==-1)
    		 {
    			list.add(li);
    			li=new ArrayList<Integer>();
    		 }
    		 else
    		 {
    			 li.add(value);
    		 }
    		
    	 }
    	 if(!li.isEmpty())
    	 {
    		 list.add(li);
    	 }
        return list;
    }
     public static void main(String[] args)
	 {
		 TreeNode root=new TreeNode(3);
		 root.left=new TreeNode(9);
		 root.right=new TreeNode(20);
		 levelOrderBottom(root);
	 }

}
