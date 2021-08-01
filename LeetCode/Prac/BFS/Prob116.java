package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Prob116 {
	 public static Node connect(Node root) {
		 Node save_node=root;
		 Node dummy=new Node(-1, null,null, null);
		 
		 Queue<Node> q=new LinkedList<Node>();
		 q.add(root);
		 q.add(dummy);
		 Node old=root;
		 
		 while(!q.isEmpty())
		 {
			 Node node=q.poll();
			 if(node==dummy && q.isEmpty())
			 {
				 break;
			 }
			 
			 if(node!=old)
			 {
				if(node==dummy)
				{
					old.next=null;
					old=null;
				}
				else if(old!=null)
				{
					old.next=node;
					old=node;
				}
				else
				{
					old=node;
				}
			 }
			
			 if(node==dummy)
			 {
				 q.add(dummy);
			 }
			 else
			 {
				 q.add(node.left);
				 q.add(node.right);
			 }
		 }
		return save_node;
	        
	    }
	 public static void main(String[] args)
	 {
	 	Node root=new Node(1);
	 	 root.left=new Node(2);
	 	 root.right=new Node(3);
	 	 connect( root);
	 }

}


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}