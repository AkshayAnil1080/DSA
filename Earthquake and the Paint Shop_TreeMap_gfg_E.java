// https://practice.geeksforgeeks.org/problems/earthquake-and-the-paint-shop4518/1
// Tc: O(nlogn)
// SC:O(N)
// User function Template for Java

class alphanumeric {
    public String name;
    public int count;
    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
};
class Solution {
    alphanumeric[] sortedStrings(int N, String A[]) {
        Map<String, Integer>  map =new TreeMap<>(); //O(n)
        
        for(int  i=0; i<N; i++) //O(n)
        {
            map.put(A[i], map.getOrDefault(A[i], 0)+1); //O(logn)
        }
        int n = map.size();
        
        alphanumeric  ans[] = new alphanumeric[n] ; // int arr[] =new int[n];
        int ind=0;
        
        
        for(Map.Entry<String, Integer> ent : map.entrySet())
        {
            ans[ind++] =  new alphanumeric(ent.getKey(), ent.getValue());
        }
        
        return ans;
        
    }
};
