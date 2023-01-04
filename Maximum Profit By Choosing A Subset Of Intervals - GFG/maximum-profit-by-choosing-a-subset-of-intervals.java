//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[][] intervals = IntMatrix.input(br, n, 3);

            Solution obj = new Solution();
            int res = obj.maximum_profit(n, intervals);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution{
    public static int maximum_profit(int n, int[][] intervals) {
        //step 1
        Arrays.sort(intervals, new Comparator<int []>(){
            public int compare(int [] a1, int [] a2){
                if(a1[0] == a2[0]){ // if start is same
                    if(a1[1] == a2[1]) // and end is also same
                        return a1[2] - a2[2];  // sort according to profit value;
                        
                    return a1[1] - a2[1];   //else start != end - increasing order of end pt
                }
                //else
                return a1[0] - a2[0];
            }
        });
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(0, n, intervals, dp); // max profit
    }
    //step 2
     static int solve(int index, int n, int [][] intervals, int []dp) {
        if (index >= n) {
            return 0;
        }

        // `dp[index]` stores the maximum profit one can get by choosing
        // non-overlapping intervals from `index` to `n - 1`.
        if (dp[index] != -1) {
            return dp[index];
        }

        int answer = solve(index + 1, n, intervals, dp); //take it and search for its desired palce
        int new_index = bs(index + 1, n - 1, intervals[index][1], n, intervals);  // by Binary Search
        // range of search, the value to be searchde, size of arr, array where search to be performed.
        
        //store the max poss ans.
        answer =
            Math.max(answer, intervals[index][2] +
                            solve(new_index, n, intervals, dp)); //  perform the BS for new index we got
                            

        return dp[index] = answer;
    }
    
    //step 3
     static int bs(int start, int end, int value, int n,   int [][]intervals) {
        // find nearest - cons -  from newstart >= prevendpt
        // If nothing found, position will be n.
        int position = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (intervals[mid][0] >= value) {
                position = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return position;
    }

}