class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq  = new PriorityQueue<>(); // min heap
        for(int i=0; i<n; i++)
    {
        pq.add(arr[i]);
        
    }
    if(n==1) return 0;
    long sum =0;
   
     for(int i=0; i<n-1; i++)
     {
         
          long a = pq.poll();
           long b = pq.poll();
         sum = sum + (a+b);
         pq.add(a+b);
         
     }
     
    return sum;
    }
}
