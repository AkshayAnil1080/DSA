//find the substring with highest ASCII values
https://practice.geeksforgeeks.org/problems/save-your-life4601/1

//  kadanes - 
// and store both array in map to take reassigned vales in O(1)
 class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        Map<Character,Integer> map = new HashMap<>();  // O(1) since constrain is 52
        for(int i=0; i<n; i++)
        {
            map.put(x[i],b[i]);
        }
      int max = Integer.MIN_VALUE;
      int sum=0;
      
      StringBuilder ans = new StringBuilder();
      
      StringBuilder temp = new StringBuilder();
      
        for(int i =0; i<w.length(); i++)
        {
            Character ch = w.charAt(i);
            sum += map.containsKey(ch) ? map.get(ch) : ch;
            temp.append(ch);
            if(sum>max)
            {
                max=sum; // and update ans;
                ans = new StringBuilder(temp);
            }
            if(sum<0)
            {
                sum=0;
                temp = new StringBuilder();
                
            }
           
                
        }
        return ans.toString();
    }
}
