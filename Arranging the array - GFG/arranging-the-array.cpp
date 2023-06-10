//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
#define ll long long

// } Driver Code Ends


class Solution
{
    public:
        void Rearrange(int arr[], int n)
        {
              mergeSort(arr, 0, n-1);
    }
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Same as (l + r)/2, but avoids overflow for
            // large l and h
            int m = l + (r - l) / 2;
     
            // Sort first and second halves
           mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
     
            merge(arr, l, m, r);
        }
    }
    void merge(int arr[], int l, int m, int r)
{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;
 
   
      int L[n1] ;
        int R[n2]; 
  for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];
        
 
  
    i = 0; // Initial index of first subarray
    j = 0; // Initial index of second subarray
    k = l; // Initial index of merged subarray
 
    
 
   
    while (i < n1 && L[i] < 0)
        arr[k++] = L[i++];
 
    while (j < n2 && R[j] < 0)
        arr[k++] = R[j++];
 
    while (i < n1)
        arr[k++] = L[i++];
 
    while (j < n2)
        arr[k++] = R[j++];
}
};



//{ Driver Code Starts.
void Rearrange(int arr[], int n);

int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++)
        cin>>arr[i];
        long long j=0;
        Solution ob;
        ob.Rearrange(arr, n);
      
        for (int i = 0; i < n; i++) 
            cout << arr[i] << " "; 
        cout << endl;  
    }
    return 0; 
} 
// } Driver Code Ends