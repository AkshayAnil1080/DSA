https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1
TC: O(n) + O(n)

class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        
        ArrayList <Integer> res = new ArrayList<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
      
        
        int i = 0;
        
        //i first k elements 
        for(i = 0; i< k ; i++)
        {
            
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
              dq.pollLast();
            
            //adding new element at back of deque.  
            dq.add(i);
        }
        
        //iterating over the rest of the elements.
        for(i=k ; i < n; i++)
        {
            //the element at the front = largest ele of prev win.
             res.add(arr[dq.peek()]);
            
            
            //removing the elements which are out of this window.
            while(!dq.isEmpty() && (dq.peekFirst() <= i-k))
               dq.pollFirst();
            
            /// removing the indexes of ele which is not greater than the processing ele.
            while(dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();
            
            //adding the processed ele 
            dq.add(i);
        }
        
       //last wind ans.
        res.add(arr[dq.peek()]);
       
        return res;
    }
}
