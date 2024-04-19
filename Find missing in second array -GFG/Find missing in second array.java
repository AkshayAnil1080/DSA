class Solution
{
   
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
         ArrayList<Integer> al = new ArrayList<>();
         Set<Integer> set = new HashSet<>();
         for(int x : b){
             set.add(x);
         }
         for(int x: a){
             if(!set.contains(x))
             al.add(x);
         }
         return al;
    }
}

// class Solution
// {
   
//     ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
//     {
//          ArrayList<Integer> al = new ArrayList<>();
//          for(int i=0; i<n; i++){
//              int found=1;
//              for(int j=0; j<m; j++){
//                  if(a[i]==b[j]){
//                      found=0;
//                     break;
//                  }
//              }
//              if(found==1)
//              al.add(a[i]);
//          }
//          return al;
//     }
// }
