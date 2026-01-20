Best video solution = https://youtu.be/OCBp3x_QQBo


  n,1
class Solution {
    public ArrayList<Integer> calculateSpan(int[] price) {
        int n = price.length;
        ArrayList<Integer> result = new ArrayList<>(n);
        ArrayDeque<Integer> st = new ArrayDeque<>();

        // First day span is always 1
        st.push(0);
        result.add(1);

        for (int i = 1; i < n; i++) {
            // Pop elements while current price is higher
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            int span = st.isEmpty() ? (i + 1) : (i - st.peek());
            result.add(span);

            st.push(i);
        }

        return result;
    }
}



n^2,1
class Solution {
    public ArrayList<Integer> calculateSpan(int[] price) {
        int n = price.length;
        ArrayList<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int span = 1;

            for (int j = i - 1; j >= 0; j--) {
                if (price[j] <= price[i]) {
                    span++;
                } else {
                    break;
                }
            }
            result.add(span);
        }

        return result;
    }
}

