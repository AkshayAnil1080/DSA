//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


// class GFG
// {
//     ArrayList<Integer> find(int arr[], int n, int x)
//     {
//         // code here
//         int first=-1, last=-1;
//         for(int i=0; i<n; i++)
//         {
//             if(arr[i]==x)
//             {
//                 if(first==-1)
//                 first=i;
                
//                 last=i;
//             }
//         }
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         al.add(first); al.add(last);
        
//         return al; 
//     }
// }

class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {

     int  first = l_idx(arr, x);
    int last = h_idx(arr,x);
        
         ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(first); al.add(last);
        
        return al; 
        
    }
    int h_idx(int arr[], int x)
    {
        int n = arr.length;
        int idx=-1;
        int low=0; int high=n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
            high = mid-1;
            
            else if(arr[mid]==x)
            {
                idx=mid; low=mid+1;
            }
            
            // if(arr[mid] < x)
            else
            low= mid+1;
            
        }
        return idx;
    }
    
    int l_idx(int arr[], int x)
    {
        int n = arr.length;
        int idx=-1;
        int low=0; int high=n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
            high = mid-1;
            
            else if(arr[mid]==x)
            {
             idx=mid; high=mid-1;
            }
            
            // if(arr[mid] < x)
            else
            low= mid+1;
            
        }
         return idx;
    }
    
}

//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends