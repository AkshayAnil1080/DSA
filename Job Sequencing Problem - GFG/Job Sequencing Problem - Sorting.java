
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
       //sorting all jobs according to decreasing order of profit.
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
    //   for(int i=0; i<arr.length; i++){
    //       System.out.print(arr[i].id +" "  + arr[i].deadline + " " + arr[i].profit);
    //          System.out.println();
    // //   3 1 40
    // //     4 1 30
    // //     1 4 20
    // //     2 1 10    
    //   }
        int max_profit=0; int total_job=0;
        //boolean array to keep track of free time slots. 
        boolean[] slot = new boolean[n];
        
        //iterating through all given jobs.
        for (int i=0; i<n; i++)
        { 
            //finding a free slot 
            // int j=Math.min(n, arr[i].deadline)-1; //for deadline >=n;
              for (int j=arr[i].deadline-1; j>=0; j--) 
            { 
                if (slot[j]==false) // free slot found
                { 
			        slot[j] = true;  // mark it occupied
			        max_profit+= arr[i].profit;
			        total_job++;
			        break; 
		        } 
	        } 
	    } 
	   return new int[]{total_job, max_profit};
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
