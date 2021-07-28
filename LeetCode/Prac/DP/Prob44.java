package DP;

public class Prob44 {
	
public static boolean isMatch(String s, String p) {
	
	int lenS=s.length();
	int lenP=p.length();
	boolean[][] dp = new boolean[lenP+1][lenS+1];
	
	for(int i=0;i<lenP+1;i++)
	{
		for(int j=0;j<lenS+1;j++)
		{
			if(i==0 && j==0)
			{
				dp[i][j]=true;
			}
			else if(i==0)
			{
				dp[i][j]=false;
			}
			else if(j==0)
			{
				if(p.charAt(i)=='*')
				{
					dp[i][j]=dp[i-1][j];
				}
				else
				{
					dp[i][j]=false;
				}
			}
			else
			{
				if(p.charAt(i)=='?')
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else if(p.charAt(i)=='*')
				{
					dp[i][j]=(dp[i-1][j] || dp[i][j-1]);
				}
				else
				{
					if(p.charAt(i)==s.charAt(j))
					{
						dp[i][j]=dp[i-1][j-1];
					}
					else
					{
						dp[i][j]=false;
					}
				}
				
			}
		}
	}
        return dp[lenP][lenS];
    }

public static void main(String[] args)
{
	isMatch("aa","*");
}

}
