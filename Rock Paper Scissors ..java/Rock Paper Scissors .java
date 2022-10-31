



import java.util.*;

import java.lang.*;

import java.io.*;





class Codechef

{

	public static void main (String[] args) throws java.lang.Exception

	{



		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int t=Integer.parseInt(br.readLine());

		while(t-->0){

		    int n=Integer.parseInt(br.readLine());

		    char ch[]=br.readLine().toCharArray();

		    int dp[][]=new int[n][3];

		   
		    int r=-1;

		    int p=-1;

		    int s=-1;

		    int i;

		    for(i=n-1;i>=0;i--){

		        if(ch[i]=='P'){

		            p=i;

		        }

		        else if(ch[i]=='S'){

		            s=i;

		        }

		        else{

		            r=i;

		        }

		        dp[i][0]=r;

		        dp[i][1]=s;

		        dp[i][2]=p;

		    }

		    char ans[]=new char[n];

		    ans[n-1]=ch[n-1];

		    for(i=n-2;i>=0;i--){

		        if(ch[i]=='P'){

		            if(ch[i+1]=='P'||ch[i+1]=='S'){

		                ans[i]=ans[i+1];

		            }

		            else{

		                if(dp[i][1]==-1){

		                    ans[i]='P';

		                    

		                }

		                else{

		                    ans[i]=ans[dp[i][1]];

		                }

		            }

		            

		        }

		        else if(ch[i]=='R'){

		            if(ch[i+1]=='R'||ch[i+1]=='P'){

		                ans[i]=ans[i+1];

		            }

		            else{

		                if(dp[i][2]==-1)

		                ans[i]='R';

		                else{

		                    ans[i]=ans[dp[i][2]];

		                }

		            }

		            

		        }

		        else{

		            if(ch[i+1]=='S'||ch[i+1]=='R'){

		                ans[i]=ans[i+1];

		            }

		            else{

		                if(dp[i][0]==-1)

		                ans[i]='S';

		                else{

		                    ans[i]=ans[dp[i][0]];

		                }

		            }

		            

		        }

		    }

		    System.out.println(new String(ans));

		}

	}

}

