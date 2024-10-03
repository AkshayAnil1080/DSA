Majority Vote
  https://www.geeksforgeeks.org/problems/majority-vote/1
n,1
class Pair {
        int e; // Element
        int c; // Count
        Pair(int e, int c){
            this.e = e;
            this.c =c;
        }
    }
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> arr) {
        // Your code goes here.
        
        int k = 3, n = arr.size();
        // 1. Create a temp array of size k-1 to store possible candidates
        Pair[] temp = new Pair[k - 1];
        for (int i = 0; i < k - 1; i++)
            temp[i] = new Pair(Integer.MIN_VALUE, 0);

        // 2. Traverse the input array
        for (int i = 0; i < n; i++) {
            int j;

            // If arr[i] is already in temp, increase its count
            for (j = 0; j < k - 1; j++) {
                if (temp[j].e == arr.get(i)) {
                    temp[j].c += 1;
                    break;
                }
            }

            // If arr[i] is not in temp, place it in the first available position in temp
            if (j == k - 1) {
                int l;

                for (l = 0; l < k - 1; l++) {
                    if (temp[l].c == 0) {
                        temp[l].e = arr.get(i);
                        temp[l].c = 1;
                        break;
                    }
                }

                // If all positions are filled, decrease the frequency of all by 1
                if (l == k - 1) {
                    for (l = 0; l < k - 1; l++) {
                        temp[l].c -= 1;
                    }
                }
            }
        }

        // 3. Check if the potential candidates actually have a frequency more than n/k
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k - 1; i++) {
            int ac = 0;
            for (int j = 0; j < n; j++) {
                if (arr.get(j) == temp[i].e) {
                    ac++;
                }
            }

            if (ac > n / k) {
                ans.add(temp[i].e);
            }
        }

        // 4. Return the answer sorted in increasing order or -1 if no majority element
        if (ans.isEmpty()) {
            ans.add(-1);
        } else {
            Collections.sort(ans);
        }
        return ans;
    }
}
