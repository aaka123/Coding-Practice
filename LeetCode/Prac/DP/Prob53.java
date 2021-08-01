package DP;

public class Prob53 {

	 public static int maxSubArray(int[] nums) {
		 
		 int i=0;
		 int j=0;
		 int i_t=0;
		 int j_t=0;
		 int sum=nums[0];
		 int sum_t=nums[0];
		 
		 for(int k=1;k<nums.length;k++)
		 {
			 if(nums[k]>nums[k]+sum_t)
			 {
				 i_t=k;
				 j_t=k;
				 sum_t=nums[k];	 				 
			 }
			 else
			 {
				 sum_t+=nums[k];	
				 i_t=k;
			 }
			 
			 if(sum_t>sum)
			 {
				 i=i_t;
				 j=j_t;
				 sum=sum_t;
			 }
			 
		 }
		 
		 int result=0;
		
		 for(int k=j;k<=(i);k++)
		 {
			 result+=nums[k]; 
			
		 }
		
		 return result;
	        
	    }
	 
	 public static void main(String[] args)
	 {
		 int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		 System.out.println(maxSubArray(nums));
	 }
}
