cimpress

Input: mat[4][4] = { {10, 20, 30, 40},
                     {15, 25, 35, 45},
                     {27, 29, 37, 48},
                     {32, 33, 39, 50}}
target = 37

//given - sorted row and column  : binary Search - 
//Brute Force
n - rows and m - col 
TC: O(n*m) ,
SC: O(1)


boolean findTarget(int[][] mat, int target){
    int n = mat[][].length;
    int m = mat[0].length;
    
    int i=0, j=m-1;
    while(i<n && j>=0){ 
        if(mat[i][j] == target)
        return true;
        
       else if(mat[i][j] < target)
        i++;
        
        else
        j--;
      }
      return false;
}




{0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1} 
//fill array with 1
//any 0 with 1 - only if adj is 1


int maxItr(int arr[]){

    int ans = Integer.MIN_VALUE;
    for(int i=0; i< arr.length; i++){
        if(arr[i]==0){
            int st=i;
            while(arr[i]==0){
                i++;
                }
            int curr_ans=Integer.MIN_VALUE;
            if((st-1)>=0 && arr[st-1]==1 && arr[i]==1)
            curr_ans = Math.max(curr_ans, (i-st+1)/2;
            
            else if(arr[st-1]!=1 || arr[i]!=1){
             curr_ans = (i-st+1); 
             }
             ans = Math.max(ans, curr_ans);
            
         
         }
       }
       return ans;
 
}


