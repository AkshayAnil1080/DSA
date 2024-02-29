
class Solution {
    long sumBitDifferences(int[] arr, int n) {
         long ans = 0; // Initialize result

        for(int i=0; i<n ;i++){
            for(int j=i+1; j<n ;j++){
                if(arr[i]!=arr[j])
                ans += hammingDistance(arr[i], arr[j]) *2;
            }
        }
        return ans;
        
    }
    int hammingDistance(int x, int y) {
      
      int ans=0;
        while(x>0 || y>0)
        {
            if((y&1) != (x&1))
                ans++;
          
            y=y/2; // or y>>=1;
            x=x/2;
        }       
        return ans;
    }
}



class Solution {
    long sumBitDifferences(int[] arr, int n) {
         long ans = 0; 

        for (int i = 0; i < 32; i++) {
           
            long cnt=0; //with ith bit set
            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) != 0) //check if ith bit is set
                    cnt++;

          //all permuatations
            ans +=  (cnt*(n-cnt)*2);
        }

        return ans;
    }
}
