class Pair implements Comparable<Pair>
{ 
    int s, e; 
    Pair(int s, int e){
        this.s = s;
        this.e = e;
    }
    public int compareTo(Pair a)  
    { return this.s - a.s; }  // sort accordin to start time
};

class Solution
{
    public int[][] merge(int[][] Intervals)
    {
        // Code here // Code here
      Pair  arr[] = new Pair[Intervals.length];
    //   int arr[]= new int[]
    

    for( int i =0; i<Intervals.length; i++)
        arr[i]  = new Pair(Intervals[i][0], Intervals[i][1]);

    Arrays.sort(arr);
    int res = 0;
    
    for( int i =1; i<Intervals.length; i++){
        if(arr[i].s <= arr[res].e){
            arr[res].e = Math.max(arr[i].e, arr[res].e);
            arr[res].s = Math.min(arr[i].s , arr[res].s);
        }
        else {
            res++; arr[res]=arr[i];
        }
    }
    int al[][] = new int[res+1][2];
        for(int i =0; i<=res;i++){
            al[i][0]= arr[i].s;
            al[i][1] = arr[i].e;
        }

    return al;
    }
}
