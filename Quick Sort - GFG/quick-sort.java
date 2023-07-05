//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if (low < high)
	    {
	         
	        // pi is partitioning index, arr[p]
	        // is now at right place
	        int pi = partition(arr, low, high);
	 
	        // Separately sort elements before
	        // partition and after partition
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
    }
    //lomuto
    static int partition(int arr[], int l, int h)
    {
        // your code here
        int pivot=arr[h];
		int i=l-1;
		
	for( int j=l;j<=h-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				//swap ar[i],arr[j]
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		int t= arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=t;
		
		return i+1;
    } 
   
}