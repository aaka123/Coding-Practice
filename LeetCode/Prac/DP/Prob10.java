package DP;

public class Prob10 {
 public boolean isMatch(String s, String p) {
        
		 
		 boolean[][] DP=new boolean[p.length()+1][s.length()+1];
		 
		 for(int  i=0;i<=p.length();i++)
		 {
			 for(int j=0;j<=s.length();j++)
			 {
				 if(i==0 && j==0)
				 {
					 DP[i][j]=true;
				 }
				 else if(i==0)
				 {
					 DP[i][j]=false;
				 }
				 else if(j==0)
				 {
					 char c=p.charAt(i-1);
					 
					 if(c=='*')
					 {
						 DP[i][j]=DP[i-2][j];
					 }
					 else
					 {
						 DP[i][j]=false;
					 }					 
				 }
				 else
				 {
					 char cP=p.charAt(i-1);
					 char cS=s.charAt(j-1);
					 
					 if(cP==cS || cP=='.')
					 {
						 DP[i][j]=DP[i-1][j-1];
					 }
					 else if(cP=='*')
					 {
						 DP[i][j]=DP[i-2][j];
						 
						 char ccP=p.charAt(i-2);
						 if(ccP==cS || ccP=='.')
						 {
							 DP[i][j]=DP[i][j-1] | DP[i][j] ;
						 }
						 
					 }
					 else
					 {
						 DP[i][j]=false;
					 }
					 
				 }
				 
			 }
		 }
		 
		 return DP[p.length()][s.length()];
	        
	    
        
    }
}
