
Best solution with live coding and explanation - https://youtu.be/Hz7Nz37GkCo
nlogK, k

class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i <k; i++){
            pq.add(arr[i]);
        }
        int j;
        for( j=k;j<n;j++){
            pq.add(arr[j]);
            arr[j-k] = pq.poll();
        }
        //
        while(!pq.isEmpty()){
             arr[j-k] = pq.poll();
             j++;
        }
    }
}


