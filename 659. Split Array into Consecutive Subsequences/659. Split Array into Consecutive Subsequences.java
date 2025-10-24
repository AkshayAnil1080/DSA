Best Video Solution with Live Coding: https://youtu.be/iRiYRdyFty4
LIKE | SHARE | SUBSCRIBE

nlogn, n


  class Solution {

    public boolean isPossible(int[] arr, int k) {
        // Code here
        int n= arr.length;
          PriorityQueue<int[]> sequences = new PriorityQueue<>(
            (a,b) -> (a[0]==b[0]) ? (a[1]-b[1]) : (a[0]-b[0])
        );
        
        int idx=0;
        while(idx<n){
            if(sequences.isEmpty()){
                sequences.add(new int[] {arr[idx],1});
                idx++;
            }
            else{
                int curr[] = sequences.peek();
                if(arr[idx] == curr[0]){
                    //need to start a new ss
                    sequences.add(new int[] {arr[idx],1});
                    idx++;
                }
                else if( arr[idx] == curr[0]+1){
                    //extend the samllest ss
                    sequences.poll();
                    sequences.add(new int[]{arr[idx], curr[1]+1});
                    idx++;
                }
                else{
                    if(curr[1]<k)return false;
                     sequences.poll();
                }
            }
        }
        //final
        while(!sequences.isEmpty()){
            if(sequences.peek()[1] <k) return false;
            sequences.poll();
        }
        return true;
    }
}
