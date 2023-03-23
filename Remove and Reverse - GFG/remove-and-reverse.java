//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
          
            String S = read.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.removeReverse(S); 
            System.out.println(ans);
        }
    } 
} 

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    String removeReverse(String S) 
    { 
        // code here
          StringBuffer s = new StringBuffer(S);
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        //logic
        int flag=0;
        int st=0; int end=s.length()-1; 
        while(st<=end)
        {
            if(flag==0)
            {
                if(freq[s.charAt(st)-'a']==1) ///no reperatinng ch , check for others
                st++;
                
                else{
                    freq[s.charAt(st)-'a']--;
                    s.replace(st,st+1,"#");
                    st++;
                    flag=1; // string is reverse , traverse from 'end' ptr for f==1
                }
                
            }
            else
            {
                if(freq[s.charAt(end)-'a']==1) ///no reperatinng ch , check for others
                end--;
                
                else{
                    freq[s.charAt(end)-'a']--;
                    s.replace(end,end+1,"#");
                    end--;
                    flag=0;
                }
            }
        }
         if(flag==1)
            s.reverse();
        
        //
         String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
                ans+=s.charAt(i);
        }
        return ans;
        
    }
} 

//{ Driver Code Starts.

// } Driver Code Ends