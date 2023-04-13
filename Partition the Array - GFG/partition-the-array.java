//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.minDifference(N, A); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{
	ArrayList<long []> help(int [] a){
        int n=a.length;
        long [] p = new long[n+1];
        for(int i=0;i<n;i++){
            p[i]=a[i];
            if(i>0){
              p[i]+=p[i-1];
            }
        }
        ArrayList<long []> tmp = new ArrayList<>();
        long arr[] = {0,0};
        tmp.add(arr);
        for(int i=1;i<n;i++){
            int l=1,h=i;
            long dif = (long)2e18;
            long [] t = new long[2];
            
            while(l<=h){
                int mid=(l+h)/2;
                long x=p[mid-1];
                long y=p[i]-x;
                
                if(Math.abs(x-y)<dif){
                dif=Math.abs(x-y);
                t[0] = x; t[1] = y;
                }
                
                if(x>y){
                  h=mid-1;
                }
                else{
                  l=mid+1;
                }
            }
            tmp.add(t);
        }
        
        return tmp;
        }
	void reverse(int a[])
    {
		int n = a.length;
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  
    }
    
	long minDifference(int N, int A[]) 
	{ 
		long ans = (long)2e18;
		ArrayList<long []> x = help(A);
		reverse(A);
        ArrayList<long []> y = help(A);
        Collections.reverse(y);
        for(int i=1;i+2<N;i++) {
          ans=Math.min(ans, Math.max(Math.max(x.get(i)[0],x.get(i)[1]), Math.max(y.get(i+1)[0],y.get(i+1)[1])) - Math.min(Math.min(x.get(i)[0],x.get(i)[1]), Math.min(y.get(i+1)[0],y.get(i+1)[1])));
        }
		return ans;
	}
}  