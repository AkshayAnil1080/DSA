//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int A;
            A = Integer.parseInt(br.readLine());
            
            
            int B;
            B = Integer.parseInt(br.readLine());
            
            
            int C;
            C = Integer.parseInt(br.readLine());
            
            
            int D;
            D = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.bestNumbers(N, A, B, C, D);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
        // code here
        static int N = (int)1e5+5;
	static int M = (int)1e9+7;
	long binpow(long a,long b,long p){
	    if(b == 0)
	    	return 1;
	    long t = binpow(a,b/2,p);
	    if(b%2 != 0)
	    	return (((a*t)%p)*t)%p;
	    else 
	    	return ((t*t)%p);
	}
	 
	long [] fact;
	long [] invfact;
	void init(){
	    fact[0] = 1;
	    for(int i = 1;i < N; i++)
	    {
	    	fact[i] = i*fact[i-1]%M;
	    }
	    invfact[N-1]=binpow(fact[N-1],M-2,M);
	    for(int i=N-2;i>=0;i--){
	        invfact[i] = (i+1)*invfact[i+1]%M;
	    }
	}
	long ncr(int n, int r, long p){
	    return (((fact[n]*invfact[n-r])%p)*invfact[r])%p;
	}
	static boolean f;
	int bestNumbers(int n, int a, int b, int c, int d) {
        fact = new long[N];
        invfact = new long[N];
        f = false;
        if(!f)
        {
            f = true;
            init();
        }
        long ans = 0;
        if(a==b){
            long sum=1L*n*a;
            while(sum>0){
                if(sum%10==c || sum%10==d){
                    return 1;
                }
                sum/=10;
            }
            return 0;
        }else{
            for(int i=0; i<=n; i++)
            {
                int sum = i*a+(n-i)*b;
                boolean good = false;
                while(sum>0)
                {
                    if(sum%10==c || sum%10==d)
                    {
                        good = true;
                        break;
                    }
                    sum /= 10;
                }
                if(good)
                {
                    ans += ncr(n,i,M);
                    ans %= M;
                }
            }
            return (int)ans;
        }
    }
}
        
