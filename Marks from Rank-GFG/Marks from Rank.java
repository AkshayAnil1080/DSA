
Explanation of all approaches by me on Utube - https://youtu.be/wjn_gtExCnY
try before watching the vide  https://www.geeksforgeeks.org/problems/find-marks-from-ranks/1


brute force
class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<l.length; i++){
            for(int x = l[i]; x<=r[i] ;x++)
            al.add(x);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : rank){
            ans.add(al.get(x-1));
        }
        
        return ans;

    }
}

  // optimal - time spcce trade off
  class Solution {
     int pSum[];
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        // code here
        int n = l.length;
         pSum  = new int[n];
        pSum[0] = r[0]-l[0]+1; /// 
        for(int i=1; i<n ;i++){
            pSum[i] = pSum[i-1] + (r[i]-l[i]+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        // traverse in rank
        for(int i=0 ;i< rank.length; i++){// n
            int idx = helper(0,n-1,rank[i]); // log n

            int rankFromLastIdx = pSum[idx]-rank[i];
            ans.add(r[idx] -  rankFromLastIdx);
        }
        return ans;
    }
    int helper(int low, int high, int x){
        while(low<high){
            int m  = low + (high-low)/2;

            if(pSum[m] < x){
                low =m+1;
            }
            else
            high =m;
        }
        return low;
    }

}
