//ProblemLink:  https://practice.geeksforgeeks.org/problems/max-length-chain/1
// Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice


class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       
       Arrays.sort(arr, (a,b) -> a.y-b.y);
       int b=arr[0].y;
       int ans=1; // 1 ele will itselg be the anwer if only first ele was present.
       
       for( int i =1;i<n ;i++)
       {
           int c =arr[i].x;
           if(c>b)
           {
               b=arr[i].y;  // update b with curr y.
               ans++;
           }
       }
       return ans;
    }
}

//O(nlogn) , O(1)
