
// m1 : java
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
        boolean vis[] =  new boolean[n+1];
        
        for( int i = 0; i <n; i ++)
        {
            if(arr[i]>0 && arr[i]<=n)
            {
                vis[arr[i]]  = true;
            }
        }
        
        for( int i = 1 ; i<=n ;i++)
        {
            if(!vis[i])
            return i;
            
        }
        
        return n+1;
    }
    
   
}
m2 java
 static int missingNumber(int A[], int n)
    {
        int j = 0;
        for(int i = 0; i < n; i++)
        {
           if (A[i] <= 0)  
           {
                int t = A[i];
               A[i] = A[j];
               A[j] = t;
               j++;  
           }
        } 
        // arr2 to store only the +ve integer.
         int N= n-j;
        int arr2[] = new int[N];
        int k=0;
        for(int i=j;i<n;i++)
        {
            arr2[k++] = A[i];
        }
        // for(int x: arr2)
        // System.out.println(x+" ");
        
       // final logic
       for(int i = 0; i < N; ++ i) {
        //   int corrPos = A[i]-1;
        //ignoringm num > N 
           if(Math.abs(arr2[i]) -1 < N && arr2[Math.abs(arr2[i])-1]>0)
           {
               arr2[Math.abs(arr2[i])-1] = -arr2[Math.abs(arr2[i])-1];
           }
                
       }
       for (int i = 0; i < N; ++i) {
            if (arr2[i]>0) {
                return i + 1;
            }
        }

        return N + 1;
    }
}
// m2 c++
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] <= 0) {
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
                j++;
            }
        }
        
        int N = n - j;
        int arr2[N];
        int k = 0;
        for (int i = j; i < n; i++) {
            arr2[k++] = A[i];
        }
        
        for (int i = 0; i < N; ++i) {
            if (abs(arr2[i]) - 1 < N && arr2[abs(arr2[i]) - 1] > 0) {
                arr2[abs(arr2[i]) - 1] = -arr2[abs(arr2[i]) - 1];
            }
        }
        
        for (int i = 0; i < N; ++i) {
            if (arr2[i] > 0) {
                return i + 1;
            }
        }
        
        return N + 1;
// m3 java
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int A[], int n)
    {
      
    for(int i = 0; i < n; ++ i) {
            while(A[i] >= 1 && A[i] <= n && A[i] != A[A[i]-1])
                // swap(A[i], A[A[i] - 1]);
                {
                    int t = A[A[i] - 1]; A[A[i] - 1] = A[i];  A[i]=t;
                }
        }
        
        for(int i = 0; i < n; ++ i)
            if(A[i] != i + 1)
                return i + 1;
        
        return n + 1;
    }
}

// m3 c++
for(int i = 0; i < n; ++ i) {
            while(A[i] >= 1 && A[i] <= n && A[i] != A[A[i]-1])
                swap(A[i], A[A[i] - 1]);
        }
        
        for(int i = 0; i < n; ++ i)
            if(A[i] != i + 1)
                return i + 1;
        
        return n + 1;
