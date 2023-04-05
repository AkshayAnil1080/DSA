//{ Driver Code Starts
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
        int t = sc.nextInt(); // Inputting the testcases
        PrintWriter out = new PrintWriter(System.out);
        while (t-- > 0) {

            int i = 0;
            int N = sc.nextInt();

            int arr[] = new int[(int)(N)];

            for (i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            out.println(ob.countSpecialNumbers(N, arr));
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int countSpecialNumbers(int n, int arr[]) {
        // Code here
        
         Map<Integer, Integer> freq = new HashMap<>();
          HashSet<Integer> uniq = new HashSet<Integer>();
          int max = 0;
          for (int i = 0; i < n; i++) 
         {
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
             uniq.add(arr[i]);
             max = Math.max(arr[i], max);
        }
        
         //for every uniq num ,we are going till max in incremental format(M)
         HashSet<Integer> special= new HashSet<Integer>();
        for(int z : uniq) //n
        {
            for (int i = 2 * z; i <= max;  i+= z)  //sieve
                    if (uniq.contains(i)) 
                    special.add(i);

        }
        
        
         int ans=0;
          for (Map.Entry<Integer, Integer> x : freq.entrySet()) 
          {
            if (x.getValue() > 1) 
                ans += x.getValue();
                
            else if (special.contains(x.getKey()))
                ans++;

          }
         
        return ans; 
    }
}