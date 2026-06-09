https://youtu.be/xxFLDFYq5Ts

nlog,1
class Solution {
    public int binarySearchable(int[] arr) {
        // code here
        //perform bs for every ele
        int ans=0;
        int n=arr.length;
        
        for(int x : arr){
            int l=0, h=n-1;
            while(l<=h){
                int m = l + (h-l)/2;
                if(arr[m]==x){
                    ans++;
                    break;
                }
                if(x>arr[m]) //if target greter, search right
                    l=m+1;
                else
                   h=m-1;
            }
        }
        return ans;
    }
};


n,1
class Solution {
    public int binarySearchable(int[] arr) {
        // code here
        int n = arr.length;
        return helper(arr, 0, n-1, Integer.MIN_VALUE, Integer.MAX_VALUE);   
    }
    int helper(int arr[], int l, int h, int x, int y ){
        if(l>h)
        return 0;
        
        int m = l + (h-l)/2;
        
        int current_ans=0;
        if(arr[m] > x && arr[m] <y)
        current_ans =1;
        
        int leftCount = helper(arr, l, m-1, x, Math.min(y, arr[m]));
        
        int rightCount = helper(arr, m+1, h, Math.max(x, arr[m]), y);
        
        return current_ans+  leftCount + rightCount;
    }
};

 // 
