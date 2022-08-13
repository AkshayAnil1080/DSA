// LIS

package dp;

public class LongsetIncreasginSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] ={3, 10, 20, 4, 6, 7};
	        int n = 6;
	        
	        System.out.println(LIS(arr, n));
	}
	
	static int LIS(int arr[],  int n )
	{
		 int[] tail = new int[n]; 
	        int len =1; 
	  
	        tail[0] = arr[0]; 
	        
	        for (int i = 1; i < n; i++) {
	            
	            if(arr[i] > tail[len - 1])
	            {
	                tail[len] = arr[i];
	                len++;
	            }
	            else{
	                int c = ceilIdx(tail, 0, len - 1, arr[i]);
	                
	                tail[c] = arr[i];
	            }
	        } 
	  
	        return len; 
	}

	 static int ceilIdx(int tail[], int l, int r, int key) 
     { 
         while (r > l) {         
             int m = l + (r - l) / 2; 
             if (tail[m] >= key) 
                 r = m; 
             else
                 l = m+1; 
         } 
   
         return r; 
     } 
}
