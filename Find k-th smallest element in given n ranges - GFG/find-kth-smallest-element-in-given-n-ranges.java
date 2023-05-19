//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            int range[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                range[i][0]=Integer.parseInt(s[0]);
                range[i][1]=Integer.parseInt(s[1]);
            }
            int q=Integer.parseInt(in.readLine().trim());
            int Q[]=new int[q];
            String s[]=in.readLine().trim().split(" ");
            for(int i=0;i<q;i++){
                Q[i]=Integer.parseInt(s[i]);
            }

            Solution ob=new Solution();
            ArrayList<Integer> ans=ob.kthSmallestNum(n, range, q, Q);

            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    } 
}
// } Driver Code Ends

 class Interval
    {
    	int a;
    	int b;
    	public Interval(int a,int b)
    	{
    	    this.a=a;
    	    this.b=b;
    	}
    }

class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        // code here
        
        //store the points in custom data structure
       Interval arr[]=new Interval[n];
        for(int i=0;i<n ; i++){
           arr[i] = new Interval(range[i][0],range[i][1]);
        }
        //pt till the intervals are merged.
         int index = mergeIntervals(arr);
         
          ArrayList<Integer> ans=new ArrayList<>();
           for(int i = 0 ; i < queries.length; i++){
            int res = find_kth(arr, queries[i], index);
            ans.add(res);
           }
        
          return ans;   
    }
    
        static int find_kth(Interval arr[], int k, int index){
        int ans=-1;
         for (int j = 0; j <=index; j++)
        {
            if (k <= Math.abs(arr[j].b - arr[j].a + 1)){
                ans = (arr[j].a + k - 1);
                break;
            }
 
            k = k - Math.abs(arr[j].b - arr[j].a + 1);
        }
        return ans;
        
    }
    
    static int  mergeIntervals(Interval arr[])
	{
	   ArrayList<Interval> al=new ArrayList<>();
	    Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.a - i2.a;
            }
        });
   
        int index = 0;
       
        for (int i=1; i<arr.length; i++)
        {
            if (arr[index].b >=  arr[i].a)
            {
                arr[index].b = Math.max(arr[index].b, arr[i].b);
            }
            else {
                index++;
                arr[index] = arr[i];
            }   
        }
         
        // for (int i = 0; i <=index; i++)
        // {
        //     System.out.print("[" + arr[i].a + ","
        //                                 + arr[i].b + "]");
        // }
        return index;
	}
}
        
