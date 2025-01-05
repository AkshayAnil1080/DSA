


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        List<Integer>  res = new ArrayList<>();
        int l =0, h=n-1;
        int min=Integer.MAX_VALUE;
        while(l<h){
                
                int sum=arr[l]+arr[h];
                int curr_diff = Math.abs(sum-k);
                
                //track the closer
                if(curr_diff < min){
                    min = curr_diff;
                    res.clear();
                    res.add(arr[l]); res.add(arr[h]);
                }
                //3 case
                if(sum>k)
                h--;
                
                else if(sum < k){
                    l++;
                }
                
            //   else if(sum==k)
                else
                return res;
            }
        return res;
    }
}

// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int k) {
        // code here
        int n = arr.length;
        List<Integer>  res = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int a = Math.min(arr[i], arr[j]);
                int b = Math.max(arr[i], arr[j]);
                
                int sum=arr[i]+arr[j];
                int curr_diff = Math.abs(sum-k);
                
                //track the closer
                if(curr_diff < min){
                    min = curr_diff;
                    res.clear();
                    res.add(a); res.add(b);
                }
                
                if(curr_diff == min &&
                res.get(1) - res.get(0) < Math.abs(arr[i]-arr[j])  ){ // both pair are equally closer to target
                    res.clear();
                    res.add(a); res.add(b);
                }
            }
        }
        return res;
    }
}
