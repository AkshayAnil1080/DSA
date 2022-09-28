// https://practice.geeksforgeeks.org/problems/fitting-the-array1514/1

class Solution{
    
   
    // Function for finding maximum and value pair
    public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
          Arrays.sort(brr);
          
          for(int i =0; i<n; i++)
          {
              if(arr[i]>brr[i])
              return false;
              
          }
          return true;
    }
    
}
tc : O(nlogn)
  SC: O(1)
