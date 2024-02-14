// check if it euclerian circuit -> connected and  
// count of odd degree vetices ==0 ( all vertices should have even degree)
class Solution
{
    public int isPossible(int[][] paths)
    {
        
        for(int i=0; i<paths.length; i++){
            int cnt=0;
            for(int j =0; j<paths[i].length; j++){
                cnt += paths[i][j];
            }
            if(cnt%2!=0)
            return 0;
        }
        return 1;
    }
}
