class Solution{
public:
	// Function to check if the
	// Pythagorean triplet exists or not
	bool checkTriplet(int arr[], int n) {
	     int max = 0;

        // Find the maximum element
        for (int i = 0; i < n; i++) {
            max = std::max(max, arr[i]);
        }
        max = max * max;

        std::vector<int> freq(max + 1, 0);

        // Increase the frequency of array elements 
        for (int i = 0; i < n; i++) {
            freq[arr[i] * arr[i]]++;
        }

        // for all possible a
        for (int i = 1; i <= max; i++) {
            // If a is not there
            if (freq[i] == 0) {
                continue;
            }

            // for all possible b
            for (int j = 1; j <= max; j++) {
                // If there is no b or if a and b are the same and there is only one a
                if (freq[j] == 0 || (i == j && freq[i] == 1)) {
                    continue;
                }

                // Now we have the possibility of a and b, evaluate c, and check if it is present
                int c = i + j;
                if (c > max) {
                    continue;
                }
                if (freq[c] > 0) {
                    return true;
                }
            }
        }
        return false;
	}
};
