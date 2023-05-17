/*
Author:- Deven Nandapurkar. 

Date:- 17th May. 

Problem:- There is a rectangular path for a Train to travel consisting of n rows and m columns. 
The train will start from one of the grid's cells and it will be given a command in the form of string s consisting of characters L, R, D, U. 
Find if it is possible to travel the train inside the grid only.

Problem Link:- https://practice.geeksforgeeks.org/problems/trace-path3840/1 

Difficulty Level:- Easy. 

Cpp solution below 👇👇
*/

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

// time complexity:- O(n) 

// space complexity:- O(1) 
