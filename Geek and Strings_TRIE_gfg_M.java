// https://practice.geeksforgeeks.org/problems/geek-and-strings3030/1

// SC: O(N*List [i]) // for trie
//TC: O(N*L) - for trie + O(Q*x)  ->L = length of longest word inserted in Trie,  x is the longest word in the query
//User function Template for Java
class Node{
    int freq[];
    Node[]  node;
    Node()
    {
        freq = new int[26];
        node = new Node[26];
    }
}
class Solution{
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
        // code here
        List<Integer> ans  = new ArrayList<>();
        Node head = new Node();
        // O(N*L) - for trie
        for(String s : li)
        {
            Node curr = head;
            for(char c: s.toCharArray())
            {
                curr.freq[c-'a']++;
                if(curr.node[c-'a'] ==null) curr.node[c-'a'] = new Node();
                
                curr=curr.node[c-'a']; // need to handle if null- aboee lin
            }
        }
        // O(Q*x)
        for(String s : query)
        {
            Node curr = head;
            for(int i =0; i<s.length() ;i ++)
            {
                char c = s.charAt(i);
                if(i==s.length()-1) // if reached last ch of query- add the freq in ans and exit
                {
                    ans.add(curr.freq[c-'a']); break;
                }
                if(curr.node[c-'a']==null) // eg xyz -the first ch here is not even present in trie -> just add 0 and break; no need of checking further.
                {
                    ans.add(0); break;
                }
                curr= curr.node[c-'a'];
            }
        }
        return ans;
    }
}
