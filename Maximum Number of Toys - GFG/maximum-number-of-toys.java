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

// TC: nlogn + Q(K + N) > 10^8 : TLE
// TC: 
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
        
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i =0; i<N; i++)
        {
            arr.add(new Pair(A[i],i));
        }
        //sort according to cost
        Collections.sort(arr, (a,b)-> a.price - b.price);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++)
        map.put(arr.get(i).ind, i); // prev ind , new ind
        
        long prefix[] = new long[N+1];
        for(int i=1; i<=N; i++)
        {
            prefix[i]=arr.get(i-1).price +  prefix[i-1] ; // current price (0 based indexing) + prev price 
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<Q; i++)
        {
            // bimary search on prefix sum
            long money = Queries[i].get(0);
            int k = Queries[i].get(1);
            int l=0; int h=N; int answer=0;
            while(l<=h)
            {
                int mid = (l+h)/2;
                if(prefix[mid] <= money)
                //store mid and move ahead to see how much more can we but
                {
                    answer = mid;
                    l=mid+1;
                }
                else
                h=mid-1;

            }
            if(answer==0) // eg 2,5,6 and money is 1
            {
                ans.add(0);
                continue;
            }
            
            // check if prev broken toys are consisdered or not - 
            int idx = answer-1;
            long rem_m = money - prefix[answer];
            HashSet<Integer> broken = new HashSet<>();
            for(int j=0; j<k; j++)
            {
                int d_t_i = map.get(Queries[i].get(j+2)-1); // finding the new indx for old indx
                if(d_t_i <= idx) // comparing - cond that broken toy was considered
                {
                    answer--;  // reduce the nu,ber of toys
                    rem_m += arr.get(d_t_i).price; // increase the rem_m price by the broken toy
                }
                else // add in damanged prod
                {
                    broken.add(d_t_i);
                }
            }
            // pick rest required toys from right of answer idx from already sorted arr
            int s = idx+1;
            while(s<N && rem_m>= arr.get(s).price)
            {
                //if not broken consder it in anwer
                if(!broken.contains(s))
                {
                    answer++;
                    rem_m -= arr.get(s).price;
                }
                s++;
            }
            ans.add(answer);
        } 
        return ans;
    }
}