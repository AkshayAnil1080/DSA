//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String contact[] = in.readLine().trim().split("\\s+");
            String s = in.readLine();
            
            Solution ob = new Solution();
            ArrayList<ArrayList<String>> ans = ob.displayContacts(n, contact, s);
            for(int i = 0;i < ans.size();i++){
                for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        trie root = new trie();
        buildTrie(root, contact);
        
        //s*max(string.length)*nlogn
        ArrayList<ArrayList<String>> ans  = new ArrayList<>();
        for(int i =1; i<=s.length(); i++) //O(s)
        {
            ArrayList<String> sub_ans =  new ArrayList<>();
            find(s.substring(0,i) , root, sub_ans); // will append all poss distinct ans
            
            //sort it
            
            ans.add(sub_ans);
        }
        return ans;
        
    }
    static void buildTrie(trie root, String c[])  // O(n*maxStrinlength)
    {
        trie temp = null;
        for(int i=0 ;i<c.length; i++)
        {
            temp = root;
            for(int j=0; j<c[i].length(); j++)
            {
                if(temp.ch[c[i].charAt(j) -'a'] ==null)
                {
                    temp.ch[c[i].charAt(j)- 'a'] = new trie();
                }
                temp =  temp.ch[c[i].charAt(j)- 'a'];
                temp.set.add(c[i]);
            }
        }
    }
    
    static void find(String s, trie root, ArrayList<String> sub_ans) // 
    {
        int flag=1;
        
        for(int i=0; i<s.length(); i++) //O(just traversing down in trie) O(S.lenth)
        {
            if(root.ch[s.charAt(i)-'a'] ==null)
            
            {
                flag=0; //no substring with prefix(0,i-1)/ return 0
                break;
            }
            root =  root.ch[s.charAt(i)-'a']; // if present just traverse
                    
        }
        if(flag==0)
        sub_ans.add("0");
        
        else
        {
            for(String x : root.set)
            {
                sub_ans.add(x);
            }
        }
    }
}

class trie
{
    TreeSet<String> set;
    trie ch[];
    
    trie()
    {
        set = new TreeSet<>();
        ch = new trie[26];
        for(int i=0; i<26;i++)
        ch[i] = null;
    }
}