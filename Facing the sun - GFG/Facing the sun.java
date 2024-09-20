class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] arr) {
        // code here
        int n = arr.length;
        int leftmax =arr[0];
        int ans=1;
        for(int i=1; i<n ;i++){
           // ans = (arr[i]>leftmax)? ans++ : ans;
            if(arr[i]> leftmax){
                ans++;
                leftmax=arr[i];
            }
        }
        return ans;
    }
}
