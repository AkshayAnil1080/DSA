class Solution{
public:
    int isPossible(int n, int m, string s){
        // code here
        
        int dx = 0, dy = 0; // change in distnace
        
        int maxX = 0, maxY = 0, minX = 0, minY = 0;
        
        for(auto i : s) {
            if(i=='L') 
                --dy;
                
            else if(i=='R')
                ++dy;
                
            else if(i=='D')
                --dx;
                
            else 
                ++dx;
                
        
            maxX = max(dx, maxX);
            maxY = max(dy, maxY);
            
            minX = min(dx, minX);
            minY = min(dy, minY);
            
            // to cehck whether the train is going out of grid, if yes return false; 
            if(maxX - minX >= n || maxY - minY >= m)
                return 0;
        }
        
        // if no return true. 
        return 1; 
        
    }
};
