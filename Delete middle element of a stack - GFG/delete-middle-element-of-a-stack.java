//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution
// {
//     //Function to delete middle element of a stack.
//     public void deleteMid(Stack<Integer>s,int sizeOfStack){
//         // code here
//         ArrayDeque<Integer> st =  new ArrayDeque<>();
//         int m = sizeOfStack/2;
        
//         int i =0 ;
//       while(!s.isEmpty())
//       {
//           st.push(s.pop());
//           i++;
           
//           if(i==m)
//           s.pop();
//       }
       
//       while(!st.isEmpty())
//       s.push(st.pop());

//     } 
// }

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        helper(s,sizeOfStack,0);
    } 
      void helper(Stack<Integer>s, int n, int idx)
    {
        if(idx == n/2)
        {
            s.pop();
            return;
        }
        // store the ele
        int x=  s.pop();
        idx++;
        

        helper(s, n, idx);
        
        s.push(x);
    } 
    
}
