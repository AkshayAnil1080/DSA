class Solution {
    long max_sum(int arr[], int n) {
        // Your code here
        long ans=0;
        for(int i=0; i<n; i++){
            long sum=0;
            for(int j=0; j<n; j++){
                sum+= j* arr[(i+j)%n];
            }
           if(sum>ans) ans=sum;
        }
        return ans;
    }
}

class Solution {
    long max_sum(int arr[], int n) {
        // Your code here
        long sum=0;
        long prev_sum=0;
        for(int i=0; i<n; i++){
            prev_sum +=  (long)i*arr[i];
            sum+=arr[i];
        }
        long ans=prev_sum;
        
        for(int i=1; i<n; i++){
            long curr_sum = prev_sum - (sum -arr[i-1]) + (long)arr[i-1]*(n-1);
            
            prev_sum = curr_sum;
          if(curr_sum > ans) ans = curr_sum;
        }
        return ans;
    }
} 

