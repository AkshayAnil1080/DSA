//{ Driver Code Starts
/* Driver program to test above function */

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++



class Interval
{
public:
    int a;
    int b;

    Interval()
    {
        
    }
    Interval(int a, int b)
    {
        this->a = a;
        this->b = b;
    }
};

class Solution{
    public:
    vector<int>kthSmallestNum(int n, vector<vector<int>>&range, int q, vector<int>queries){
        //Write your code here
        
        Interval *arr = new Interval[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = Interval(range[i][0], range[i][1]);
    }

    int index = mergeIntervals(arr, n);

    std::vector<int> ans;
    for (int i = 0; i < q; i++)
    {
        int res = find_k(arr, queries[i], index);
        ans.push_back(res);
    }

    delete[] arr;
    return ans;
    
    } 
    
    
int find_k(Interval arr[], int k, int index)
{
    int ans = -1;
    for (int j = 0; j <= index; j++)
    {
        if (k <= std::abs(arr[j].b - arr[j].a + 1))
        {
            ans = (arr[j].a + k - 1);
            break;
        }

        k = k - std::abs(arr[j].b - arr[j].a + 1);
    }
    return ans;
}

int mergeIntervals(Interval arr[], int n)
{
    std::sort(arr, arr + n, [](const Interval &i1, const Interval &i2) {
        return i1.a < i2.a;
    });

    int index = 0;

    for (int i = 1; i < n; i++)
    {
        if (arr[index].b >= arr[i].a)
        {
            arr[index].b = std::max(arr[index].b, arr[i].b);
        }
        else
        {
            index++;
            arr[index] = arr[i];
        }
    }

    return index;
    
}
};


//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin >> n;
	    vector<vector<int>>range(n, vector<int>(2, 0));
	    for(int i = 0 ; i < n; i++){
	        cin >> range[i][0] >> range[i][1];
	    }
	    int q;
	    cin >> q;
	    vector<int>queries;
	    for(int i = 0 ; i < q; i++){
	        int x;
            cin >> x;
	        queries.push_back(x);
	    }
	    Solution ob;
	    vector<int>ans = ob.kthSmallestNum(n, range, q, queries);
	    for(auto it : ans){
	        cout << it << " ";
	    }
	    cout << endl;
	}
	return 0;
}

// } Driver Code Ends