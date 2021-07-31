package DP;

public class Prob45 {
	
	 public static int jump(int[] nums) {
		 int len=nums.length;
		 
		 int[] dp =new int[len];
		 
		 dp[len-1]=0;
		 
		 for(int i=len-2;i>=0;i--)
		 {
			 
			 int min=Integer.MAX_VALUE;
			 int end=i+nums[i];
			 
			 for(int j=i+1;(j<=end&& j<len);j++)
			 {
				 if(dp[j]==0 && j+1!=len)
				 {
					 continue;
				 }
				
				 if(min>dp[j])
				 {
					 min=dp[j];
				 }
				 
			 }
			 if(min!=Integer.MAX_VALUE)
			 {
				 dp[i]=min+1;
			 }
			 
		 }
		 return dp[0];
	        
	    }
	 public static void main(String[] args)
	 {
		 int[] nums={2,3,0,1,4};
		 System.out.println(jump(nums));
	 }

}
