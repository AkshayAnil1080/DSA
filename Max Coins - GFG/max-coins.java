//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG implements Runnable
{
    public static void main(String args[])throws IOException
    {
        new Thread(null, new GFG(), "whatever", 1<<26).start();
    }
    public void run()
    {
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t=Integer.parseInt(in.readLine());
            while(t-->0){
                int n=Integer.parseInt(in.readLine().trim());
                int a[][]=new int[n][3];
                for(int i=0;i<n;i++){
                    String s[]=in.readLine().trim().split(" ");
                    a[i][0]=Integer.parseInt(s[0]);
                    a[i][1]=Integer.parseInt(s[1]);
                    a[i][2]=Integer.parseInt(s[2]);
                }
                Solution ob=new Solution();
                out.println(ob.maxCoins(n,a));
            }
            out.close();
        }catch(Exception e){
            ;
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    public static int maxCoins(int n,int r[][])
    {
         Arrays.sort(r,new Comparator<int[]>(){
            public int compare(int first[],int second[]){
                if(first[0]==second[0])
                return first[1]-second[1];
                else
                return first[0]-second[0];
            }
        });
        
        int help[] = new int[n]; help[n-1]=r[n-1][2];
        for(int i=n-2; i>=0; i--)
        { 
            help[i] = Math.max(help[i+1], r[i][2]);
        }
        int ans=Integer.MIN_VALUE; int t=0;
        for(int i=0; i<n; i++)
        {
            int l=i+1; int h=n-1;
            int curr_ans= r[i][2];
            while(l<=h)
            {
                int m = (l+h)/2;
                if(r[m][0] >= r[i][1]) //its poss ans and need to search in lower range as well(as coins can be greater there)
                { 
                    curr_ans=Math.max(curr_ans, r[i][2] + help[m]); 
                    h=m-1; 
                }
                else l=m+1;
            }
            ans = Math.max(curr_ans, ans);
        }
       return ans;
        
        
    }
}
