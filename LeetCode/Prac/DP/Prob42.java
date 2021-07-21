package DP;

public class Prob42 {
public static int trap(int[] height) {
        
	    int len=height.length;
        int[] left=new int[len];
        int[] right=new int[len];
        int result=0;
        
        left[0]=height[0];
        right[len-1]=height[len-1];
        
        for(int i=1;i<len;i++)
        {
        	left[i]=Math.max(left[i-1], height[i]);
        }
        for(int i=len-2;i>=0;i--)
        {
        	right[i]=Math.max(right[i+1], height[i]);
        }
        
        for(int i=0;i<len;i++)
        {
        	result+=(Math.min(left[i],right[i])-height[i]);
        }
        
        return result;
    }

public static void main(String[] args)
{
	int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
	
	trap(height);
}
}
