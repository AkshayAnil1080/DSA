class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
          // Your code here

        return ((s1+s1).indexOf(s2)>=0);
    }
    
}
