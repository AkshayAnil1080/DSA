
class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
        int a[][] = new int[n][3];
        for(int i=0; i<n; i++){
            a[i][0]=arr[i];
            a[i][1]=brr[i];
            a[i][2] = Math.abs(arr[i] - brr[i]);
        }
        
        //sort acc to a[i][2];
        Arrays.sort(a, (p,q) -> q[2] - p[2]);
        
        long res=0;
        for(int i=0; i<n; i++){
            //bc
            if(x==0) // arr is empty
            res+= a[i][1];
            else if(y==0) // brr is empty
            res+=a[i][0];
            
            else{//take the larger value
                if(a[i][0]>=a[i][1]){
                res+= a[i][0]; x--;
                }
                else{
                     res+= a[i][1]; y--;
                }
            }
        }
        return res;
    }
}
