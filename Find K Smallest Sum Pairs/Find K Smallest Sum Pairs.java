Best Video Solution with Live Coding: https://youtu.be/h_RfV9NYihc
LIKE | SHARE | SUBSCRIBE


  klog, k
  class Pair {
    int i, j, sum;
    Pair(int i, int j, int sum) {
        this.i = i;
        this.j = j;
        this.sum = sum;
    }
}


class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.sum -b.sum);
       
       for(int i=0; i<Math.min(arr1.length,k); i++){
       pq.add(new Pair(i,0, arr1[i] + arr2[0]));
        }
    
    while(!pq.isEmpty() && k>0){
        Pair p = pq.poll();
        ArrayList<Integer> curr = new ArrayList<>();
        curr.add(arr1[p.i]);
         curr.add(arr2[p.j]);
         res.add(curr);
         
         k--;
         
         // push
         if(p.j + 1 < arr2.length){
              pq.add(new Pair(p.i, p.j + 1, arr1[p.i] + arr2[p.j + 1]));
         }
        
    }
    return res;

    }
}

