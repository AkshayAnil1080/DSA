# Number Of Islands
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given a <strong>n,m</strong> which means the row and column of the 2D matrix and an array of &nbsp;size k denoting the number of operations. Matrix elements is 0 if there is water or 1 if there is land. Originally, the 2D matrix is all 0 which means there is no land in the matrix. The array has k operator and each operator has two integer A[i][0], A[i][1] means that you can change the cell&nbsp;matrix[A[i][0]][A[i][1]] from sea to island. Return how many island are there in the matrix after each operator.You need to return an array of size <strong>k</strong>.<br>
<strong>Note :&nbsp;</strong>An island means group of 1s such that they share a common side.</span></p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> n = 4
m = 5
k = 4
A = {{1,1},{0,1},{3,3},{3,4}}</span>

<span style="font-size:18px"><strong>Output:</strong> 1 1 2 2
<strong>Explanation:</strong>
0.  00000
    00000
    00000
    00000
1.  00000
    01000
    00000
    00000
2.  01000
    01000
    00000
    00000
3.  01000
    01000
    00000
    00010
4.  01000
    01000
    00000
    00011</span></pre>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> n = 4
m = 5
k = 4
A = {{0,0},{1,1},{2,2},{3,3}}</span>

<span style="font-size:18px"><strong>Output:</strong> 1 2 3 4
<strong>Explanation:</strong>
0.  00000
    00000
    00000
    00000
1.  10000
    00000
    00000
    00000
2.  10000
    01000
    00000
    00000
3.  10000
    01000
    00100
    00000
4.  10000
    01000
    00100
    00010</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function numOfIslands() which takes an integer n denoting no. of rows in the matrix, an integer m denoting the number of columns in the matrix and a 2D array of size k denoting&nbsp; the number of operators.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(m * n)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(m * n)</span></p>

<p><strong><span style="font-size:18px">Constraints:</span></strong></p>

<p><span style="font-size:18px">1 &lt;= n,m &lt;= 100<br>
1 &lt;= k &lt;= 1000</span></p>
</div>