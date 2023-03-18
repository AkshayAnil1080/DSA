//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getDistinctDifference(N, A);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


// class Solution {
//     public static ArrayList<Integer> getDistinctDifference(int n, int[] A) {
//         // code here
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         Set<Integer> s1= new HashSet<>();
//           Set<Integer> s2= new HashSet<>();
           
//         for(int i=0; i<n; i++)
//         {
           
//             for(int j=i+1; j<n; j++)
//             {
//                 s2.add(A[j]);
//             }
//             al.add(s1.size()- s2.size());
//             s2.clear();
//             s1.add(A[i]);
            
//         }
//         return al;
//     }
// }
    
    
    
class Solution {
    public static ArrayList<Integer> getDistinctDifference(int n, int[] A) {
        // code here
        
        Map<Integer, Integer> x = new HashMap<>();
         Map<Integer, Integer> y = new HashMap<>();
         for(int i=0; i<n; i++)
         y.put(A[i], y.getOrDefault(A[i],0)+1);
         
         ArrayList<Integer> al = new ArrayList<Integer>();
          for(int i=0; i<n; i++)
          {
              //decrese count of curr ele from y
              y.put(A[i], y.get(A[i])-1);
              //if becomes 0 remove its existence
              if(y.get(A[i])==0) y.remove(A[i]);
              
              int curr_ans = x.size()-y.size();
              al.add(curr_ans);
              
              //place this curr_ele in left to help process for next tr
               x.put(A[i], x.getOrDefault(A[i],0)+1);
          }
        
        return al;
       
    }
}    
