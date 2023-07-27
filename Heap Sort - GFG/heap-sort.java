//{ Driver Code Starts
import java.util.*;
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    
}



// } Driver Code Ends

class Solution
{
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i =  n/2 -1 ; i >=0 ; i--)
        {
            heapify(arr , n, i);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int max = i;
         int l = 2*i + 1 ;
         int r = 2*i+ 2;
          // finding the index of larest element among( root, left child , right child)
         if(l<n && arr[l] > arr[i])
         max = l ;
         
         if(r < n && arr[r] > arr[max])
         max = r;
         
         // if index if root(element)  != index of max element - swap the max element with root. to make max heap.
         if(max != i )
         {
             int temp = arr[i];
             arr[i] = arr[max]; 
             arr[max]  = temp;
             
              heapify(arr, n ,max);
         }
        
         
    }
    
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr , n);
        // exchanging the first element with last element and reduce the heap size by 1. then heapify the first element
        for ( int i =  n-1 ;i >0 ; i--)   // arr[0] will be the lasgest here
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i , 0);  // after removing one element the size of heap becomes n-1 ie. i here.
            
        }
    }
 }
 
