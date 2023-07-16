//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// class Solution
// {
//     public String FirstNonRepeating(String A)
//     {
//         StringBuilder ans = new StringBuilder();
//         int n=A.length();
//         int arr[] = new int[26];
//         Queue<Character> q  = new LinkedList<>();
//         for(int i=0; i<n; i++)
//         {
//             char ch = A.charAt(i);
//             arr[ch-'a']++;
//             q.add(ch);
            
//             while(!q.isEmpty())
//             {
//                 if(arr[q.peek()-'a']==1)
//                 {
//                     ans.append(q.peek());
//                     break;
//                 }
//                 else
//                 q.poll();

//             }
//             if(q.isEmpty())
//             ans.append('#');
//         }
//         return ans.toString();
//     }
// }

class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
         StringBuilder ans =new StringBuilder();
         int n = A.length();
         
        int freq[][]=new int[26][2]; // store freq and idx;
       
        for(int i=0;i<n;i++)
        {
            char ch = A.charAt(i);
            freq[ch-'a'][0]++; // increase frequency
            freq[ch-'a'][1]=i; // store the idx
           
           int res_ch = -1;
            // get the character with freq 1 and lowest idx(asked first non repeating)
            int min =Integer.MAX_VALUE;
            for(int j=0;j<26;j++)
            {   // track the min index 
                if(freq[j][0]==1 && freq[j][1]<min){
                    min = freq[j][1];
                    res_ch  = j; //and store its corresponding character
                }
            }
            if(res_ch==-1){
                ans.append("#");
            }else{
                ans.append((char)(res_ch + 'a'));
            }
        }
        return ans.toString();
    }
}
