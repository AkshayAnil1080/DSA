class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> al = new ArrayList<Integer>();
        int l =0; int h=arr.length-1;
        
        while(h-l >=k)
        {
            if(Math.abs(arr[l]-x) > Math.abs(arr[h]-x))
               l++;
               
               else
               h--;
        }
        for( int i=l ;i<=h; i++)
        al.add(arr[i]);
               
        return al;
    }
}
               // binary search move from both end, jis side se diff kam waha se compact kro, until window len>=k  -> O(n)