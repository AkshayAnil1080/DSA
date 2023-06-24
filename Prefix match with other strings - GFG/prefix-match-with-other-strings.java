//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.next();
            }
            
            int k = Integer.parseInt(sc.next());
            
            String str = sc.next();
            
            Solution obj = new Solution();
            int ans = obj.klengthpref(arr,n,k,str);
            System.out.println(ans);
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Trie
{
    Trie arr[];
    int freq;
    public Trie(int f)
    {
        arr=new Trie[26];
        freq=f;
    }
    
}


class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        Trie root = new Trie(0); 
  
        for (int i = 0; i < n; i++) 
        {
          insert(arr[i], root); 
        }
        
        return find(str,k,root);
    }
     void insert(String s, Trie root) 
    { 
        Trie cur = root; 
        for (int i = 0; i < s.length(); i++) { 
            int idx = s.charAt(i) - 'a'; 
      
           // if the idx DNE, make a new one else increase the freq.
            if (cur.arr[idx] == null) 
                cur.arr[idx] = new Trie(0); 
      
            // Increase the frequency of that entry 
            cur.arr[idx].freq++; 
      
            // Move to the next node 
            cur = cur.arr[idx]; 
        } 
    } 
     int find(String s, int k, Trie root) 
    { 
        Trie cur = root; 
      
        // Traverse the string 
        for (int i = 0; i < s.length(); i++) { 
            int idx = s.charAt(i) - 'a'; 
      
            if (cur.arr[idx] == null) 
                return 0; 
      
            // Else traverse to the required node
            cur = cur.arr[idx]; 
      
      
            // Return the required count 
            if (i == k-1) 
                return cur.freq; 
        } 
        return 0; 
    } 
}
