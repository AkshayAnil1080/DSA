https://practice.geeksforgeeks.org/problems/smallest-number-with-sum-of-digits-as-n-and-divisible-by-10n4032/1

//User function Template for Java

class Solution
{
    public String digitsNum(int N)
    {
        // Code 
        StringBuilder st = new StringBuilder();
        for( int i =0; i<N; i++)
        st.append("0");
        
        while(N>0){
            if(N>9)
            { 
                st.insert(0,9); 
                N-=9;
            }
            else
            {
                st.insert(0,N);
                N-=N;
            }
        }
        return st.toString();
    }
}
//to make the smallest num- use the largest digit first ie 9 and keep seubtracting
// append N zeros at last.
//TC: O(n+logn), //SC:O(n+logn)
