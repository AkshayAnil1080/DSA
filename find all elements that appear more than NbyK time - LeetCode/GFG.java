// Problem : https://www.geeksforgeeks.org/problems/count-element-occurences/1

class Pair {
        int e; // Element
        int c; // Count
        Pair(int e, int c){
            this.e = e;
            this.c =c;
        }
    }
    
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
      Pair[] temp = new Pair[k - 1];
        for (int i = 0; i < k - 1; i++)
            temp[i] = new Pair(Integer.MIN_VALUE,0);

        
      //2 traversing in input arr
        for (int i = 0; i < n; i++) {
            int j;
 
            //if arr[i] already in temp, incerase count
            for (j = 0; j < k - 1; j++) {
                if (temp[j].e == arr[i]) {
                    temp[j].c += 1;
                    break;
                }
            }
 
             //if arr[i] not in temp, place it first availble position in temp
             //if all postions filled, decrease freq of all by 1.
            if (j == k - 1) {
                int l;
 
                for (l = 0; l < k - 1; l++) {
                    if (temp[l].c == 0) {
                        temp[l].e = arr[i];
                        temp[l].c = 1;
                        break;
                    }
                }
 
                 //if all postions filled, decrease freq of all by 1.
                if (l == k - 1)
                    for (l = 0; l < k - 1; l++)
                        temp[l].c -= 1;
            }
        }
 
        //check if potential candiates actually have freq more than n/k;
         int ans=0;
        for (int i = 0; i < k - 1; i++) {
 
            int ac = 0;
            for (int j = 0; j < n; j++)
                if (arr[j] == temp[i].e)
                    ac++;
 
            if (ac > n / k)
                ans++;
        }
        return ans;
    }
}



// class Solution 
// {
//     //Function to find all elements in array that appear more than n/k times.
//     public int countOccurence(int[] arr, int n, int k) 
//     {
//         HashMap<Integer,Integer> map=new HashMap<>();
     
//         int count=0;
      
//         for(int i=0;i<n;i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
        
//         for(Map.Entry<Integer,Integer> element:map.entrySet()){
           
//             if(element.getValue()>n/k) count++;
//         }
      
//         return count;
//     }
// }
