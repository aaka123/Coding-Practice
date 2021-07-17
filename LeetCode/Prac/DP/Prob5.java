package DP;

/*Given a string s, return the longest palindromic substring in s.*/

public class Prob5 {
public String longestPalindrome(String s) {
        
        int N=s.length();
        boolean[][] flag=new boolean[N][N];
        String result=null;
        
        for(int g=0;g<N;g++)
        {
            for(int i=0, j=g;j<N;j++,i++)
            {
                if(g==0)
                {
                    flag[i][j]=true;
                }
                else if(g==1)
                {
                    flag[i][j]=s.charAt(i)==s.charAt(j);
                }
                else
                {
                    if((s.charAt(i)==s.charAt(j)) && flag[i+1][j-1]==true)
                    {
                        flag[i][j]=true;
                    }
                }
                if(flag[i][j]==true)
                {
                  result=s.substring(i,j+1);
                }
            }
           
            
        }
       return result;
        
    }

}
