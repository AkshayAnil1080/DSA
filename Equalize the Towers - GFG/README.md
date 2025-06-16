
Problem Link  https://www.geeksforgeeks.org/problems/equalize-the-towers2804/1
Solution Video - https://youtu.be/xBu4f4-iQq4

Equalize the Towers
Difficulty: MediumAccuracy: 52.18%Submissions: 11K+Points: 4
You are given an array heights[] representing the heights of towers and another array cost[] where each element represents the cost of modifying the height of respective tower.

The goal is to make all towers of same height by either adding or removing blocks from each tower.
Modifying the height of tower (add or remove) 'i' by 1 unit costs cost[i].
Return the minimum cost to equalize the heights of all towers.

Examples:

Input: heights[] = [1, 2, 3], cost[] = [10, 100, 1000]
Output: 120
Explanation: The heights can be equalized by either "Removing one block from 3 and adding one in 1" or "Adding two blocks in 1 and adding one in 2". Since the cost of operation in tower 3 is 1000, the first process would yield 1010 while the second one yields 120.
Input: heights[] = [7, 1, 5], cost[] = [1, 1, 1]
Output: 6
Explanation: The minimum cost to equalize the towers is 6, achieved by setting all towers to height 5.
Constraints:
1 ≤ heights.size() = cost.size() ≤ 105
1 ≤ heights[i] ≤ 104
1 ≤ cost[i] ≤ 103

Expected Complexities
Time Complexity: O(n*log(max(height[i])))
Auxiliary Space: O(1)
Topic Tags
ArraysBinary SearchData StructuresAlgorithms
Related Articles
Minimize Cost Operation Equalize Tower Heights
