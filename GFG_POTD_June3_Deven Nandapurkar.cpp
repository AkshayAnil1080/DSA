/* 

Algorithm for solving the above problem:- 

    Find the sum of all elements of in individual stacks.

    If the sum of all three stacks is the same, then this is the maximum sum.

    Else remove the top element of the stack having the maximum sum among three of stacks. Repeat step 1 and step 2.


To make sum equal, we must remove some element from stack having more sum, and we can only remove from the top.

*/

/*
class Solution{
public:
    int maxEqualSum(int N1,int N2,int N3,vector<int> &S1,vector<int> &S2,vector<int> &S3){
        int x, y, z;
        // stores the sum of individual stack. 
        x =  y = z = 0;
        
        // Finding the initial sum of stack1.
        for(auto i : S1)
            x += i;
            
        // Finding the initial sum of stack2.
        for(auto i : S2)
            y += i;
            
        // Finding the initial sum of stack3. 
        for(auto i : S3)
            z += i;
         
        // these denote the top of the stack .
        int i, j, k;
        i = j = k = 0;
        
        
        while(i < N1 and j < N2 and k < N3){
            // when all the sum are equal.  
            if(x == y and y == z)
                return x;
            
            // when sum1 is the greatest of the 3.     
            if(x > y or x > z)
                x -= S1[i++];
               
            // when sum2 is the greatest
            if(y > x or y > z)
                y -= S2[j++];
              
            // when sum3 is the greatest.   
            if(z > x or z > y)
                z -= S3[k++];
        }
        
        return 0;
    }
};
*/ 

// alternate solution:- 

class Solution{
public:
    int maxEqualSum(int N1,int N2,int N3,vector<int> &S1,vector<int> &S2,vector<int> &S3){
    // code here
        // elements at the top of the stack
        int i=0, j=0, k=0; 
        
        // indicates sum of the stack. 
        int sum1=0,sum2=0,sum3=0;
        
        //  accumulate(): 
        // This function returns the sum of all the values lying in a range between [first, last] with the variable sum.
        
        sum1=accumulate(S1.begin(),S1.end(),sum1);
        sum2=accumulate(S2.begin(),S2.end(),sum2);
        sum3=accumulate(S3.begin(),S3.end(),sum3);
        
        while(i<N1 and j<N2 and k<N3) { // loop will run untill anyone of the stacks get empty. 
        
            if(sum1==sum2 and sum2==sum3)
                return sum1;
                
            else if(sum1<=sum2 and sum1<=sum3) {
                if(sum1<sum2) {
                    sum2-=S2[j];
                    j++;
                }
                if(sum1<sum3){
                    sum3-=S3[k];
                    k++;
                }
            }
            else if(sum2<=sum1 and sum2<=sum3){
                if(sum2<sum1){
                    sum1-=S1[i];
                    i++;
                }
                if(sum2<sum3){
                    sum3-=S3[k];
                    k++;
                }
            }
            else{
                if(sum3<sum2){
                    sum2-=S2[j];
                    j++;
                }
                if(sum3<sum1){
                    sum1-=S1[i];
                    i++;
                }
            }
        }
        return 0;
    }
};


// time complexity:- O(N)

// space complexity:- O(1)
