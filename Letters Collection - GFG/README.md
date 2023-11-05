Letters Collection
EasyAccuracy: 54.24%Submissions: 1K+Points: 2
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!  

banner
The Postmaster wants to write a program to answer the queries regarding letter collection in a city. A city is represented as a matrix mat of size n*m. Each cell represents a house and contains letters which are denoted by a number in the cell. The program should answer q queries which are of following types:
1 i j : To sum all the letters which are at a 1-hop distance from the cell (i,j) in any direction
2 i j : To sum all the letters which are at a 2-hop distance from the cell (i,j) in any direction 
The queries are given in a 2D matrix queries[][].
In one hop distance postmaster can go to any of [(i-1,j-1), (i-1,j), (i-1,j+1), (i,j-1), (i,j+1), (i+1,j-1), (i+1,j), (i+1,j+1)] from (i,j). 

Example 1:

Input: 
n = 4, m = 5
mat = {{1, 2, 3, 4, 10}, 
       {5, 6, 7, 8, 10}, 
       {9, 1, 3, 4, 10}, 
       {1, 2, 3, 4, 10}}
q = 2
queries = {{1 0 1}, 
           {2 0 1}}
Output: 
22 29
Explaination: 
For the first query sum is 1+5+6+7+3 = 22. 
For the second query sum is 9+1+3+4+8+4 = 29.
Example 2:

Input: 
n = 6, m = 6
mat = {{ 1,  2,  3,  4,  5,  6}, 
       { 7,  8,  9, 10, 11, 12}, 
       {13, 14, 15, 16, 17, 18}, 
       {19, 20, 21, 22, 23, 24},
       {25, 26, 27, 28, 29, 30},
       {31, 32, 33, 34, 35, 36}}
q = 1
queries = {{2 3 2}}
Output: 
336
Explaination: 
The first query sum is 7+8+9+10+11+17+23+29+35+34+33+32+31+25+19+13 = 336. 
Your Task:
You do not need to read input or print anything. Your task is to complete the function matrixSum() which takes n, m, mat, q and queries as input parameters and returns a list of integers where the ith value is the answers for ith query.

Expected Time Complexity: O(q)
Expected Auxiliary Space: O(q)

Constraints:
1 ≤ n, m ≤ 103
0 ≤ mat[i][j] ≤ 107
1 ≤ q ≤ 105
1 ≤ q[i][0] ≤ 2
0 ≤ q[i][1] < n
0 ≤ q[i][2] < m

Topic Tags
MatrixCPPData Structures
