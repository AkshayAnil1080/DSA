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
      ArrayList<ArrayList<String>> ans = new ArrayList<>();
   
        for(int i=1; i<=s.length(); i++)
        {
            Set<String> set  = new TreeSet<>();
            String curr = s.substring(0,i);
            for(int j =0; j<contact.length; j++)
            {
                if(contact[j].length() >= s.substring(0,i).length())
                {
                    String curr2 = contact[j].substring(0,i);
                
                    if(curr.equals(curr2))
                    {
                        set.add(contact[j]);
                    }
                }
    
            }
            if(set.isEmpty())
            {
                set.add("0");
            }
               ArrayList<String> sub_ans = new ArrayList<>();
               for(String x : set)
               sub_ans.add(x);
            
            ans.add(sub_ans);
        }
        return ans;
    }
}