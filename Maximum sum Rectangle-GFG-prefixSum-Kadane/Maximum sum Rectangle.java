Best video solution wiht kadande - https://youtu.be/Gg5PtJLnEkI

class Solution {
    public int maxRectSum(int mat[][]) {
        // code here
        int n = mat.length, m=mat[0].length,ans=Integer.MIN_VALUE;
    //traveres in sub matrixes
        for(int i=0; i<n; i++){
            
                int arr[]= new int[m];
                
                for(int j=i; j<n; j++){
                    
                    for(int x=0;x<m; x++){
                        arr[x]+= mat[j][x];
                    }
                    int curr_ans=kadane(arr);
                    ans=Math.max(ans, curr_ans);
                }
            }
            return ans;
    }
        
        int kadane(int arr[]){
            int n=arr.length;
            int sum=0,ans=Integer.MIN_VALUE;;
            for(int i=0; i<n ;i++){
                sum+= arr[i];
                 ans = Math.max(ans, sum);
                if(sum<0)
                sum=0;
            }
            return ans;
        }
};
