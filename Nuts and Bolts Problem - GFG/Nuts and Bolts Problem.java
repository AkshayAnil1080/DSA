class Solution {
    // Function to match pairs of characters from arrays a and b
    void matchPairs(int n, char nuts[], char bolts[]) {
        // Initialize an array c to store the count of different characters
        char arr[] = { '!', '#', '$' , '%', '&', '*', '?', '@' , '^'};
        HashSet<Character> set = new HashSet<>();  
        for(char ch : nuts){
            set.add(ch);
        }
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                nuts[k] = arr[i];
                bolts[k] = arr[i];
                k++;
            }
        }
    }
}
