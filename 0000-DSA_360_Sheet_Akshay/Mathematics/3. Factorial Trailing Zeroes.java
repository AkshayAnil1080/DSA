Full video explanation - https://youtu.be/k0qxbWYkdIk

logn, 1


class Solution {
    public int trailingZeroes(int n) {
        int res=0;
        while(n>=5)
	    {
	        int quo=n/5;
	        res=res+quo;
	        n=n/5;
	    }
	    return res;
    }
}



n,1

class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int ans=1;
       for(int i=2; i<=n ;i++){
           ans*=i;
       }
       
       int res=0;
       while(ans%10==0){
           res++;
           ans/=10;
       }
       return res;
    }
}
