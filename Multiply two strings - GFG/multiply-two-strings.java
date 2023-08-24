//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
         int sign = 1;
        if (s1.charAt(0) == '-' && s2.charAt(0) != '-')
            sign = -1;
        else if (s1.charAt(0) != '-' && s2.charAt(0) == '-')
            sign = -1;

        int n = s1.length(), m = s2.length();

        int carry = 0, shift, n1, n2, k, pro, sum,i;
        int[] res = new int[n + m];
        StringBuilder a = new StringBuilder();
        int[] product = new int[n + m]; // storing each level
        for (int j = m - 1; j >= 0; j--) {
            if (s2.charAt(j) == '-')
                break;

            shift = m - 1 - j; // 0, 1, 2, 3,...
            carry = 0;

            for ( i = 0; i < n + m; i++) {
                product[i] = 0;
            }

            n1 = s2.charAt(j) - '0';
            for ( i = n - 1, k = n + m - 1 - shift; i >= 0; i--, k--) {
                if (s1.charAt(i) == '-')
                    break;
                n2 = s1.charAt(i) - '0';
                pro = n1 * n2 + carry;

                if (pro >= 10) {
                    product[k] = pro % 10;
                    pro = pro / 10;
                    carry = pro;
                } else {
                    product[k] = pro;
                    carry = 0;
                }
            }
            if (carry > 0)
                product[k] = carry;

            carry = 0;
            for ( i = n + m - 1; i >= 0; i--) {
                sum = product[i] + res[i] + carry;
                if (sum >= 10) {
                    res[i] = sum % 10;
                    sum = sum / 10;
                    carry = sum;
                } else {
                    res[i] = sum;
                    carry = 0;
                }
            }
        }
         i = 0;
        while (i < n + m && res[i] == 0)
            i++;

        if (sign == -1)
            a.append('-');
        for (; i < n + m; i++) {
            a.append((char) (res[i] + 48));
        }
        return a.toString();
    }
}
      