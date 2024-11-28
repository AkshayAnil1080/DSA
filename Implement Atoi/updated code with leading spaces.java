class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1; // Default sign is positive
        int num = 0;

//Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
//check for a sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

//Convert digits to integer until a non-digit character is encountered
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

//Check for overflow/underflow before updating num
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

//Return the final result with the correct sign
        return sign * num;
    }
}
