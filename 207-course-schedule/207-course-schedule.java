class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
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
  boolean  topoSort(int num,  ArrayList<ArrayList<Integer>> al)
    {
      //1
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
      //3.
      int count=0;
      while(!q.isEmpty()){
          int u =q.poll();
          for( int j :al.get(u)){
              if(--indegree[j]==0)
                  q.add(j);   
          }
         count++; 
      }
      if(count!=num) // cycleexists not poss to finish all courses
          return false;
      
      return true;
      
    }
    // tc : O(V+E) same  BFS
}