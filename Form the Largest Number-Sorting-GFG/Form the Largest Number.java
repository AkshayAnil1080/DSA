
video link - best solution ever - https://youtu.be/sRI34AV3OX4
problem link - https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1

class Solution {
    public String findLargest(int[] arr) {
        // code here
        // Step 1: Convert int[] to String[]
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        // Step 2: Sort using custom comparator
        Arrays.sort(strArr, (x, y) -> (y + x).compareTo(x + y));

        // Step 3: Edge case — if largest number is "0", return "0"
        if (strArr[0].equals("0")) {
            return "0";
        }

        // Step 4: Join and return result
        return String.join("", strArr);
    }
}
