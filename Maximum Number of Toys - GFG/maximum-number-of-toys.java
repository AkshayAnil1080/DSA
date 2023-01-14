//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();        
        PrintWriter out = new PrintWriter(System.out);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            for(int i = 0; i < N; i++) A[i] = sc.nextInt();
            int Q = sc.nextInt();
            ArrayList<Integer> Queries[] = new ArrayList[Q];
            for(int i = 0; i < Q; i++){
                Queries[i] = new ArrayList<>();
                int x = sc.nextInt(), y = sc.nextInt();
                Queries[i].add(x);
                Queries[i].add(y);
                for(int j = 0; j < Queries[i].get(1); j++){
                    x = sc.nextInt();
                    Queries[i].add(x);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.maximumToys(N, A, Q, Queries);
            for(int x : ans)
                out.print(x + " ");
            out.print("\n");
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int fr[];
    
    class tree{
        int N;
        long bit[];
        tree(int N){
            this.N = N;
            bit = new long[N];
        }
        
        void add(int node, int v){
            for(;node<N;node+=(node&(-node)))
                bit[node]+=v;
        }
        
        long get(int node){
            long x = 0l;
            for(;node>0;node-=(node&(-node)))
                x+=bit[node];
            return x;
        }
    }
    
    ArrayList<Integer> maximumToys(int N, int A[], int Q, ArrayList<Integer> Queries[]){
        ArrayList<Integer> res = new ArrayList<>();
        fr = new int[1000 * 1000 + 5];
        for(int x : A) fr[x]++;
        tree obj1 = new tree(1000 * 1000 + 5);
        tree obj2 = new tree(1000 * 1000 + 5);
        for(int i=0;i<A.length;i++){
          obj1.add(A[i],A[i]);
          obj2.add(A[i],1);
        }
        for(ArrayList<Integer> i :Queries){
            long C=i.get(0);
            for(int j=2;j<i.size();j++){
                obj1.add(A[i.get(j)-1],-A[i.get(j)-1]);
                obj2.add(A[i.get(j)-1],-1);
            }
            int lw=1,hg=1000 * 1000;
            int pos=1000 * 1000;
            while(lw<=hg){
                int mid=lw + (hg - lw)/2;
                if(obj1.get(mid)>=C){
                    pos=mid;
                    hg=mid-1;
                }
                else{
                    lw=mid+1;
                }
            }
            long ans = obj2.get(pos - 1);
            long mx=Math.min((C-obj1.get(pos-1))/pos,(long)fr[pos]);
            ans+=mx;
            res.add((int)ans);
            for(int j=2;j<i.size();j++){
                obj1.add(A[i.get(j)-1],A[i.get(j)-1]);
                obj2.add(A[i.get(j)-1],1);
            }
        }
        return res;
    }
}