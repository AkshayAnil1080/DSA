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
class Pair{
    int price; int ind;
    Pair(int price, int ind)
    {
        this.price= price;
        this.ind = ind;
    }
}

class Solution {
    ArrayList<Integer> maximumToys(int N, int A[], int Q, ArrayList<Integer> Queries[]){
        
        //s1 list of ele with its ind
         ArrayList<Pair>  arr = new ArrayList<>();
         for(int i =0; i<N; i++)
        {
            arr.add(new Pair(A[i],i));  // 0 based indexing
        }
         
         // s2 sort it acc to ele
         Collections.sort(arr, (a,b) -> a.price - b.price);
         
         //s3
         ArrayList<Integer> ans = new ArrayList<>();
         for(int i=0; i<Q; i++)
         {
             long money = Queries[i].get(0);
             Set<Integer> broken  = new HashSet<>();
             for(int j=2 ; j<Queries[i].size(); j++)
             broken.add(Queries[i].get(j)-1);
             
             //buy toys greedily -> first which has themin value
             int toys_bought=0;
             for(int j=0; j<N && money >= arr.get(j).price; j++)    // runnning in sorted list
             {
                 if(!broken.contains(arr.get(j).ind))  //O(1))
                 {
                     money -= arr.get(j).price;
                     toys_bought++;
                 }
             }
             ans.add(toys_bought);
         }
         return ans;
    }
}