class Pair {
        int e; // Element
        int c; // Count
        Pair(int e, int c){
            this.e = e;
            this.c =c;
        }
    }
    
class Solution {
    public List<Integer> majorityElement(int[] arr) {
        
        int  k=3, n =arr.length;
        //1 Create a temp arr size k-1 to store poss cand
          
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
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k - 1; i++) {
 
            int ac = 0;
            for (int j = 0; j < n; j++)
                if (arr[j] == temp[i].e)
                    ac++;
 
            if (ac > n / k)
                ans.add(temp[i].e); // 
        }
        return ans;
    }
}
