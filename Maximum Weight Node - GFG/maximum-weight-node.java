//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.maxWeightCell(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int maxWeightCell(int N, int Edge[]){
       
       
       // s1
      int wt[] = new int[N];
      for(int i=0 ; i<N; i++)
      {
          if(Edge[i]!=-1)
          wt[Edge[i]] +=i;
      }
      
      // s2 
      int max_wt = -1; int max_wt_idx=-1;
      for(int i=0; i<N; i++)
      {
          if(wt[i] >=max_wt) //== If there are multiple cells with the maximum weight return the cell with highest index.
          {
              max_wt=  wt[i];
              max_wt_idx =i;  
          }
      }
      return max_wt_idx;
       
    }
}