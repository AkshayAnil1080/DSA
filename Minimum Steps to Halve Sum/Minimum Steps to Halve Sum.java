
Best Video Solution with Live Coding: https://youtu.be/R8m5R-wP6gY
LIKE | SHARE | SUBSCRIBE

  
nlogn , n
class Solution {
    public int minOperations(int[] arr) {
        // code here
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum=0;
        for(int x : arr){
              sum+=x;
              pq.add((double)x);
        }
      
         
        double target = sum/2;
        int times=0;
       while(sum>target){
           double valueToDecrease = pq.poll();
           double newDecresedValue = valueToDecrease/2;
           
           sum-=newDecresedValue;
           pq.add(newDecresedValue);
           times++;
           
       }
       return times;
    }
}
