//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.makePalindrome(n, arr);
            
            String _result_val = (res) ? "YES" : "NO";
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        
        //1
         HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> temp=new HashMap<>();
        for(String s :arr)
            map.put(s,map.getOrDefault(s,0)+1);
            
             
        for(Map.Entry<String, Integer> e : map.entrySet())  // traversing in map
        {
            String curr =  e.getKey();  int freq = e.getValue();    
            //if palin,  // put it in another map and check freq not be odd
             if(isPalin(curr))  // put it in another map and check freq not be odd
            {
                temp.put(curr,freq);
                continue;
            }
            
            //if not palin, check if its reversal is present with same freq    
             StringBuilder sb=new StringBuilder(curr);
            sb.reverse();  // O(len(arr[i]))
            int y= map.get(sb.toString())==null ? 0 :  map.get(sb.toString()); // else it takes null values;
            
            if(y==0 || freq!=y) // reversal is not present, reversal is present with diff freq
               {
                 return false;
               }
        }
        
         int cnt=0; // cnt of palindromic string with freq as odd, agar ek v aise hua to not poss
        for(int i:temp.values())
        {
            if(i%2==1)    cnt++;
            
        }
        if(cnt>1)  return false;
        return true;
        // not more than 1 palindrimic string should have freq in odd number ->ret false.
    }    
     public static boolean isPalin(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
        
