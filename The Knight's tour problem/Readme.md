The Knight's tour problem
Difficulty: MediumAccuracy: 32.39%Submissions: 71+Points: 4
You are given a n × n chessboard with a Knight starting at the top-left corner (0, 0). Your task is to determine a valid Knight's Tour, where the Knight visits every square exactly once, following the standard movement rules of a chess Knight.

You have to return the order in which each cell is visited. If a solution exists, print the sequence of numbers representing the order of visited squares. If no solution is possible, return -1.

Note: You can return any valid ordering, if it is correct the driver code will print true else it will print false.

Examples:

Input: n = 5
Output: true
Explanation: A possible Knight's Tour in a 5x5 chessboard is given below where Each number represents the step at which the Knight visits that cell, starting from (0, 0) as step 0.
[[0, 11, 2, 17, 20],
 [3, 16, 19, 12, 7],
 [10, 1, 6, 21, 18],
 [15, 4, 23, 8, 13], 
 [24, 9, 14, 5, 22]]
Input: n = 4
Output: true
Explanation: For n = 4, it is not possible for a valid Knight's Tour so you have to return -1.
Constraints:
1 ≤ n ≤ 6

Expected Complexities
Topic Tags
RecursionBacktrackingPuzzles
