
Video link - https://youtu.be/MfpxedsMX5M

class Solution {
    
    ArrayList<String> res;
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        res = new ArrayList<>();

        // mapping numbers with letters
        String[] NumtoCharMap = {"", "", "abc", "def", "ghi", "jkl",
                           "mno", "pqrs", "tuv", "wxyz"};
                           
        StringBuilder path = new StringBuilder();

        backtrack(arr, 0, path, NumtoCharMap);
        return res;
    }
      void backtrack(int[] arr, int idx, StringBuilder path,
                                 String[] NumtoCharMap) {
        if (idx == arr.length) {
            res.add(path.toString());
            return;
        }
        int digit = arr[idx];


        if(digit>=2 && digit<=9){
            // Place all possible letters for this digit
            for (char ch : NumtoCharMap[digit].toCharArray()) {
                path.append(ch);
                backtrack(arr, idx + 1, path, NumtoCharMap);
    
                // Backtracking to previous state
                path.deleteCharAt(path.length() - 1);
            }
        }
        
        else {
        // Skip appending any character, just move to next index
        backtrack(arr, idx + 1, path, NumtoCharMap);
        }
    }
}Stin
