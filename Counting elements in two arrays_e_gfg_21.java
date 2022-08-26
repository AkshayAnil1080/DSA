class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       Arrays.sort(arr2);
       ArrayList<Integer> al = new ArrayList<>();
       for( int i=0; i<arr1.length; i++)
       {
           al.add(fun(arr2, arr1[i], 0, n));
       }
       return al;
    }
     static int fun(int arr[] ,int target, int i, int j){
        if(i<j){
            int mid=(i+j)/2;
            if(arr[mid]<=target){
                return fun(arr,target,mid+1,j);
            }else{
                return fun(arr,target,i,mid);
            }
        }
        return i;
    }
    
}
// for eaech arr1[i], binary search for the index to be inserted in arr[2] and return low,
//2. TC: nlogn + m*logn
//SC :O(1)
