package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prob22 {
	 public static List<String> generateParenthesis(int n,int open,int close,String str, List<String> lst) {
		 
		 if(open==0 && close==0)
		 {
			 lst.add(str);
		 }
		 
		 if(open>0)
		 {
			 generateParenthesis( n, open-1, close, str+"(",  lst);
		 }
		 if(close>open)
		 {
			 generateParenthesis( n, open, close-1, str+")",  lst);
		 }
		 
		return lst;
	        
	    }
	 
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int N=sc.nextInt();
		 List<String> list = new ArrayList<String>();
		 generateParenthesis(N,N,N,"", list);
		 System.out.println(list);
	 }

}
