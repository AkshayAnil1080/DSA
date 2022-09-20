// https://practice.geeksforgeeks.org/problems/maximum-number-of-22-squares/1
// dRYRUN
// https://drive.google.com/file/d/1T58j5liKB-386TGhT25yQi70ESOt5dzX/view?usp=sharing
class Solution
{
    public static long numberOfSquares(long n)
    {
        //code here
        
        if(n<=3) return 0;
        
        if(n%2==0)
        n=n-2;
        
        else n=n-3;
        
        n=n/2;
        return n*(n+1)/2;
    }
}

// for even base squres - at base level - u can only draw (n-2)/2=x sqaure of 2*2 and then above x-1, x-2, ...1
// for odd base squres - at base level - u can only draw (n-3)/2=x sqaure of 2*2 and then above x-1, x-2, ...1

//sum of series of x+X-1+x-2+...1 = x*(X+1)/2;
