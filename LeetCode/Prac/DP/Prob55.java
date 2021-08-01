package DP;

public class Prob55 {
public boolean canJump(int[] nums) {
	
	int len=nums.length;
	int[] dp=new int[len];
	dp[len-1]=1;
	
	for(int i=len-2;i>=0;i--)
	{
		int end=nums[i]+i;
		for(int k=i;(k<end && k<len);k++)
		{
			if(dp[k]!=0)
			{
				dp[i]=1;
			}
			
		}
	}
	
	if(dp[0]!=0)
	{
		return true;
	}
	return false;
        
    }

}
