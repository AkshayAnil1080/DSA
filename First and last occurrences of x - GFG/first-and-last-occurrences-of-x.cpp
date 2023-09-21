//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

// class Solution
// {
//     public:
//     vector<int> find(int arr[], int n , int x )
//     {
//          int first=-1, last=-1;
//         for(int i=0; i<n; i++)
//         {
//             if(arr[i]==x)
//             {
//                 if(first==-1)
//                 first=i;
                
//                 last=i;
//             }
//         }
//         vector<int> al;
//         al.push_back(first); al.push_back(last);
        
//         return al; 
//     }
// };


class Solution
{
    public:
    vector<int> find(int arr[], int n , int x )
    {
         int first=-1, last=-1;
         first = l_idx(arr, x,n);
         last = h_idx(arr,x,n);
        vector<int> al;
        al.push_back(first); al.push_back(last);
  
        return al;
        
    }
    int h_idx(int arr[], int x, int n)
    {
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
    
    int l_idx(int arr[], int x, int n)
    {
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
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,x;
        cin>>n>>x;
        int arr[n],i;
        for(i=0;i<n;i++)
        cin>>arr[i];
        vector<int> ans;
        Solution ob;
        ans=ob.find(arr,n,x);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
    return 0;
}



// } Driver Code Ends