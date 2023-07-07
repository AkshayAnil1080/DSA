
// java m1 - o(m+n+(m+n)log(m+n) +(m+n) ) - o((m+n)log(m+n)) 
SC:O(m+n)
 long arr3[] = new long[n+m];
        int k=0;
        for(long x : arr1)
        arr3[k++] =x;
        for(long x : arr2)
        arr3[k++]=x;
        
        Arrays.sort(arr3);
        for(int i=0; i<n; i++)
        arr1[i] = arr3[i];
        
        for(int i=0; i<m; i++)
        {
            arr2[i] = arr3[n+i];
        }

m2 - two ptr o(m+n), O(m+n)


class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
         long arr3[] = new long[n+m];
        int i = 0, j = 0, k = 0;
    while (i<n && j <m)
    {
        if (arr1[i] < arr2[j])
            arr3[k++] = arr1[i++];
        else
            arr3[k++] = arr2[j++];
    }
 
    while (i < n)
        arr3[k++] = arr1[i++];
 
    while (j < m)
        arr3[k++] = arr2[j++];
        
        for( i=0; i<n; i++)
        arr1[i] = arr3[i];
        
        for( i=0; i<m; i++)
        arr2[i] = arr3[n+i];
    }
}

m3 - O(max(n,m) + nlogn + mlogm)  - nlong + mlogm
SC: O(1)
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
         int i = n-1;
        int j=0;
        while(i>=0 && j<m)
        {
        if(arr1[i] <=arr2[j])
        break;
        
        else
        {
            long temp = arr1[i];
            arr1[i] =arr2[j];
            arr2[j] =temp;
            i--; j++;
        }
       
        }
         Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
c++
lass Solution{
    public:
        //Function to merge the arrays.
        void merge(long long arr1[], long long arr2[], int n, int m) 
        { 
             int i = n - 1;
    int j = 0;

    while (i >= 0 && j < m)
    {
        if (arr1[i] <= arr2[j])
        {
            break;
        }
        else
        {
            swap(arr1[i], arr2[j]);
            i--;
            j++;
        }
    }

    sort(arr1, arr1 + n);
    sort(arr2, arr2 + m);
        } 
};
m4 - gap method o ((n+m)*log(n+m)), O(1)
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int l = n+m;
        int gap = (l/2) + (l%2);
        while(gap>0)
        {
            int st=0; int end=st+gap;
            while(end<l)
            {
                // st in arr1 and end ina arr2
                if(st<n && end>=n)
                {
                    swap(arr1, arr2, st, end-n);
                }
                // st in arr2 and end in arr2
                else if(st>=n)
                swap(arr2, arr2, st-n, end-n);
                //st in arr1 and end in arr1
                else
                swap(arr1, arr1, st, end);
                
                st++; end++;
            }
            if(gap==1) break;
            gap = (gap/2) + (gap%2);
            
        }
    }
    static void swap( long arr1[], long arr2[], int x1, int x2)
    {
        if(arr1[x1] > arr2[x2])
        {
            long t = arr1[x1]; arr1[x1] = arr2[x2] ; arr2[x2] = t;
        }
    }
}

c++
class Solution{
    public:
        //Function to merge the arrays.
        void merge(long long arr1[], long long arr2[], int n, int m) 
        { 
         int l = n + m;
        int gap = (l / 2) + (l % 2);

        while (gap > 0)
        {
            int st = 0;
            int end = st + gap;
    
            while (end < l)
            {
                // st in arr1 and end in arr2
                if (st < n && end >= n)
                {
                    if(arr1[st]> arr2[end - n])
                    swap(arr1[st], arr2[end - n]);
                }
                // st in arr2 and end in arr2
                else if (st >= n)
                {
                    if(arr2[st-n] > arr2[end-n])
                    swap(arr2[st - n], arr2[end - n]);
                }
                // st in arr1 and end in arr1
                else
                {
                    if(arr1[st] >  arr1[end])
                    swap(arr1[st], arr1[end]);
                }
    
                st++;
                end++;
            }
    
            if (gap == 1)
            {
                break;
            }
    
            gap = (gap / 2) + (gap % 2);
            } 
            }
};
