

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int tt=1;
//		
		 tt = sc.nextInt();
//
		while (tt-- > 0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			int cost[][]=new int[n][m];
		
			for(int i=0;i<n;i++) {
			
				for(int j=0;j<m;j++) {
					cost[i][j]=sc.nextInt();
					
				}
			}
			int dis[][]=new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					dis[i][j]=sc.nextInt();
				}
			}
			
			long dp[][]=new long[n][m];
			long min=Long.MAX_VALUE;
			for(int i=0;i<m;i++) {
				dp[0][i]=cost[0][i];
				min=Math.min(min, dp[0][i]);
			}

			for(int i=1;i<n;i++) {
				long curr=Long.MAX_VALUE;
				for(int j=0;j<m;j++) {
					dp[i][j]=Math.min(dp[i-1][j]+Math.max(cost[i][j]-dis[i-1][j],0),min+cost[i][j]);	

					curr=Math.min(curr,dp[i][j]);
					}
				
				min=curr;
		
			}
			
			System.out.println(min);
			
}
		
	
		sc.close();
 }
	
	
	
	
	
		

	 
}
