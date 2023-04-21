//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends

 class trie
    {
        trie ch[];
        trie()
        {
            ch=new trie[26];
            for(int i=0;i<26;i++){
                ch[i]=null;
            }
        }
    }
    
     
    
class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
         trie root=new trie();
        build(s1,root);
        //reverse each string in s1 - since string is immutable - have to use SB
        for(int i=0;i<s1.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s1[i].length();j++)
            {
                sb.append(s1[i].charAt(j));
            }
            sb.reverse();
            s1[i]=sb.toString();
        }
        build(s1,root);
        
        // check each string in s2 in trie - prefix present
        //reverse each stirng ins s2 and check in trie - siffix present
        int ans=0;
        for(int i=0;i<s2.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s2[i].length();j++)
            {
                sb.append(s2[i].charAt(j));
            }
            sb.reverse();
            if(find(s2[i],root)==1 || find(sb.toString(),root)==1)
                ans++;
        }
        return ans;

    }
    
    int find(String s, trie root){
        for(int i = 0; i < s.length(); i++)
        {
            if(root.ch[s.charAt(i)-'a'] == null)
           return 0; 
            
            root = root.ch[s.charAt(i)-'a'];
        }
        return 1;
    }
     void build(String a[], trie root){
        trie temp=null;
        for(int i = 0; i < a.length;i++)
        {
            temp = root;
            for(int j = 0;j < a[i].length();j++)
            {
                if(temp.ch[a[i].charAt(j)-'a'] == null)
                    temp.ch[a[i].charAt(j)-'a'] = new trie();
                    
                temp = temp.ch[a[i].charAt(j)-'a'];
            }
        }
    }
}
