class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        Set<Integer> set = new TreeSet<>(); // by def -> asc
        for(int x : arr1)
        set.add(x);
        for(int x : arr2)
        set.add(x);
        
        for(int x : set)
        al.add(x);
        
        return al;
    }
}

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> al = new ArrayList<>();
        int i =0 ; int j= 0 ;
        while(i<n && j<m)
        {
            if(i>0 && arr1[i]==arr1[i-1]) //while
            {i++; continue; }
            
            if(j>0 && arr2[j]==arr2[j-1])
            {j++; continue; }
            
            if(arr1[i] < arr2[j])  { al.add(arr1[i]); i++;}
            
            else if(arr1[i] > arr2[j]) { al.add(arr2[j]); j++; }
            
            else
            {al.add(arr1[i]); i++; j++; }
            
        }
        //handling rem ele
        while(i<n){
            if(i>0 && arr1[i] !=arr1[i-1]){
                al.add(arr1[i]); 
            }
            i++; 
            
        }
        
        while(j<m){
              if( j>0  && arr2[j] !=arr2[j-1]){
                  al.add(arr2[j]);
              }
              j++;
        }
    
    return al;
    }
}
