//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         //0-1 knapsack 
         int[][] dp = new int[n+1][W+1];
         for(int i=1; i<dp.length; i++){
             //[][]-> col is storing the weight
             for(int j=1; j<dp[0].length; j++){
                 //check if current amount is sufficient
                if(j>= wt[i-1]){
                    //if yes, check remaining weight 
                    int remWeight = j - wt[i-1];
                    dp[i][j] = Math.max(dp[i-1][j], val[i-1] + dp[i-1][remWeight]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
             }
         }
         return dp[n][W];
    } 
}


