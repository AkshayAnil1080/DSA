class Solution {
    int parent[]=new int[26]; int ranks[]=new int[26];
    public boolean equationsPossible(String[] equations) {
        
        
        for(int i=0; i<26; i++)
        {
            parent[i]=i; ranks[i]=1;
        }
        for(String eqn : equations)
        {
            if(eqn.charAt(1)=='=')
            {
                union(eqn.charAt(0)-'a', eqn.charAt(3)-'a');
            }
        }
        for(String eqn : equations)
        {
            if(eqn.charAt(1)=='!')
            {
               int lx = find(eqn.charAt(0)-'a');
                 int ly = find(eqn.charAt(3)-'a');
                if(lx==ly) return false;
            }
        }
        
        return true;
    }
    
	 int find(int x)
	{
	     if(parent[x]==x)
            return x;
    
        parent[x] = find(parent[x]);
    
        return parent[x];
	    
	}


	void union(int x, int y)
	{
	    int x_rep = find(x);
	    int y_rep = find(y);
	    
	    if(x_rep==y_rep)
	        return;
	    
	    if(ranks[x_rep]<ranks[y_rep])
	        parent[x_rep] = y_rep;
	    
	    else if(ranks[y_rep]<ranks[x_rep])
	        parent[y_rep]=x_rep;
	    
	    else
	        {
	            parent[y_rep] = x_rep;
	            
	            ranks[x_rep]++;
	        }
	    
	    
	   
	}
}