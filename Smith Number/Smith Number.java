//cpp
class Solution {
  public:
    int smithNum(int n) {
        int s1 = Sum(n), s2 = getSum(n);
       
        if(s1 == -1) 
            return 0;
        
        return (s1 == s2) ? 1 : 0;
    }

    static int Sum(int n) { 
        int curr = n;
        int sum = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sum += getSum(i);
                n /= i;
            }
        }
        if (n > 1)
            sum += getSum(n);
        
        if (n == curr) // prime number  eg 7
            return -1;
        
        return sum;
    } 
    
    static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
};

//java
class Solution {
    static int smithNum(int n) {
        // code here
        int s1 = Sum(n), s2 = getSum(n);
        // System.out.println(s1);
        if(s1==-1) // prime
        return 0;
        
        return (s1==s2) ? 1 : 0;
       
    }
    

    static int Sum(int n) 
    { 
        int curr=n;
        int sum=0;
        for(int i=2; i*i<=n; i++)
        {
            while(n%i==0){
            sum+= getSum(i);
            n/=i;
            }
        }
        if(n>1)
        sum+= getSum(n);
        
        if(n==curr) // prime number  eg 7
        return -1;
        
        return sum;
    } 
    
   static  int getSum(int n)
    {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

}
