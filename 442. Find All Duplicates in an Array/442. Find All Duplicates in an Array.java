class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
           ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int idx = Math.abs(arr[i]) - 1;

            if (arr[idx] < 0) {
                ans.add(Math.abs(arr[i]));
            } else {
                
                arr[idx] = -arr[idx]; 
            }
        }

        return ans;
    }
}
