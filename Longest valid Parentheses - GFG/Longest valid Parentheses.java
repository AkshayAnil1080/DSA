https://www.geeksforgeeks.org/problems/longest-valid-parentheses5657/1
n^3,1

  class Solution{
    static int maxLength(String S){
        // code here
        int n = S.length();
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(paranthesesChecker(S.substring(i,j+1))){
                    max = Math.max(max, j-i+1);
                }
            }
        }
         return max;
    }
    static boolean paranthesesChecker(String str)
    {
        // add your code here
        ArrayDeque<Character> st = new ArrayDeque<>();
		
		for ( int i =0 ;  i <str.length() ; i++)
		{
			if(str.charAt(i)=='(')
				st.push(str.charAt(i));
			
			else{
				if(st.isEmpty()) return false;   // too handle str =")" , "(()))" else throws exception.			
			   
			//not empty.
		    	st.pop();
			}
		}
	return(st.isEmpty());
    }
}

m2 
  n,n
 class Solution{
    static int maxLength(String S){
        // code here
        int n = S.length();
        int max=0;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(-1);
        for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            
            if(ch=='(')
            st.push(i);
            
            // ch ==')', pop and track max
            else{
                st.pop();
                
                if(!st.isEmpty())
                max = Math.max(max, i-st.peek());
                
                else // to see to next valid substring
                st.push(i);
            }
            
        }
        return max;
    }
} 

m3
  n,1
class Solution{
    static int maxLength(String S){
        int n = S.length();
        int open=0; int close=0;
        int ans=0;
        //left to right
         for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            if(ch=='(') open++;
            else close++;
            
            if(open == close) ans = Math.max(ans, open*2);
            
            else if(close > open)  close=open=0;
         }
         open=0; close=0;
         //right to left
         for(int i=n-1; i>=0; i--){
            char ch = S.charAt(i);
            if(ch=='(') open++;
            else close++;
            
           if(open == close) ans = Math.max(ans, open*2);
            
            else if(open > close)  close=open=0;
         }
         return ans;
    }
}
