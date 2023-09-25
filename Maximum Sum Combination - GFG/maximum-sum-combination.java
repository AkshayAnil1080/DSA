//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Integer> maxCombinations(int N, int c, int a[], int b[]) {
        // code here
        List<Integer> al = new ArrayList<Integer>();
        Arrays.sort(a); // Sorting array a in ascending order
        Arrays.sort(b); // Sorting array b in ascending order
        int n = a.length - 1, m = b.length - 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // Creating a priority queue
        pq.add(new Pair(a[n] + b[m], n, m)); // Adding the sum of last elements from both arrays to the priority queue
        Set<String> set = new HashSet<>(); // Creating a set to keep track of already visited indices
        set.add(n + " " + m); // Adding the indices of last elements to the set
        while (!pq.isEmpty()) { // Loop until the priority queue is empty
            Pair cur = pq.poll(); // Removing the element with the highest sum from the priority queue
            al.add(cur.v); // Adding the sum to the result list
            if (al.size() == c) break; // If we have enough elements in the result list, break the loop
            int x = cur.x, y = cur.y; // Getting the indices of the current element
            if (x - 1 >= 0 && !set.contains((x - 1) + " " + y)) { // If there is an element above the current element and it has not been visited
                set.add((x - 1) + " " + y); // Mark the element as visited
                pq.add(new Pair(a[x - 1] + b[y], x - 1, y)); // Add the sum of the element and the element above it to the priority queue
            }
            if (y - 1 >= 0 && !set.contains(x + " " + (y - 1))) { // If there is an element to the left of the current element and it has not been visited
                set.add(x + " " + (y - 1)); // Mark the element as visited
                pq.add(new Pair(a[x] + b[y - 1], x, y - 1)); // Add the sum of the element and the element to the left of it to the priority queue
            }
        }
        return al; // Return the result list
    }
    static class Pair implements Comparable<Pair> {
        int v, x, y;
        Pair(int v, int x, int y) {
            this.v = v; // Initialize the sum of the pair
            this.x = x; // Initialize the x coordinate of the pair
            this.y = y; // Initialize the y coordinate of the pair
        }
        public int compareTo(Pair p) { return p.v - this.v; } // Compare the sums of two pairs for priority queue ordering
    }
}