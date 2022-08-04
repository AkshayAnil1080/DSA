class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
     ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for( int i=0; i<numCourses; i++)
        {
            al.add(new ArrayList<>());
        }
        for( int i=0; i<pre.length; i++){
            al.get(pre[i][1]).add(pre[i][0]);
        }
return topoSort(numCourses, al);
    }
  int[]  topoSort(int num,  ArrayList<ArrayList<Integer>> al)
    {
       int ans[] =  new int[num];
      int k=0;
      int [] indegree = new int[num];
      
        for(int i=0; i<num; i++){
            {
                for( int u : al.get(i))
                    indegree[u]++;
            }
        }
       
        //2. 
      Queue<Integer> q = new LinkedList<>();
      for( int i =0; i<num ;i++){
          if(indegree[i]==0)
              q.add(i);
      }
      int count=0;
      while(!q.isEmpty()){
          int u =q.poll(); ans[k++]=u;
          for( int j :al.get(u)){
              if(--indegree[j]==0)
                  q.add(j);   
          }
         count++; 
      }
      if(count!=num)
      {
          return new int[0];
      }
      return ans;
    }
    
}