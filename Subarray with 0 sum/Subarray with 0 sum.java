//cpp
class Solution{
    public:
    //Complete this function
    //Function to check whether there is a subarray present with 0-sum or not.
    bool subArrayExists(int arr[], int n)
    {
       unordered_set<int> set;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            set.insert(sum);
            sum = sum + arr[i];

            if (set.find(sum) != set.end())
                return true;
        }
        return false;
    }
};

//java

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int a[],int n)
    {
         Set<Integer>  set  = new HashSet<>();
        int sum = 0 ;
        for( int i= 0 ; i<n  ; i++)
        {
            set.add(sum);
            sum = sum + a[i];
            
            if(set.contains(sum))
            return true;
        }
        return false;
    }
}
