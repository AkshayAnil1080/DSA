
Try it Yourself

GFG - https://www.geeksforgeeks.org/problems/tricky-subset-problem1557/1
Live code here with me - 
https://youtu.be/9WeHf-KvzHE


class Solution {
    public boolean isPossible(int[] arr, int s, int x) {
        // code here
    //empty subset
        if(x==0)
        return true;
        
        //if number given on paper exceed x - no sense to soleve further
        if(s>x){
            return false;
        }
        
        //3 break the sequence one newNumber >x
        ArrayList<Long> num = new ArrayList<>();
        num.add((long)s);
        long currSum=s;
        for(int i=0; i<arr.length ;i++){
            long newNum = currSum+arr[i];
            
            if(newNum>x)
            break;
            
            num.add(newNum);
            currSum+=newNum;
        }
        
        //4 greedily process form largest number to smallest.
        long target =x;
        for(int i =num.size()-1; i>=0; i--){
            if(num.get(i) <=target)
                target -= num.get(i);
        }
        
        return target==0 ? true: false;
        
    }
}
