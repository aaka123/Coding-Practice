package DP;

public class Prob32 {

	public static int longestValidParentheses(String s) {
		
		int open=0;
		int close=0;
		int result=0;
		for(int i=0;i<s.length();i++)
		{
			 char ch=s.charAt(i);
			 
			 if(ch=='(') {
				 open++;
			 }
			 else {
				 close++;
			 }
			 
			if(open==close)
			{
			 int len=open+close;
			  result=Math.max(len,result);
			  
			}
			else if(close>open)
			{
				close=0;
				open=0;
				
			}
			
		}
		
		open=0;
		close=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			 char ch=s.charAt(i);
			 
			 if(ch=='(') {
				 open++;
			 }
			 else {
				 close++;
			 }
			 
			if(open==close)
			{
			 int len=open+close;
			  result=Math.max(len,result);
			  
			}
			else if(open>close)
			{
				close=0;
				open=0;
				
			}
			
		}
		
		return result;
        
    }

	public static void main(String[] args)
	{
		System.out.println(longestValidParentheses("()(()()"));
	}
}
