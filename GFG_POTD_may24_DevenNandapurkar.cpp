/* 
Author:- Deven Nandapurkar 

Date:- 24th may

Problem Link:- https://practice.geeksforgeeks.org/problems/5bfe93cc7f5a214bc6342709c78bc3dceba0f1c1/1

Problem:- There are N bowls containing cookies. In one operation, you can take one cookie from any of the non-empty bowls and put it into another bowl. 
          If the bowl becomes empty you discard it. You can perform the above operation any number of times. 
          You want to know the maximum number of bowls you can have with an identical number of cookies.

Note: All the non-discarded bowls should contain the identical number of cookies.

Difficulty:- Easy

Cpp solution below 👇👇
*/

class Solution {
  public:
    int getMaximum(int N, vector<int> &arr) {
        // code here
        
        /* 
           these are the two cases that we will be using to solve our problem. 
           n is a divisor of sum
           n <= N 
        */
        
        // int sum = 0; -> converted int to long due to test case limitations
        
        long sum = 0;
        
        for(int i : arr) 
            sum += i;
            
        for(int i = N; i > 0; i--) {
            if(sum % i == 0) 
                return i; 
        }
        
        return 0;
    }
};

// time complexity -> O(N) 
// space complexity -> O(1)
