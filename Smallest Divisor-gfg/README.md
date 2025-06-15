
Problem Link:
https://www.geeksforgeeks.org/problems/smallest-divisor/1
video solution link -  https://youtu.be/veQL9eFoBA8


Smallest Divisor
Difficulty: MediumAccuracy: 50.74%Submissions: 21K+Points: 4Average Time: 25m
Given an integer array arr[] and an integer k (where k ≥ arr.length), find the smallest positive integer divisor such that the sum of the ceiling values of each element in arr[] divided by this divisor is less than or equal to k.

Examples:

Input: arr[] = [1, 2, 5, 9], k = 6
Output: 5
Explanation: 5 is the smallest divisor having sum of quotients (1 + 1 + 1 + 2 = 5) less than or equal to 6.
Input: arr[] = [1, 1, 1, 1], k = 4
Output: 1
Explanation: 1 is the smallest divisor having sum of quotients (1 + 1 + 1 + 1 = 4) less than or equal to 4.
Constraints:
1  ≤  arr.size()  ≤ 105
1  ≤  arr[i]  ≤ 106
arr.size()  ≤ k  ≤ 106

Expected Complexities
Time Complexity: O(n * log(max(arr[i])))
Auxiliary Space: O(1)
Topic Tags
Binary SearchArraysAlgorithms
Related Articles
Smallest Divisor For Sum Constraint In Array Division
