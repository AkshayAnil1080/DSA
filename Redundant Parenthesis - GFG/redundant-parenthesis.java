//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
	public static String removeBrackets(String Exp){
		//code here
		char[]s=Exp.toCharArray();
		int n=Exp.length();
		
        int ans[]=new int[n+1];
        Arrays.fill(ans,1);
        int lasta[]=new int[n+1];
        int nxta[]=new int[n+1];

        //last[i] = last operand explored before index i ,
        int l=-1;
        for(int i=0;i<n;i++){
            lasta[i]=l;
            if(s[i]=='*'||s[i]=='+'||s[i]=='-'||s[i]=='/')
                    l=s[i];
        }
        // nxta[i] = next operand explored after index i
        l=-1;
        for(int i=n-1;i>=0;i--){
            nxta[i]=l;
            if(s[i]=='*'||s[i]=='+'||s[i]=='-'||s[i]=='/')
                    l=s[i];
        }
        // for(int x: lasta)
        // System.out.print(x+" ");  //-1 -1 -1 42 42 42 43 43 43
        
        //  System.out.println();
        //  for(int x: nxta)
        // System.out.print(x+" "); // 42 42 43 43 43 -1 -1 -1 -1
        
        Stack<Integer> st=new Stack<>();
        int sign[]=new int[256];  // index of last occ of operators in exp
        int mp[]=new int[256]; // stores whether an operator is present in sub_expresssion
        Arrays.fill(sign,-1);
        char[] operand={'*','+','-','/'};
        
        
        //start itr for each char- check if ch is operator store in array(mp).
        //if ch is '(' push it
        //if ch is ')' - need to handle cases
        for(int p=0;p<n;p++)
        {
            for(char x:operand){
                if(x==s[p]) // store the operand index if present
                    sign[x]=p;
            }
            if(s[p]=='(')
                st.push(p);

            else if(s[p]==')'){
                int i=st.pop();
                int j=p;
            //i got the range of closing and opening paranthese
            //i need two things to compare
            int nxt=nxta[j];
            int last=lasta[i];    
            
            for(char x:operand){
                    if(sign[x]>=i){
                        mp[x]=1;
                    }
                }
            
            int ok=0;
                
                // the  sub exp we are comparing , checking if it has redundant braces
                if(i>0 && j+1<n && s[i-1]=='(' && s[j+1]==')') 
                    ok=1; //  
                    
                //no operators are present in b/w sub exp
                if(mp['+']==0 && mp['*']==0 && mp['-']==0 && mp['/']==0) 
                    ok=1;
               

                if(last==-1&&nxt==-1) //if no opeators before i and after j
                    ok=1;
                    
                if(last=='/'){

                }
                else if(last=='-'&&(mp['+']==1||mp['-']==1)){
                    
                }
                else if(mp['-']==0&&mp['+']==0){
                    ok=1;
                }
                else{
                    if((last==-1||last=='+'||last=='-')&&(nxt==-1||nxt=='+'||nxt=='-'))
                        ok=1;
                }
                if(ok==1){ //not req paranthese
                    ans[i]=0; // not req ch
                    ans[j]=0;
                }
            }
        }
        
    StringBuffer res=new StringBuffer();
        for(int i=0;i<n;i++){
            if(ans[i]>0){
                res.append(s[i]);
            }
        }
        return res.toString(); 
        
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String Exp = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.removeBrackets(Exp));
        }
        
    }
}
// } Driver Code Ends