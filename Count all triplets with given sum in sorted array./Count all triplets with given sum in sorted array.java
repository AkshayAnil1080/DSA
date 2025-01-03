class Solution {
    public int countTriplets(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            //two ptr
            int l=i+1; int h=n-1; 
            while(l<h){
                int sum = arr[i]+ arr[l] + arr[h];
                if(sum==k){
                    // l++; h--; ans++;
                    //store the left and high in temp and make some cnt ptr
                    int t1=arr[l], c1=0, t2=arr[h], c2=0;
                    
                    //cnt same ele from left
                    while(l<=h && arr[l]==t1){
                        l++; c1++;
                    }
                
                    //sim for right
                     while(l<=h && arr[h]==t2){
                        h--; c2++;
                    }
                    
                    //cal final ans
                    ans +=  (t1==t2) ? (c1*(c1-1))/2 : c1*c2 ;
                }
                else if(sum > k)
                h--;
                
                else{
                    l++;
                }
            }
        }
        return ans;
    }
}
