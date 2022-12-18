//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.maxGcd(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
// class Solution {
//     long maxGcd(int N) {
//         // code here
//         //s1 to find lcm of largest 4 poss num - n. n-1, n-2. n-3
//         long x = (N*(N-1 )) / gcd(N,N-1);
//         long y = ((N-2)*(N-3)) / gcd(N-2, N-3);
        
//         long z = (x*y)/gcd(x,y);
        
//         //s2 - a,b,c,d are co primes = gcd(a,b,c,d) =1 => lcm = a*b*c*d;
//         long num = N*(N-1);  //we got a,b
//         int count=0;
//         for(int i = N-2; i>=1; i--) // to find c,d
//         {
//             if(gcd(num,i)==1)
//             {
//                 num *= i;
//                 count++;
//             }
//             if(count==2) break;
//         }
//         return Math.max(z,num);
        
//     }
//     long gcd(long a, long b){
//         if(b==0)
//         return a;
        
//         return gcd(b,a%b);
//     }
// }
// What was happening for n=18
// a/q to our prev code
// z = lcm(18,17,16,15) = 36720
// num = lcm(18,17,13,11) - such that all are coprimes -> 43758

// But,
// if we run the same code for n-1 - Why ? Checking if any other comb having max lcm
// z1 = lcm(17,16,15,14) -> 28560
// num1 =  lcm(17,16,15,13) -> 53040( this is the expected output)

// -> that means for every n, we have to run our previous code for n and n-1 and take the max.
// -> Changes in code - i ran the same code into a function name "solve" and returned max for n, n-1;


class Solution {
    long maxGcd(int N) {
        // code here
        return Math.max(solve(N), solve(N-1));
    }
    long gcd(long a, long b ) // opt euclidean
    {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    long solve(int N)
    {
         long x = (N* (N-1))/gcd(N,N-1);
        long y = ((N-2) * (N-3)) / gcd(N-2,N-3);
        
        long z = (x*y)/gcd(x,y);
        
        //s2 need to compare with other approach
        long num =(N *(N-1));
        int count=0;
        for(int i=N-2; i>=1; i--)
        {
            if(gcd(num,i)==1)
            {
                // System.out.println(i);
                num *= i;
                count++;
            }
            if(count==2) break;
        }
        return Math.max(z,num);
    }
}