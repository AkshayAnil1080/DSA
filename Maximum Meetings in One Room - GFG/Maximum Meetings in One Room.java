class Pair implements Comparable<Pair>
{ 
    int s, e, x;
    
    Pair(int s, int e, int x)
    {
        this.s = s;
        this.e = e;
         this.x = x;
    }
    
    public int compareTo(Pair a)  
    { return this.e - a.e; }
};
class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        Pair  arr[] = new Pair[N];
        
    for( int i =0; i<N; i++)
    {
        arr[i]  = new Pair(S[i], F[i], i+1);
    }
    Arrays.sort(arr);
    //   for( int i =0; i<N; i++)
    // System.out.println(arr[i].s + " " + arr[i].e + " " + arr[i].x + " ");
    
    int tym = arr[0].e;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0].x);
        for (int i = 1; i < N; i++) {
            if(arr[i].s > tym){
                ans.add(arr[i].x);
                tym = arr[i].e;
            }
        }
        Collections.sort(ans);
        return ans;
    
    }
}
