//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int A[], int n)
    {
       int j = 0;
        for(int i = 0; i < n; i++)
        {
           if (A[i] <= 0)  
           {
                int t = A[i];
               A[i] = A[j];
               A[j] = t;
               j++;  
           }
        } 
        // arr2 to store only the +ve integer.
         int N= n-j;
        int arr2[] = new int[N];
        int k=0;
        for(int i=j;i<n;i++)
        {
            arr2[k++] = A[i];
        }
        // for(int x: arr2)
        // System.out.println(x+" ");
        
       // final logic
       for(int i = 0; i < N; ++ i) {
      
        //ignoringm num > N for OOB condition 
           if(Math.abs(arr2[i]) -1 < N && arr2[Math.abs(arr2[i])-1]>0)
           {
               arr2[Math.abs(arr2[i])-1] = -arr2[Math.abs(arr2[i])-1];
           }
                
       }
       for (int i = 0; i < N; ++i) {
            if (arr2[i]>0) {
                return i + 1;
            }
        }

        return N + 1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends