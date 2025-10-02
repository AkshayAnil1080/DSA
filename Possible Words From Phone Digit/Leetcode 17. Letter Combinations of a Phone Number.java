
Video link - https://www.youtube.com/watch?v=MfpxedsMX5M
class Solution {

private List<String> res;
    private String[] digitToLetters = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;  // Return empty list if input is empty
        }
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String digits, int index, StringBuilder path) {
        // Base case: if reached end of digits string, add current combination
        if (index == digits.length()) {
            res.add(path.toString());
            return;
        }

        // Get current digit as int
        int digit = digits.charAt(index) - '0';

        // Skip digits 0 and 1 since they have no letter mappings
        if (digit < 2 || digit > 9) {
            backtrack(digits, index + 1, path);
            return;
        }

        // Get corresponding letters for current digit
        String letters = digitToLetters[digit];

        // For each letter, append to path, recurse for next digit, then backtrack
        for (char ch : letters.toCharArray()) {
            path.append(ch);
            backtrack(digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
