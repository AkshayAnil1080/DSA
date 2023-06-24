//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++

class Trie
{
public:
    Trie* arr[26];
    int freq;

    Trie(int f)
    {
        for (int i = 0; i < 26; i++)
            arr[i] = nullptr;
        freq = f;
    }
};
class Solution{   
public:
    int klengthpref(string arr[], int n, int k, string str){    
     Trie* root = new Trie(0);

        for (int i = 0; i < n; i++)
        {
            insert(arr[i], root);
        }

        return find(str, k, root);
    }

    void insert(string s, Trie* root)
    {
        Trie* cur = root;
        for (int i = 0; i < s.length(); i++)
        {
            int idx = s[i] - 'a';

            // if the idx doesn't exist, create a new one else increase the frequency.
            if (cur->arr[idx] == nullptr)
                cur->arr[idx] = new Trie(0);

            // Increase the frequency of that entry
            cur->arr[idx]->freq++;

            // Move to the next node
            cur = cur->arr[idx];
        }
    }

    int find(string s, int k, Trie* root)
    {
        Trie* cur = root;

        // Traverse the string
        for (int i = 0; i < s.length(); i++)
        {
            int idx = s[i] - 'a';

            if (cur->arr[idx] == nullptr)
                return 0;

            // Else traverse to the required node
            cur = cur->arr[idx];

            // Return the required count
            if (i == k - 1)
                return cur->freq;
        }
        return 0;
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
        cin>>n;
        string arr[n];
        for(int i=0;i<n;i++)
        {
            string s;
            cin>>arr[i];
            
        }
        int k;
        cin>>k;
        string str;
        cin>>str;
        
        Solution ob;
        cout << ob.klengthpref(arr, n, k, str) << endl;
    }
    return 0; 
} 

// } Driver Code Ends