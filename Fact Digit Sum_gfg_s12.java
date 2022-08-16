
Problem : https://practice.geeksforgeeks.org/problems/fact-digit-sum4125/1
Profile : https://auth.geeksforgeeks.org/user/akshayanil/practice

// TC: O(10)+ O(logN)  = O(logN)
//SC :O(10)
class Solution
{
    ArrayList<Integer> FactDigit(int N)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        //store factorial of every digit-  kyunki inko sum hi == N aana chahiye
        int fact[] = new int[10];
        fact[0]=1;
        for( int i=1; i<10; i++)
        {
            fact[i] =i*fact[i-1];
        }
        
        //checking with max fact[i] and subtracting it from N 
        for( int i =9; i>=1; i--) // starting from highest , but will revese it at the end.
        {
            while(N>=fact[i])  //y? eg 13 : 13-3! = 7 -3! =1-1! : 331 - we want lowest X- reverse it 133;
            {
                N -= fact[i];
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
